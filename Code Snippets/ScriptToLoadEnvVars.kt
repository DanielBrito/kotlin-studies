// Other stuff from build.gradle.kt

/*

variables.local.env

# GATEWAY
EXTERNAL_API=https://external.api
EXTERNAL_API_USERNAME=username
EXTERNAL_API_PASSWORD=password

*/

fun loadEnv(environment: MutableMap<String, Any>, file: File) {
  if(!file.exists()) {
    throw IllegalArgumentException("Failed to load envs from file: ${file.name} not found.")
  }

  file.readLines().forEach { line ->
    if(line.isBlank() || line.startsWith("#")) return@forEach

    line.split("=", limit = 2)
      .takeIf { it.size == 2 && !it[0].isBlank() }
      ?.run { Pair(this[0].trim(), this[1].trim()) }
      ?.run { environment[this.first] = this.second }
  }
}

tasks.withType<BootRun> {
  val config = runCatching {
    project.property("config").toString()
  }.getOrDefault("local")

  loadEnv(environment, file("variables.${config.env}"))

  args(
    "--spring.profiles.active=$config",
    "--info"
  )
}

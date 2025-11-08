class MyClass {
  private val myResource = javaClass
    .getResource("/path/to/resource/myresource.sql")
    ?.readText() ?: throw IllegalStateException("Resource not found")
}

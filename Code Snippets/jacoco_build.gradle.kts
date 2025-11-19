jacoco { toolVersion = "0.8.11"}

val excludePackages: Iterable<String> = listOf(
    "com.example.demo.DemoApplicationKt"
)

extra["excludePackages"] = excludePackages

tasks.jacocoTestReport {
    dependsOn(tasks.test)

    reports {
        xml.required.set(true)
        html.required.set(true)
    }

    classDirectories.setFrom(
        sourceSets.main.get().output.asFileTree.matching {
            exclude(excludePackages)
        }
    )
}

tasks.jacocoTestCoverageVerification {
    dependsOn(tasks.jacocoTestReport)

    violationRules {
        rule {
            limit {
                minimum = "0.8".toBigDecimal()
                counter = "LINE"
            }
        }

        rule {
            limit {
                minimum = "0.8".toBigDecimal()
                counter = "BRANCH"
            }
        }
    }

    classDirectories.setFrom(
        sourceSets.main.get().output.asFileTree.matching {
            exclude(excludePackages)
        }
    )
}

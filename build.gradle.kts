plugins {
    kotlin("multiplatform") version "1.8.21"
}

group = "com.sovostyanov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val kotlinWrappers = "org.jetbrains.kotlin-wrappers"
val kotlinWrappersVersion = "1.0.0-pre.490"
val kotlinHtmlVersion = "0.7.2"

kotlin {
    js {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(
                    project.dependencies.enforcedPlatform(
                        "$kotlinWrappers:kotlin-wrappers-bom:$kotlinWrappersVersion"
                    )
                )
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.2.0-pre.346")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.2.0-pre.346")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion:11.9.3-pre.346")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:6.3.0-pre.346")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-redux:4.1.2-pre.346")
                implementation("org.jetbrains.kotlin-wrappers:kotlin-react-redux:7.2.6-pre.346")
                implementation("$kotlinWrappers:kotlin-tanstack-react-query")
                implementation("$kotlinWrappers:kotlin-tanstack-react-query-devtools")
                implementation(npm("cross-fetch", "3.1.5"))
            }
        }
        val jsTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

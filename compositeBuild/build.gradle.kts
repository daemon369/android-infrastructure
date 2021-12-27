plugins {
    kotlin("jvm") version "1.6.10"
    `java-gradle-plugin`
}

repositories {
    mavenCentral()
}

gradlePlugin {
    plugins {
        create("composeBuild") {
            id = "me.daemon.gradle"
            implementationClass = "me.daemon.gradle.Plugin"
        }
    }
}
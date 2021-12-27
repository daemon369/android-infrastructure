import me.daemon.gradle.Config

plugins {
    id("java-library")
    id("kotlin")
}

ext {
    set("artifactId", "annotation")
    set("artifactVersion", "0.1.0")

    set(
        "pom",
        mapOf(
            "name" to get("artifactId"),
            "description" to "Android annotation",
            "url" to "https://github.com/daemon369/android-infrastructure",
            "scm" to mapOf(
                "connection" to "scm:git:git://github.com/daemon369/android-infrastructure.git",
                "developerConnection" to "scm:git:ssh://github.com/daemon369/android-infrastructure.git",
                "url" to "https://github.com/daemon369/android-infrastructure/tree/main",
            )
        )
    )
}


java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
    kotlinOptions {
        freeCompilerArgs =
            listOf("-module-name", "${Config.groupId}.${project.ext.get("artifactId")}")
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation(libs.kotlin)
}

java {
    withJavadocJar()
}

apply(from = "$rootDir/gradle/maven-publish.gradle")

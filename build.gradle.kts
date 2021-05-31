import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        mavenCentral()
    }
}

plugins {
    val kotlinVersion = "1.4.32"
    id("org.springframework.boot") version "2.3.11.RELEASE" apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE"  apply false

    kotlin("jvm") version kotlinVersion apply false
    kotlin("plugin.spring") version kotlinVersion apply false
}

allprojects {
    group = "com.kotlin"
    version = "1.0.0"

    tasks.withType<JavaCompile> {
        sourceCompatibility = "11"
        targetCompatibility = "11"
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
            incremental = false
        }
    }
}

subprojects {
    repositories {
        mavenCentral()
    }

    apply {
        plugin("io.spring.dependency-management")
    }
}

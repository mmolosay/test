import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    `java-library`
    `maven-publish`
}

group = "com.mmolosay.test"
version = "1.0.0"

repositories {
    mavenCentral()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
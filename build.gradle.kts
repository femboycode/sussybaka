plugins {
    kotlin("jvm") version "1.5.30"
    java
}

group = "fr.femboycode"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation(kotlin("reflect"))

    implementation("org.lwjgl.lwjgl:lwjgl:2.9.3")
}
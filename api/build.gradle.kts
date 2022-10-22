plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ( project(":db"))
    implementation (project(":service"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
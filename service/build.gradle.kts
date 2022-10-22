

plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

}

dependencies {
     implementation(project (":db"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
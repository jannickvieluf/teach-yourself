plugins {
    id("java")
}

group = "eu.vieluf"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
}

java.toolchain {
    languageVersion.set(JavaLanguageVersion.of(21))
}

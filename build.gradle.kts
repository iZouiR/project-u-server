plugins {
    java
    id("org.springframework.boot") version "3.2.3"
    id("io.spring.dependency-management") version "1.1.4"
    id("org.flywaydb.flyway") version "10.7.2"
}

group = "org.izouir"
version = "0.2.0-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.boot:spring-boot-starter-web:3.2.3")

    implementation("org.postgresql:postgresql:42.7.2")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.2.2") {
        exclude("org.springframework.data", "spring-data-jpa")
    }
    implementation("org.springframework.data:spring-data-jpa:3.2.3")
    implementation("org.flywaydb:flyway-core:10.7.2")
    runtimeOnly("org.flywaydb:flyway-database-postgresql:10.7.2")
    implementation("org.springframework:spring-orm:6.1.3")

    implementation("org.springframework.boot:spring-boot-starter-validation:3.2.2")
    implementation("org.springframework.boot:spring-boot-starter-log4j2:3.2.2")

    implementation("org.springframework.boot:spring-boot-starter-security:3.2.3")
    implementation("io.jsonwebtoken:jjwt-api:0.12.5")
    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.12.5")
    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.12.5")

    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.3.0")
}

configurations {
    all {
        exclude("org.springframework.boot", "spring-boot-starter-logging")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

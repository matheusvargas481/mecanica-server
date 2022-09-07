plugins {
    id("java")
}

group = "br.com.matheusvargas481"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation ("org.json:json:20220320")
    //implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("mysql:mysql-connector-java:5.1.13")
    implementation ("org.springframework.boot:spring-boot-starter-data-jdbc:2.7.3")
    //implementation("org.hibernate.orm:hibernate-core:6.1.2.Final")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
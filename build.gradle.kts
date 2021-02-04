plugins {
    id("groovy")
    id("com.github.johnrengelman.shadow") version "6.1.0"
    id("io.micronaut.application") version "1.3.3"
}

version = "0.1"
group = "com.example"

repositories {
    mavenCentral()
    jcenter()
}

micronaut {
    runtime("netty")
    testRuntime("spock2")
    processing {
        incremental(true)
        annotations("com.example.*")
    }
}

dependencies {
    implementation("io.micronaut:micronaut-validation")
    implementation("io.micronaut.groovy:micronaut-runtime-groovy")
    implementation("javax.annotation:javax.annotation-api")
    implementation("io.micronaut:micronaut-http-client")
    implementation("io.micronaut.sql:micronaut-jdbc-hikari")
    implementation("io.micronaut.beanvalidation:micronaut-hibernate-validator")
    implementation("io.micronaut.groovy:micronaut-hibernate-gorm")
    runtimeOnly("ch.qos.logback:logback-classic")
    runtimeOnly("org.postgresql:postgresql")
    runtimeOnly("org.apache.tomcat:tomcat-jdbc")
    testImplementation("org.testcontainers:testcontainers")
    testImplementation("org.testcontainers:spock")
    testImplementation("org.testcontainers:postgresql")
}


application {
    mainClass.set("com.example.Application")
}

java {
    sourceCompatibility = JavaVersion.toVersion("11")
    targetCompatibility = JavaVersion.toVersion("11")
}




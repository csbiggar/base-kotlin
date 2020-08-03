plugins {
    kotlin("jvm") version "1.4.0-rc"
    id("com.github.ben-manes.versions") version "0.29.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

val junitJupiterVersion = "5.6.2"
val kotlinLoggingVersion = "1.8.3"
val logbackClassicVersion = "1.2.3"
val assertJVersion = "3.16.1"
val khttpVersion = "1.0.0"

dependencies {
    implementation(kotlin("stdlib"))

    implementation("io.github.microutils:kotlin-logging:$kotlinLoggingVersion")
    implementation("khttp:khttp:${khttpVersion}")
    runtimeOnly("ch.qos.logback:logback-classic:$logbackClassicVersion")

    testImplementation("org.junit.jupiter:junit-jupiter-api:$junitJupiterVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-params:$junitJupiterVersion")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:$junitJupiterVersion")
    testImplementation("org.assertj:assertj-core:$assertJVersion")
}

tasks.compileKotlin {
    kotlinOptions.jvmTarget = "11"
}

tasks.compileTestKotlin {
    kotlinOptions.jvmTarget = "11"
}

tasks.wrapper {
    gradleVersion = "6.5.1"
    distributionType = Wrapper.DistributionType.ALL
}

tasks.test {
    useJUnitPlatform()
}
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.5.5"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.5.31"
	kotlin("plugin.spring") version "1.5.31"
}

group = "com.cif"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {

	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	implementation("com.graphql-java:graphql-spring-boot-starter:5.0.2")
	implementation("com.graphql-java:graphql-java-tools:5.2.4")
	implementation("com.graphql-java-kickstart:playground-spring-boot-starter:11.1.0")

//	implementation("org.springframework.boot:spring-boot-starter-web:2.5.5")
//	implementation("org.springframework.boot:spring-boot-starter-websocket:2.5.5")
//	implementation("org.springframework.boot:spring-boot-starter-actuator:2.5.5")
//	implementation("org.springframework.boot:spring-boot-starter-security:2.5.5")
//	implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.5.5")

	testImplementation("org.springframework.boot:spring-boot-starter-test:2.5.5")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

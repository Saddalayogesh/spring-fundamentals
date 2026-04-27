# 🌱 Spring Bean Scope & Dependency Injection Project

A beginner-friendly Java project built using Spring Framework Core XML configuration to understand bean creation, dependency injection, scopes, and lifecycle methods.

---

## 🚀 Project Overview

This project demonstrates how to configure and manage Java objects using Spring XML configuration.

It includes:

- Bean creation using `beans.xml`
- Constructor-based Dependency Injection
- Bean references
- Collection Injection (`List<Address>`)
- Singleton Scope
- Prototype Scope
- Lazy Initialization
- Bean Lifecycle Methods (`init-method`, `destroy-method`)

---

## 🛠 Tech Stack

- Java
- Spring Framework Core
- Maven
- Lombok
- XML Configuration

---

## 📂 Project Structure

```text
src/main/java
 └── com.java.spring
      ├── App.java
      └── model
           ├── Address.java
           └── Customer.java

src/main/resources
 └── beans.xml
```

---

## 📌 Features

### 🏠 Address Bean

Stores:

- Street
- City
- State

### 👤 Customer Bean

Stores:

- ID
- Name
- Email
- Phone Number
- Multiple Addresses

### ⚙ Bean Scopes

#### Singleton Scope

Only one object is created for the container.

```xml
scope="singleton"
```

#### Prototype Scope

A new object is created every time requested.

```xml
scope="prototype"
```

### ⚡ Lazy Initialization

Beans are created only when requested.

```xml
lazy-init="true"
```

---

## ▶ How to Run

### 1️⃣ Clone Repository

```bash
git clone <your-repository-url>
```

### 2️⃣ Open Project in IDE

Use:

- IntelliJ IDEA
- Eclipse IDE
- Spring Tool Suite

### 3️⃣ Install Dependencies

Run Maven:

```bash
mvn clean install
```

### 4️⃣ Run Application

Execute:

```bash
App.java
```


## 📚 Concepts Practiced

- IOC Container
- Dependency Injection
- Spring Bean Lifecycle
- Bean Scopes
- XML Configuration
- Constructor Injection

---

## 🎯 Learning Purpose

This project is ideal for beginners who want to understand core Spring concepts before moving to Spring Boot.

---

## 🚀 Future Enhancements

- Convert XML config to Annotation Config
- Add `@Component`
- Add `@Autowired`
- Upgrade to Spring Boot
- Add REST APIs

---

## 👨‍💻 Author

Developed by Saddala Yogesh

---

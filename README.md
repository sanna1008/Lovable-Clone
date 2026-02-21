# 💙 Lovable-Clone

A Spring Boot–based backend application inspired by Lovable, designed to manage users, projects, subscriptions, and project collaboration.

---

## 🚀 Tech Stack

* **Java 25**
* **Spring Boot**
* **Maven**
* **PostgreSQL**
* **Lombok**
* **JPA / Hibernate**

---

## 📁 Project Structure

```
com.bitsmad.Lovable_Clone
│
├── controller
│   ├── AuthController
│   └── ProjectController
│
├── entity
│   ├── User
│   ├── Project
│   ├── Plan
│   ├── Subscription
│   ├── ProjectFile
│   ├── ProjectMember
│   └── (and others...)
│
├── enums
│   ├── PreviewStatus
│   ├── ProjectRole
│   ├── SubscriptionStatus
│   └── (and others...)
│
├── service
│   ├── AuthService
│   └── UserService
│
├── repository
│   └── (Pending)
```

---

## 🧠 Features Implemented So Far

### 1️⃣ Project Setup

* Spring Boot application initialized with Maven.
* PostgreSQL configured as the primary database.
* Lombok integrated to reduce boilerplate code.
* Proper base package structure established.

---

### 2️⃣ Domain Model (Entity Layer)

#### 👤 User
Represents registered users of the application.

#### 📂 Project
Core resource of the system. Users can create and manage projects.

#### 💳 Plan
Defines available subscription tiers.

#### 🔄 Subscription
Links a user/project to a subscription plan.

#### 📌 SubscriptionStatus
Tracks subscription state (e.g., `ACTIVE`, `CANCELLED`, etc.).

#### 📁 ProjectFile
Represents files associated with a project.

#### 👥 ProjectMember
Manages collaborators/team members within a project with specific roles.

---

### 3️⃣ API & Service Layer

#### 🔐 Authentication
Implemented `AuthController` and `AuthService` handling `signUp` and `login` (DTOs included).

#### 💼 User Profile
Implemented `getProfile` endpoint in `AuthController`.

#### 📂 Projects
`ProjectController` established as a base for project-specific APIs.

---

## 📊 Database

* PostgreSQL used as the relational database.
* JPA/Hibernate used for ORM.
* Entities are mapped to tables using annotations.

---

## 🔜 Upcoming Development

* Implement `ProjectMember` entity logic.
* Create Repository layer (JPA Repositories).
* Build Service layer (Business logic).
* Develop REST Controllers (API layer).
* Add Authentication & Authorization (Spring Security).
* Implement role-based access control.
* Add file upload handling.
* Integrate subscription validation logic.

---

## ⚙️ How to Run

1. Clone the repository:

```bash
git clone <repo-url>
```

2. Configure PostgreSQL in `application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/lovable_clone
spring.datasource.username=your_username
spring.datasource.password=your_password
```

3. Run the application:

```bash
mvn spring-boot:run
```

---

## 🎯 Project Goal

The goal of this project is to build a scalable backend system that supports:

* Multi-user project management
* Subscription-based access control
* Team collaboration
* File management per project
* Extensible SaaS-ready architecture

---

## 📌 Current Status

✅ Entity Layer Completed
✅ Basic Controller & Service Layer Established
🚧 Repository Layer – Pending
🚧 Security Integration (Spring Security + JWT) – Pending

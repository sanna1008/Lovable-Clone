# ADR-0001: Backend Architecture & Technology Stack Selection

**Status:** Accepted
**Date:** 2026-02-12
**Decision Makers:** Shivashish Tripathi

---

## 1️⃣ Context

The Lovable-Clone project aims to build a scalable SaaS-style backend system that supports:

* User management
* Project management
* Subscription-based access
* Team collaboration
* File handling

The system must:

* Be production-ready
* Support relational data modeling
* Be scalable and maintainable
* Follow clean layered architecture
* Be easy to extend with security and subscription logic

---

## 2️⃣ Decision

We decided to build the backend using:

* **Java 25**
* **Spring Boot**
* **Maven**
* **PostgreSQL**
* **Spring Data JPA (Hibernate)**
* **Lombok**

The application will follow a **Layered Architecture**:

```
Controller → Service → Repository → Entity → Database
```

---

## 3️⃣ Architectural Pattern

### 🏗 Layered (Clean) Architecture

**Why?**

* Separation of concerns
* Maintainable business logic
* Testability
* Scalability for SaaS model

### Layers

#### 1. Entity Layer

Defines database structure and domain model:

* User
* Project
* Plan
* Subscription
* SubscriptionStatus
* ProjectFile
* ProjectMember (planned)

#### 2. Repository Layer (Upcoming)

* Extends `JpaRepository`
* Handles database operations

#### 3. Service Layer (Upcoming)

* Contains business logic
* Subscription validation
* Access control logic

#### 4. Controller Layer (Upcoming)

* REST APIs
* Request validation
* Response handling

---

## 4️⃣ Database Decision

### PostgreSQL

**Why PostgreSQL?**

* Strong relational integrity
* ACID compliance
* Excellent support for joins
* Production-ready for SaaS products
* JSON support (future extensibility)

---

## 5️⃣ ORM Decision

### Spring Data JPA (Hibernate)

**Why?**

* Reduces boilerplate code
* Automatic query generation
* Easy entity mapping
* Transaction management support
* Industry standard

---

## 6️⃣ Build Tool Decision

### Maven

**Why?**

* Dependency management
* Lifecycle management
* Industry adoption
* Easy CI/CD integration

---

## 7️⃣ Code Optimization Decision

### Lombok

**Why?**

* Reduces boilerplate (getters/setters)
* Cleaner entity classes
* Improves readability

---

## 8️⃣ Alternatives Considered

| Alternative       | Reason Rejected                            |
| ----------------- | ------------------------------------------ |
| Node.js + Express | Less aligned with current Java expertise   |
| MySQL             | PostgreSQL preferred for advanced features |
| No ORM (JDBC)     | Would increase boilerplate & complexity    |

---

## 9️⃣ Consequences

### ✅ Positive

* Scalable SaaS-ready backend
* Clean code separation
* Easy to extend with Spring Security
* Future microservices compatibility

### ⚠️ Trade-offs

* Slight initial setup complexity
* Learning curve for advanced JPA optimization
* Entity relationship management must be carefully designed

---

## 🔟 Future Architectural Decisions (Planned ADRs)

* ADR-0002: Authentication & Authorization (Spring Security + JWT)
* ADR-0003: Role-Based Access Control
* ADR-0004: File Storage Strategy (Local vs S3)
* ADR-0005: Subscription Validation Middleware
* ADR-0006: Microservices Migration Strategy (if required)

---

# 🎯 Summary

We chose a **Spring Boot + PostgreSQL + Layered Architecture** approach to ensure:

* Scalability
* Maintainability
* SaaS-readiness
* Clean separation of concerns
* Long-term extensibility

---

# ADR-0002: Enum Package Refactoring

**Status:** Accepted
**Date:** 2026-02-14
**Decision Makers:** Development Team

---

## 1️⃣ Context

As the project grows, the `entity` package was becoming cluttered with both entity classes and enum definitions. This mixes domain models with value types, reducing clarity and making navigation harder.

## 2️⃣ Decision

We decided to move all Enum classes from the `com.bitsmad.Lovable_Clone.entity` package to a new generic package `com.bitsmad.Lovable_Clone.enums`.

## 3️⃣ Consequences

### ✅ Positive

* **Improved Organization**: Clear separation between Entities (database tables) and Enums (constants).
* **Better Readability**: Easier to find and manage Enums.
* **Cleaner Entity Package**: The `entity` package now focuses solely on JPA entities.

### ⚠️ Trade-offs

* **Refactoring Cost**: Required updating imports in all files referencing these Enums (completed).

---

# ADR-0003: API & Service Layer Implementation

**Status:** Accepted
**Date:** 2026-02-21
**Decision Makers:** Development Team

---

## 1️⃣ Context

With the Entity layer stabilized, we needed to implement the core business logic and expose it via RESTful APIs. This includes authentication (Signup/Login) and project management basics.

## 2️⃣ Decision

We implemented the `controller` and `service` layers following the established layered architecture. 
- Created `AuthController` and `AuthService` (interface + initial structure) to handle user identity operations.
- Established `ProjectController` as the entry point for project-related operations.
- Decided to use DTOs (`dto` package) for all request and response payloads to decouple the API from the database entities.

## 3️⃣ Consequences

### ✅ Positive

* **Clear API Contract**: DTOs ensure that internal changes to entities don't automatically break the public API.
* **Separation of Concerns**: Controllers handle HTTP mapping, while services contain the business logic.
* **Security Readiness**: Centralizing authentication in `AuthController` makes it easier to integrate Spring Security in the next phase.

### ⚠️ Trade-offs

* **Increased Boilerplate**: Adding DTOs and Service interfaces requires more files and mapping logic.
* **Partial Implementation**: The initial service implementations are placeholders pending the `repository` layer completion.

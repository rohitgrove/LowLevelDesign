# 🚀 Finance Backend API (Spring Boot)

A production-ready **Finance Management Backend** built using **Spring Boot, MySQL, and JWT Authentication**.
This project supports **secure user management, transaction tracking, advanced filtering, and analytics dashboard APIs**.

---

## 🧠 Features

### 🔐 Authentication & Authorization

* JWT-based authentication
* Role-Based Access Control (RBAC)
* Roles: `ADMIN`, `ANALYST`, `VIEWER`
* Secure password hashing using BCrypt

---

### 👤 User Management (Admin Only)

* Get all users (pagination)
* Update user role
* Update user status (ACTIVE / INACTIVE)
* Delete user

---

### 💰 Transaction Management

* Create transaction
* Update transaction
* Soft delete (no permanent deletion)
* Get all transactions with:

  * Pagination
  * Sorting
  * Search
  * Filters (type, category, date range)

---

### 📊 Dashboard Analytics

* Total income
* Total expenses
* Net balance
* Category breakdown
* Monthly trends

---

## 🏗️ Tech Stack

* **Backend:** Spring Boot (Java 21)
* **Database:** MySQL
* **Security:** Spring Security + JWT
* **ORM:** Spring Data JPA (Hibernate)
* **Validation:** Jakarta Validation
* **API Docs:** Swagger (Springdoc OpenAPI)

---

## 📁 Project Structure

```
src/main/java/com/finance/
│
├── config/        # Security & Configurations
├── controller/    # REST Controllers
├── service/       # Business Logic
├── repository/    # Database Layer
├── entity/        # JPA Entities
├── dto/           # Request/Response DTOs
├── security/      # JWT + Filters
├── specification/ # Dynamic Filtering
└── exception/     # Custom Exceptions
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/finance-backend.git
cd finance-backend
```

---

### 2️⃣ Configure MySQL

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/finance_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
```

---

### 3️⃣ Run the project

```bash
mvn clean install
mvn spring-boot:run
```

---

## 🔐 API Authentication Flow

```plaintext
Register → Login → Get JWT Token → Use Token in Headers
```

### Header format:

```plaintext
Authorization: Bearer <your_token>
```

---

## 📬 API Endpoints

### 🔐 Auth

* `POST /api/auth/register`
* `POST /api/auth/login`

---

### 👤 Users (Admin Only)

* `GET /api/users`
* `PATCH /api/users/{id}/role`
* `PATCH /api/users/{id}/status`
* `DELETE /api/users/{id}`

---

### 💰 Transactions

* `POST /api/transactions`
* `GET /api/transactions`
* `GET /api/transactions/advanced`
* `PATCH /api/transactions/{id}`
* `DELETE /api/transactions/{id}`

---

### 📊 Dashboard

* `GET /api/dashboard/summary`
* `GET /api/dashboard/category-breakdown`
* `GET /api/dashboard/monthly-trends`

---

## 🧪 API Testing

### Swagger UI:

```
http://localhost:3000/swagger-ui.html
```

### Postman:

* Register → Login → Copy Token → Use in headers

---

## 🔥 Key Concepts Implemented

* Stateless authentication using JWT
* Role-based authorization using Spring Security
* Dynamic filtering using JPA Specifications
* Soft delete for data integrity
* Aggregation logic for analytics

---

## 🎯 Interview Highlights

* Built secure REST APIs with JWT authentication
* Designed scalable filtering system using Specifications
* Implemented financial analytics dashboard
* Followed clean architecture (Controller → Service → Repository)

---

## 🚀 Future Improvements

* Refresh tokens
* Caching (Redis)
* SQL-based aggregation (performance optimization)
* Docker deployment

---

## 👨‍💻 Author

**Rohit Grover**

* Backend Developer (Spring Boot | MERN)
* DSA Enthusiast (400+ LeetCode)

---

## ⭐ If you like this project

Give it a ⭐ on GitHub and share it!

---

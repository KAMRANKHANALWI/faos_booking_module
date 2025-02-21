# 🚀 FAOS Booking Module

## 📌 Overview
FAOS Booking Module is a **modern, full-stack booking system** built using **Spring Boot (backend) and Thymeleaf (frontend)**. It provides a sleek and user-friendly interface for managing bookings efficiently.

### ✨ **Tech Stack**
- **Backend:** Spring Boot, Spring WebFlux, JPA, Hibernate
- **Frontend:** Thymeleaf, TailwindCSS
- **Database:** MySQL
- **Build Tool:** Maven
- **Version Control:** Git & GitHub

---
## 🎯 **Key Features**
✅ **Reactive Programming with WebFlux** for non-blocking API calls  
✅ **CRUD Operations for Booking Management**  
✅ **REST API for Data Interaction**  
✅ **Git Workflow for Version Control & Team Collaboration**  

---
## 🛠 **Setup & Installation**

### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/KAMRANKHANALWI/faos_booking_module.git
cd faos_booking_module
```

### **2️⃣ Database Setup (MySQL)**
Ensure MySQL is running and execute the following commands to create the database:
```sql
CREATE DATABASE faos_booking_module;
```

Update the **`application.properties`** file:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/faos_booking_module
spring.datasource.username=root
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

### **3️⃣ Backend Setup**
```sh
cd booking-backend
mvn clean install
mvn spring-boot:run
```
The backend runs on **`http://localhost:8080`**.

### **4️⃣ Frontend Setup**
```sh
cd booking-frontend
mvn clean install
mvn spring-boot:run
```
The frontend runs on **`http://localhost:9093`**.

---
## 📚 **Learning WebFlux - Why This Project?**
This project was created as a **learning experience** to explore **Spring WebFlux**, a non-blocking, reactive programming model in Spring Boot. The goal was to understand **how reactive streams improve performance** compared to traditional blocking methods like `RestTemplate`.

### **1️⃣ What is WebFlux?**
Spring WebFlux is a **reactive programming framework** that provides **non-blocking execution**, allowing better resource utilization and scalability. It is based on **Project Reactor** and introduces:
- **`Mono<T>`** (0 or 1 element)
- **`Flux<T>`** (0 to N elements)

#### ✅ **Example: Fetching Data with WebFlux (Non-Blocking)**
```java
@GetMapping("/booking/{id}")
public Mono<Booking> getBookingById(@PathVariable Long id) {
    return bookingService.findById(id);
}
```
- **Returns `Mono<Booking>`**, making the API **non-blocking**.
- Improves **scalability** for high-concurrency apps.

---

### **2️⃣ Traditional Approach - RestTemplate (Blocking)**
Before WebFlux, **`RestTemplate`** was the standard way to call APIs in Spring Boot. However, it is **blocking**, meaning the thread waits until a response is received.

#### ❌ **Example: Fetching Data with RestTemplate (Blocking)**
```java
@GetMapping("/booking/{id}")
public ResponseEntity<Booking> getBookingById(@PathVariable Long id) {
    String url = "http://localhost:8080/api/bookings/" + id;
    Booking booking = restTemplate.getForObject(url, Booking.class);
    return ResponseEntity.ok(booking);
}
```
- **Blocks the thread**, making it inefficient for high-traffic applications.
- Limited **concurrency support**.

---

### **3️⃣ Why WebFlux is Better?**
| Feature | **RestTemplate (Blocking)** | **WebFlux (Non-blocking)** |
|---------|----------------------|------------------------------|
| **Thread Model** | One thread per request (**blocking**) | Event-driven model (**non-blocking**) |
| **Scalability** | Limited | **Handles high concurrency** |
| **Performance** | Higher resource usage | **Efficient resource utilization** |
| **Streaming Support** | ❌ No | ✅ Yes (supports `Flux`) |

---
## 🤝 **Contributing**
Feel free to fork the repo and submit **pull requests**. All contributions are welcome! 🎉

1. Fork the repository 🍴
2. Create a new branch (`git checkout -b feature-name`)
3. Make your changes and commit (`git commit -m 'Add feature-name'`)
4. Push to the branch (`git push origin feature-name`)
5. Create a **Pull Request** 🚀

---
```
🚀 Happy Coding! 🎯

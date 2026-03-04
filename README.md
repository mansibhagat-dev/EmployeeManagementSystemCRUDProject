# 🏢 Employee Management System – CRUD Web Application  

**Employee Management System** is a simple **Spring Boot + Thymeleaf CRUD application** that allows users to manage employee records efficiently. It demonstrates full-stack web development with a clean and responsive UI using **Bootstrap**.  

---

## 🚀 Features  

### 👤 User Features
- Add new employees  
- View all employees in a responsive table  
- Update employee details with pre-filled forms  
- Delete employees with confirmation  

### 🔐 Admin / Developer Features
- Simple role-independent management (for learning purposes)  
- Demonstrates **Spring Boot MVC architecture**  
- Uses **JPA/Hibernate** for database operations  

---

## 🛠️ Technologies Used
- **Java**  
- **Spring Boot**  
- **Spring MVC**  
- **Spring Data JPA (Hibernate)**  
- **Thymeleaf**  
- **Bootstrap**  
- **Maven**  
- **H2 Database** (default, in-memory)  

---

## 🏗️ Project Architecture
- **Controller Layer** → Handles HTTP requests  
- **Service Layer** → Business logic  
- **Repository Layer** → Database access using JPA  
- **Entity/POJO Classes** → Employee data  
- **Thymeleaf Templates** → Front-end pages (Register, Employee List, Update)  

---

## 🗄️ Database
- Uses **H2 in-memory database** (configurable to MySQL)  
- Stores employee information: `id`, `name`, `department`, `salary`  

---

## 📂 Project Structure
src/main/java/com/example/college
├── controller → Handles HTTP requests
├── entity → Employee entity
├── repository → JPA repository for Employee
├── service → Business logic layer

src/main/resources
├── templates → Thymeleaf pages (register.html, emplist.html, updateemp.html)
├── static → Optional CSS/JS files
├── application.properties


---

## 🖼️ Screenshots
**Register Page:**  
![Register Page]<img width="1738" height="751" alt="Register" src="https://github.com/user-attachments/assets/95652989-80b8-45f0-a840-862f7ee15f63" />


**Employee List Page:**  
![Employee List]<img width="1563" height="675" alt="emplist" src="https://github.com/user-attachments/assets/a60c283d-a198-4bb5-bcb2-4d43557ba3ac" />


**Update Employee Page:**  
![Update Page]<img width="1507" height="683" alt="updateemp" src="https://github.com/user-attachments/assets/93facc0f-8b9e-4590-94ff-a521a05d67b0" />
  


---

## ⚙️ How To Run The Project
1. Clone the repository:  
```bash
git clone https://github.com/mansibhagat-dev/EmployeeManagementSystemCRUDProject.git

2. Open the project in Spring Tool Suite / IntelliJ IDEA

3. Run the application:
mvn spring-boot:run

4. Open in browser:
http://localhost:8080/register

📌 Future Improvements

Connect to MySQL or PostgreSQL database

Add role-based authentication (USER / ADMIN)

1.Include REST APIs for CRUD operations

2.Add pagination and search functionality

3.Enhance UI with Bootstrap or custom CSS

👩‍💻 Author
Mansi Bhagat
GitHub: https://github.com/mansibhagat-dev/EmployeeManagementSystemCRUDProject

📜 License

This project is for learning and demonstration purposes.

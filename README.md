## Library Management System — Core Java

A simple console-based Library Management System written in Java.

This project was built to practice core Object-Oriented Programming (OOP) concepts and basic data management using Java collections. It allows users to add books, borrow books, return books, and display the current library inventory.

## Features

- Add books to the library
- Prevent duplicate ISBN entries
- Search books by ISBN
- Borrow available books
- Return borrowed books
- Display all books and their availability status
- Manage books efficiently using a HashMap

## Technologies & Concepts Used

- **Language:** Java
- **Concepts:** Object-Oriented Programming (OOP)
- **Data Structures:** Java Collections Framework (HashMap)

## Project Structure

```text
src/
├── Book.java
├── Library.java
└── Main.java
```

### Book Class

Represents a book with:

- ISBN
- Title
- Author
- Availability status

Provides functionality to:

- Borrow a book
- Return a book
- Retrieve book information

### Library Class

Manages the collection of books using a `HashMap`.

Provides functionality to:

- Add books
- Find books by ISBN
- Borrow books
- Return books
- Print all books

### Main Class

Demonstrates the functionality of the application by:

- Creating a library
- Adding books
- Borrowing and returning books
- Displaying library contents

## Example Output

```text
— LIBRARY SYSTEM DEMO —

Adding books...

All books:
Head First Java | ISBN: 978-1491910771 | Available: true
Core Java Volume I—Fundamentals | ISBN: 978-0137870998 | Available: true
Effective Java | ISBN: 978-0134685991 | Available: true

Borrow 'Head First Java:'
true

Try borrowing again:
false

Return book:
true

Borrow again:
true

Final state:
Head First Java | ISBN: 978-1491910771 | Available: false
Core Java Volume I—Fundamentals | ISBN: 978-0137870998 | Available: true
Effective Java | ISBN: 978-0134685991 | Available: true

— End —
```

## OOP Concepts Demonstrated

- Encapsulation
- Class Design
- Object Composition
- Method Abstraction
- Data Hiding
- Responsibility Separation

## Future Improvements

This project is designed as the foundation of a larger learning progression. The current implementation focuses on core Java and in-memory data handling, with planned upgrades in subsequent versions:

- **Second version:** Migrate to a SQL database for persistent storage using JDBC, introducing real-world data management and CRUD operations.
- **Third version:** Rebuild the system as a REST API using Spring Boot, applying layered architecture (Controller, Service, Repository) and modern backend development practices.

Additional improvements for this version:

- Add book removal functionality
- Allow searching books by title or author
- Introduce a basic user/member model (in-memory)
- Improve input handling for a more interactive console experience
- Add validation for ISBN format and input consistency

## Learning Goals

This project was created to strengthen understanding of:

- Java syntax and fundamentals
- Object-Oriented Programming principles
- Collection data structures
- Application design and code organization

## About the Project

Created as a Java learning project to practice software development fundamentals and OOP design principles.

## Author

Georgios Andronikidis


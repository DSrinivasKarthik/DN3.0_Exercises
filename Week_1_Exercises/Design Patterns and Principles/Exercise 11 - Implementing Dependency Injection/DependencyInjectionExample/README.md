# DependencyInjectionExample

This project demonstrates Dependency Injection in Java for a customer management application.

## Steps to Implement
1. Define a `CustomerRepository` interface with methods like `findCustomerById()`.
2. Implement a `CustomerRepositoryImpl` class.
3. Create a `CustomerService` class that depends on `CustomerRepository`.
4. Use constructor injection to inject `CustomerRepository` into `CustomerService`.
5. Test the Dependency Injection implementation.

## How to Run
1. Compile the project using `javac CustomerRepository.java CustomerRepositoryImpl.java CustomerService.java DependencyInjectionExample.java`.
2. Run the main class `DependencyInjectionExample` to demonstrate Dependency Injection.

# BuilderPatternExample

This project demonstrates the Builder Pattern in Java by creating complex objects such as a `Computer` with multiple optional parts.

## Steps to Implement
1. Define a product class `Computer` with attributes like CPU, RAM, Storage, etc.
2. Implement a static nested `Builder` class inside `Computer` with methods to set each attribute.
3. Provide a `build()` method in the `Builder` class that returns an instance of `Computer`.
4. Ensure that the `Computer` class has a private constructor that takes the `Builder` as a parameter.

## How to Run
1. Compile the project using `javac Computer.java BuilderPatternExample.java`.
2. Run the main class `BuilderPatternExample` to demonstrate the creation of different configurations of `Computer` using the Builder pattern.

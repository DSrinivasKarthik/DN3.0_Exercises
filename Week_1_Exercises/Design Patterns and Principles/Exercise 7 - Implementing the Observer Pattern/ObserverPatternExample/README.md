# ObserverPatternExample

This project demonstrates the Observer Pattern in Java for a stock market monitoring application.

## Steps to Implement
1. Define a `Stock` interface with methods to register, deregister, and notify observers.
2. Implement a `StockMarket` class that maintains a list of observers.
3. Define an `Observer` interface with a method `update()`.
4. Implement concrete observers like `MobileApp` and `WebApp`.
5. Test the Observer implementation.

## How to Run
1. Compile the project using `javac Stock.java StockMarket.java Observer.java MobileApp.java WebApp.java ObserverPatternExample.java`.
2. Run the main class `ObserverPatternExample` to demonstrate the Observer pattern.

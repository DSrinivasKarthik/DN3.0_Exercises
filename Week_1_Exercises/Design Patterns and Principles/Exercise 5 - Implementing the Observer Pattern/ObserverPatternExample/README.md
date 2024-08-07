# ObserverPatternExample

This project demonstrates the Observer Pattern in Java by creating a simple notification system where multiple observers get updates from a subject.

## Steps to Implement
1. Define a `Subject` interface with methods to attach, detach, and notify observers.
2. Implement a `ConcreteSubject` class that maintains a list of observers and updates them.
3. Define an `Observer` interface with a method to update.
4. Implement concrete observer classes that update themselves based on the subject's state.

## How to Run
1. Compile the project using `javac Subject.java Observer.java ConcreteSubject.java ConcreteObserver.java ObserverPatternExample.java`.
2. Run the main class `ObserverPatternExample` to demonstrate the observer pattern.

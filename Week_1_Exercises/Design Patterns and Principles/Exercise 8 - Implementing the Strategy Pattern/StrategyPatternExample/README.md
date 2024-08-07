# StrategyPatternExample

This project demonstrates the Strategy Pattern in Java for a payment system with different payment methods.

## Steps to Implement
1. Define a `PaymentStrategy` interface with a method `pay()`.
2. Implement concrete strategies `CreditCardPayment` and `PayPalPayment`.
3. Create a `PaymentContext` class that uses the strategy.
4. Test the Strategy implementation.

## How to Run
1. Compile the project using `javac PaymentStrategy.java CreditCardPayment.java PayPalPayment.java PaymentContext.java StrategyPatternExample.java`.
2. Run the main class `StrategyPatternExample` to demonstrate the Strategy pattern.

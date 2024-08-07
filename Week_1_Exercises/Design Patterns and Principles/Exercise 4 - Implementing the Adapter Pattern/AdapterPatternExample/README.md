# AdapterPatternExample

This project demonstrates the Adapter Pattern in Java by integrating multiple third-party payment gateways with different interfaces.

## Steps to Implement
1. Define a target interface `PaymentProcessor` with methods like `processPayment()`.
2. Implement adaptee classes for different payment gateways with their own methods.
3. Implement adapter classes for each payment gateway that implement `PaymentProcessor` and translate the calls to the gateway-specific methods.

## How to Run
1. Compile the project using `javac PaymentProcessor.java StripePaymentGateway.java PayPalPaymentGateway.java StripeAdapter.java PayPalAdapter.java AdapterPatternExample.java`.
2. Run the main class `AdapterPatternExample` to demonstrate the use of different payment gateways through the adapter.

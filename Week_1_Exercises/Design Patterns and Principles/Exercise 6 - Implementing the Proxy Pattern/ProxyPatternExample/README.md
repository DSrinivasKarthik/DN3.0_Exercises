# ProxyPatternExample

This project demonstrates the Proxy Pattern in Java by adding lazy initialization and caching to an image viewer application.

## Steps to Implement
1. Define an interface `Image` with a method `display()`.
2. Implement a `RealImage` class that loads an image from a remote server.
3. Create a `ProxyImage` class that implements `Image` and handles lazy initialization and caching.
4. Test the Proxy implementation.

## How to Run
1. Compile the project using `javac Image.java RealImage.java ProxyImage.java ProxyPatternExample.java`.
2. Run the main class `ProxyPatternExample` to demonstrate the Proxy pattern.

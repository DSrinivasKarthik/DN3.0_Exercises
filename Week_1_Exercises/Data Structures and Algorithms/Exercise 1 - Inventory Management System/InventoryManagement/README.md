### Exercise 1: Inventory Management System

#### Understand the Problem
- **Importance of Data Structures and Algorithms**:
  - Efficient handling of large inventories requires optimal data structures and algorithms to ensure quick data retrieval, updates, and storage.
  - Algorithms help in reducing the time complexity of operations, leading to faster processing.
- **Suitable Data Structures**:
  - **ArrayList**: Provides dynamic array capabilities, allowing for flexible resizing.
  - **HashMap**: Allows for fast access, insertion, and deletion using keys.

#### Analysis
- **Time Complexity**:
  - **Add**: O(1) for HashMap, O(n) for ArrayList (in case of resizing).
  - **Update**: O(1) for HashMap, O(n) for ArrayList (if search is required).
  - **Delete**: O(1) for HashMap, O(n) for ArrayList (if search is required).
- **Optimization**:
  - Using a HashMap ensures constant time complexity for add, update, and delete operations, making it suitable for large datasets.

### Structure

- `Product.java`: Defines the `Product` class with attributes like productId, productName, quantity, and price.
- `Inventory.java`: Manages the inventory using a `HashMap` to store `Product` objects. Provides methods to add, update, delete, and print products.
- `Main.java`: Contains the `main` method to demonstrate the functionality of the inventory management system.

### How to Run

1. Compile the Java files:
    ```sh
    javac src/*.java
    ```

2. Run the application:
    ```sh
    java -cp src InventoryManagementSystem
    ```

### Output

    ```
    Inventory after adding products:
    Product{productId='P001', productName='Laptop', quantity=10, price=800.0}
    Product{productId='P002', productName='Smartphone', quantity=20, price=500.0}

    Inventory after updating a product:
    Product{productId='P001', productName='Laptop', quantity=15, price=800.0}
    Product{productId='P002', productName='Smartphone', quantity=20, price=500.0}

    Inventory after deleting a product:
    Product{productId='P001', productName='Laptop', quantity=15, price=800.0}
    ```
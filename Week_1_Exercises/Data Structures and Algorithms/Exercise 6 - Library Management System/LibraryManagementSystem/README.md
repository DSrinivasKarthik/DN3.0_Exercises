### Exercise 6: Library Management System

#### Understand Search Algorithms
- **Linear Search**: Sequentially checks each element until the target is found or the list ends.
- **Binary Search**: Repeatedly divides the sorted array in half to locate the target.

#### Analysis
- **Time Complexity**:
  - **Linear Search**: O(n) - less efficient for large datasets.
  - **Binary Search**: O(log n) - more efficient for large, sorted datasets.
- **Usage**:
  - **Linear Search**: Suitable for small or unsorted lists.
  - **Binary Search**: Preferred for large, sorted lists due to its faster search time.

### Structure

- `Book.java`: Defines the `Book` class with attributes for bookId, title, and author.
- `LibraryManagementSystem.java`: Implements methods to add books and search for them using linear and binary search.

### How to Run

1. Compile the Java files:
    ```sh
    javac src/*.java
    ```

2. Run the application:
    ```sh
    java -cp src LibraryManagementSystem
    ```

### Output
    ```sh
    Linear Search for '1984':
    Book{bookId=2, title='1984', author='George Orwell'}

    Binary Search for 'To Kill a Mockingbird':
    Book{bookId=3, title='To Kill a Mockingbird', author='Harper Lee'}
    ```


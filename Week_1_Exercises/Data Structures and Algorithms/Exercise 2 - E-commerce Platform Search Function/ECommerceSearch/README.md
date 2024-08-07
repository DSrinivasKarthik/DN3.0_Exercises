### Exercise 2: E-commerce Platform Search Function

#### Understand Asymptotic Notation
- **Big O Notation**: Describes the upper bound of the time complexity, helping to predict the worst-case scenario for algorithm performance.
  - **Best Case**: The minimum time an algorithm takes to complete (O(1) for search if the item is found at the first position).
  - **Average Case**: The expected time an algorithm takes to complete, averaged over all possible inputs.
  - **Worst Case**: The maximum time an algorithm takes to complete (O(n) for linear search, O(log n) for binary search).

#### Analysis
- **Time Complexity**:
  - **Linear Search**: O(n) - traverses the entire array to find the element.
  - **Binary Search**: O(log n) - divides the search interval in half repeatedly.
- **Suitability**:
  - **Linear Search**: Suitable for small or unsorted datasets.
  - **Binary Search**: Preferred for large, sorted datasets due to its logarithmic time complexity.


### Structure

- `Product.java`: Defines the `Product` class with attributes for productId, productName, and category.
- `SearchAlgorithms.java`: Implements linear and binary search algorithms for searching products.

### How to Run

1. Compile the Java files:
    ```sh
    javac src/*.java
    ```

2. Run the application:
    ```sh
    java -cp src SearchAlgorithms
    ```

### Output
    ```sh
    Linear Search Result: Product{productId='P003', productName='Tablet', category='Electronics'}
    Binary Search Result: Product{productId='P003', productName='Tablet', category='Electronics'}
    ```
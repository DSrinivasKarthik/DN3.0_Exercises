## Exercise 7: Financial Forecasting

#### Understand Recursive Algorithms
- **Concept of Recursion**: A method in which a function calls itself to solve a problem, breaking it down into simpler sub-problems.

#### Analysis
- **Time Complexity**: O(n), where n is the number of years due to the recursive calls.
- **Optimization**:
  - Avoid excessive computation by ensuring base and recursive cases are well-defined.
  - Use memoization or iterative solutions for more complex problems to reduce redundant calculations.

### Structure

- `FinancialForecasting.java`: Implements the recursive method to calculate future values and demonstrates its use.

### How to Run

1. Compile the Java file:
    ```sh
    javac src/FinancialForecasting.java
    ```

2. Run the application:
    ```sh
    java -cp src FinancialForecasting
    ```

### Output

    ```sh
    Predicted future value after 5 years: 1610.51
    ```


### Exercise 4: Employee Management System

#### Understand Array Representation
- **Array Representation in Memory**:
  - Arrays are stored in contiguous memory locations, allowing for quick access using indices.
- **Advantages**:
  - Fast access time due to direct indexing.
  - Simple and easy to use for fixed-size collections.

#### Analysis
- **Time Complexity**:
  - **Add**: O(1) if there is space, O(n) if resizing is required.
  - **Search**: O(n) for linear search.
  - **Traverse**: O(n) to visit all elements.
  - **Delete**: O(n) to shift elements.
- **Limitations**:
  - Fixed size makes it inflexible for dynamic data.
  - Resizing can be costly in terms of time complexity.

### Structure

- `Employee.java`: Defines the `Employee` class with attributes for employeeId, name, position, and salary.
- `EmployeeManagementSystem.java`: Implements methods to add, search, traverse, and delete employees.

### How to Run

1. Compile the Java files:
    ```sh
    javac src/*.java
    ```

2. Run the application:
    ```sh
    java -cp src EmployeeManagementSystem
    ```

### Output
    ```sh
    Employees after addition:
    Employee{employeeId=101, name='Alice', position='Manager', salary=75000.0}
    Employee{employeeId=102, name='Bob', position='Developer', salary=55000.0}
    Employee{employeeId=103, name='Charlie', position='Designer', salary=50000.0}

    Search for employee with ID 102:
    Employee{employeeId=102, name='Bob', position='Developer', salary=55000.0}

    Employees after deletion of employee with ID 102:
    Employee{employeeId=101, name='Alice', position='Manager', salary=75000.0}
    Employee{employeeId=103, name='Charlie', position='Designer', salary=50000.0}
    ```

### Exercise 5: Task Management System

#### Understand Linked Lists
- **Singly Linked List**: Each node contains data and a reference to the next node.
- **Doubly Linked List**: Each node contains data, a reference to the next node, and a reference to the previous node.

#### Analysis
- **Time Complexity**:
  - **Add**: O(1) if added at the beginning, O(n) if added at the end (without a tail reference).
  - **Search**: O(n) as it requires traversal from the head.
  - **Traverse**: O(n) to visit all nodes.
  - **Delete**: O(1) if the node is known, O(n) if it needs to be found first.
- **Advantages**:
  - Dynamic size, making it flexible.
  - Efficient insertions and deletions compared to arrays for dynamic data.

### Structure

- `Task.java`: Defines the `Task` class with attributes for taskId, taskName, and status.
- `TaskManagementSystem.java`: Implements methods to add, search, traverse, and delete tasks in a singly linked list.

### How to Run

1. Compile the Java files:
    ```sh
    javac src/*.java
    ```

2. Run the application:
    ```sh
    java -cp src TaskManagementSystem
    ```

### Output
    ```sh
    Tasks after addition:
    Task{taskId=1, taskName='Design Database', status='Pending'}
    Task{taskId=2, taskName='Develop API', status='In Progress'}
    Task{taskId=3, taskName='Test Application', status='Completed'}

    Search for task with ID 2:
    Task{taskId=2, taskName='Develop API', status='In Progress'}

    Tasks after deletion of task with ID 2:
    Task{taskId=1, taskName='Design Database', status='Pending'}
    Task{taskId=3, taskName='Test Application', status='Completed'}
    ```



### Exercise 3: Sorting Customer Orders

#### Understand Sorting Algorithms
- **Bubble Sort**: Repeatedly swaps adjacent elements if they are in the wrong order. Simple but inefficient.
- **Insertion Sort**: Builds the sorted array one item at a time, placing each new item in its proper position.
- **Quick Sort**: Divides the array into smaller sub-arrays using a pivot and recursively sorts them.
- **Merge Sort**: Divides the array into halves, sorts each half, and then merges them back together.

#### Analysis
- **Time Complexity**:
  - **Bubble Sort**: O(n^2) - inefficient for large datasets.
  - **Quick Sort**: O(n log n) on average - more efficient due to its divide-and-conquer approach.
- **Preference**:
  - Quick Sort is generally preferred over Bubble Sort for its superior average-case performance.

### Structure

- `Order.java`: Defines the `Order` class with attributes for orderId, customerName, and totalPrice.
- `SortingAlgorithms.java`: Implements Bubble Sort and Quick Sort algorithms to sort orders by totalPrice.

### How to Run

1. Compile the Java files:
    ```sh
    javac src/*.java
    ```

2. Run the application:
    ```sh
    java -cp src SortingAlgorithms
    ```

### Output
    ```sh
    Orders before Bubble Sort:
    Order{orderId='O1', customerName='Srinivas', totalPrice=250.5}
    Order{orderId='O2', customerName='Ramesh', totalPrice=100.75}
    Order{orderId='O3', customerName='Suresh', totalPrice=300.4}
    Order{orderId='O4', customerName='Ram', totalPrice=550.2}
    Order{orderId='O5', customerName='Ravi', totalPrice=400.6}

    Orders after Bubble Sort:
    Order{orderId='O2', customerName='Ramesh', totalPrice=100.75}
    Order{orderId='O1', customerName='Srinivas', totalPrice=250.5}
    Order{orderId='O3', customerName='Suresh', totalPrice=300.4}
    Order{orderId='O5', customerName='Ravi', totalPrice=400.6}
    Order{orderId='O4', customerName='Ram', totalPrice=550.2}

    Orders before Quick Sort:
    Order{orderId='O2', customerName='Ramesh', totalPrice=100.75}
    Order{orderId='O1', customerName='Srinivas', totalPrice=250.5}
    Order{orderId='O3', customerName='Suresh', totalPrice=300.4}
    Order{orderId='O5', customerName='Ravi', totalPrice=400.6}
    Order{orderId='O4', customerName='Ram', totalPrice=550.2}
    
    Orders after Quick Sort:
    Order{orderId='O2', customerName='Ramesh', totalPrice=100.75}
    Order{orderId='O1', customerName='Srinivas', totalPrice=250.5}
    Order{orderId='O3', customerName='Suresh', totalPrice=300.4}
    Order{orderId='O5', customerName='Ravi', totalPrice=400.6}
    Order{orderId='O4', customerName='Ram', totalPrice=550.2}
    ```

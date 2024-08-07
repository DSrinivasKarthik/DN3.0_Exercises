public class SortingAlgorithms {
    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].getTotalPrice() > orders[j + 1].getTotalPrice()) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);

            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].getTotalPrice();
        int i = (low - 1); 

        for (int j = low; j < high; j++) {
            if (orders[j].getTotalPrice() <= pivot) {
                i++;

                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Order[] orders = {
                new Order("O1", "Srinivas", 250.50),
                new Order("O2", "Ramesh", 100.75),
                new Order("O3", "Suresh", 300.40),
                new Order("O4", "Ram", 550.20),
                new Order("O5", "Ravi", 400.60)
        };
        Order[] order1=orders;

        System.out.println("Orders before Bubble Sort:");
        printOrders(orders);
        bubbleSort(orders);
        System.out.println("Orders after Bubble Sort:");
        printOrders(orders);


        System.out.println("Orders before Quick Sort:");
        printOrders(order1);
        quickSort(order1, 0, order1.length - 1);
        System.out.println("Orders after Quick Sort:");
        printOrders(order1);
    }

    public static void printOrders(Order[] order1) {
        for (Order order : order1) {
            System.out.println(order);
        }
    }
}

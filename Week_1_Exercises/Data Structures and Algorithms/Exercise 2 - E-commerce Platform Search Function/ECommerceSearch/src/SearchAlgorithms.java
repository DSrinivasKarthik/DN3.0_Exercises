import java.util.Arrays;

public class SearchAlgorithms {
    public static Product linearSearch(Product[] products, String productId) {
        for (Product product : products) {
            if (product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] products, String productId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = products[mid].getProductId().compareTo(productId);

            if (comparison == 0) {
                return products[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Smartphone", "Electronics"),
                new Product("P003", "Tablet", "Electronics"),
                new Product("P004", "Headphones", "Accessories"),
                new Product("P005", "Keyboard", "Accessories")
        };

        Product result1 = linearSearch(products, "P003");
        System.out.println("Linear Search Result: " + result1);

        Arrays.sort(products, (p1, p2) -> p1.getProductId().compareTo(p2.getProductId()));

        Product result2 = binarySearch(products, "P003");
        System.out.println("Binary Search Result: " + result2);
    }
}

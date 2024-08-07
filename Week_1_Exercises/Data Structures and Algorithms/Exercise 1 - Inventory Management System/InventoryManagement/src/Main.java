public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("P001", "Laptop", 10, 800.00);
        Product product2 = new Product("P002", "Smartphone", 20, 500.00);

        inventory.addProduct(product1);
        inventory.addProduct(product2);

        System.out.println("Inventory after adding products:");
        inventory.printInventory();

        product1.setQuantity(15);
        inventory.updateProduct(product1);

        System.out.println("Inventory after updating a product:");
        inventory.printInventory();

        inventory.deleteProduct("P002");

        System.out.println("Inventory after deleting a product:");
        inventory.printInventory();
    }
}

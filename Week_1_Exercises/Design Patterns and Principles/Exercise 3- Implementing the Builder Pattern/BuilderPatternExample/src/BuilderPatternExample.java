public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer computer1 = new Computer.Builder("Intel i7", "16GB")
            .setStorage("512GB SSD")
            .setGraphicsCard("NVIDIA GTX 1660")
            .build();

        Computer computer2 = new Computer.Builder("AMD Ryzen 5", "8GB")
            .build();

        System.out.println(computer1);
        System.out.println(computer2);
    }
}

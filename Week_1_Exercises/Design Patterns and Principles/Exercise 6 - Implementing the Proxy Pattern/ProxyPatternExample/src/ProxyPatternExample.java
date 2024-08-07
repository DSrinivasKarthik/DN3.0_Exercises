public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image will be loaded and displayed
        image1.display();

        // Image will be displayed from cache
        image1.display();

        // Image will be loaded and displayed
        image2.display();
    }
}

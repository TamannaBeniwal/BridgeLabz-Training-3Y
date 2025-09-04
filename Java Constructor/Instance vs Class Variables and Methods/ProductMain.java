public class ProductMain {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("Laptop", 999);
        Product p2 = new Product("Smartphone", 599);
        Product p3 = new Product("Headphones", 199);

        // Display product details
        System.out.println("Product Details:");
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        
        Product.displayTotalProducts();
    }
}
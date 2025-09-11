import java.util.ArrayList;
import java.util.List;

public class Order<Customer, Product> {
    private static int orderCounter = 1;
    private int orderId;
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.orderId = orderCounter++;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void showOrderDetails() {
        System.out.println("Order #" + orderId + " placed by " + customer.getName());
        if (products.isEmpty()) {
            System.out.println("  No products in this order.");
        } else {
            System.out.println("  Products:");
            for (Product p : products) {
                p.showDetails();
            }
            System.out.println("  Total: $" + getTotalAmount());
        }
    }
}

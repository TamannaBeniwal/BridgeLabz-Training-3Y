import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order #" + order.getOrderId());
    }

    public void showOrderHistory() {
        System.out.println("Order history for " + name + ":");
        if (orders.isEmpty()) {
            System.out.println("  No orders placed.");
        } else {
            for (Order o : orders) {
                o.showOrderDetails();
                System.out.println();
            }
        }
    }
}

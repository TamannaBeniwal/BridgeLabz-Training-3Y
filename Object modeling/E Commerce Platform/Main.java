public class Main {
    public static <Product, Customer, Order> void main(String[] args) {
        // Create products
        Product laptop = new Product("Laptop", 1200.00);
        Product phone = new Product("Smartphone", 700.00);
        Product mouse = new Product("Wireless Mouse", 25.00);

        // Create customers
        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        // Alice places an order
        Order order1 = new Order(alice);
        order1.addProduct(laptop);
        order1.addProduct(mouse);
        alice.placeOrder(order1);

        // Bob places an order
        Order order2 = new Order(bob);
        order2.addProduct(phone);
        bob.placeOrder(order2);

        // Alice places another order
        Order order3 = new Order(alice);
        order3.addProduct(phone);
        order3.addProduct(mouse);
        alice.placeOrder(order3);

        // Show order histories
        System.out.println();
        alice.showOrderHistory();

        System.out.println();
        bob.showOrderHistory();
    }
}

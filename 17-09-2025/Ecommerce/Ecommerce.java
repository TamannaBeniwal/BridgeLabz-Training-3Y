
abstract class User {
    protected String name;
    protected int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract String getRole(); 
}

//  Inheritance
class Customer extends User {
    public Customer(String name, int id) {
        super(name, id);
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    // Polymorphism
    public void placeOrder(Order order) {
        System.out.println("Customer " + name + " placed an order for " + order.getProductName());
    }
}

class Seller extends User {
    public Seller(String name, int id) {
        super(name, id);
    }

    @Override
    public String getRole() {
        return "Seller";
    }

    // Polymorphism
    public void placeOrder(Order order) {
        System.out.println("Seller " + name + " is processing an order for " + order.getProductName());
    }
}

class Admin extends User {
    public Admin(String name, int id) {
        super(name, id);
    }

    @Override
    public String getRole() {
        return "Admin";
    }
}

//  Interface
interface PaymentGateway {
    void pay(double amount);
    void refund(double amount);
}


class UPIPayment implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " using UPI.");
    }
}

class CreditCardPayment implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Credit Card.");
    }
}

class WalletPayment implements PaymentGateway {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Wallet.");
    }

    public void refund(double amount) {
        System.out.println("Refunded " + amount + " to Wallet.");
    }
}

// Composition
class Order {
    private String productName;
    private double price;
    private Invoice invoice; 

    public Order(String productName, double price) {
        this.productName = productName;
        this.price = price;
        this.invoice = new Invoice(this); 
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public Invoice getInvoice() {
        return invoice;
    }
}

class Invoice {
    private Order order;

    public Invoice(Order order) {
        this.order = order;
    }

    public void printInvoice() {
        System.out.println("Invoice generated for: " + order.getProductName() + " | Amount: " + order.getPrice());
    }
}

class Marketplace {
    static {
        System.out.println("Marketplace configurations loaded.");
    }

    public Marketplace(String name) {
    }

    public final void termsAndConditions() {
        System.out.println("All sales are subject to platform policies.");
    }
}

interface DiscountStrategy {
    double applyDiscount(double amount);
}

public class Ecommerce {
    public static void main(String[] args) {
        // Customers and Sellers
        Customer customer = new Customer("Alice", 101);
        Seller seller = new Seller("Bob", 201);

       
        Order order = new Order("Laptop", 75000);
        customer.placeOrder(order);
        seller.placeOrder(order);

        
        order.getInvoice().printInvoice();

      
        PaymentGateway payment = new CreditCardPayment();
        payment.pay(order.getPrice());

       
        Marketplace market = new Marketplace("ShopHub");
        market.termsAndConditions();


        DiscountStrategy oneTimeDiscount = new DiscountStrategy() {
            @Override
            public double applyDiscount(double amount) {
                return amount * 0.9; 
            }
        };

        double discountedPrice = oneTimeDiscount.applyDiscount(order.getPrice());
        System.out.println("Discounted Price (10% off): " + discountedPrice);
    }
}
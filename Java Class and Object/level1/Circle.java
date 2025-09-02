public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public void display() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}

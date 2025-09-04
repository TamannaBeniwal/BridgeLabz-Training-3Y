public class CircleMain {
    public static void main(String[] args) {
        // Using default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle:");
        System.out.println("Radius: " + defaultCircle.getRadius());
        System.out.println("Area: " + defaultCircle.getArea());
        System.out.println("Circumference: " + defaultCircle.getCircumference());

        System.out.println();

        // Using parameterized constructor
        Circle customCircle = new Circle(5.0);
        System.out.println("Custom Circle:");
        System.out.println("Radius: " + customCircle.getRadius());
        System.out.println("Area: " + customCircle.getArea());
        System.out.println("Circumference: " + customCircle.getCircumference());
    }
}
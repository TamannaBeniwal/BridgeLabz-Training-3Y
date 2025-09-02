import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        circle.display();

        scanner.close();
    }
}
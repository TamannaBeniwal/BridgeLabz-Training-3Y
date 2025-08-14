import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        double base, height;
        final double INCH_TO_CM = 2.54;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of triangle in inches: ");
        base = input.nextDouble();

        System.out.print("Enter height of triangle in inches: ");
        height = input.nextDouble();

        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * INCH_TO_CM * INCH_TO_CM;

        System.out.println("The area of the triangle is " + areaInInches + " square inches and " + areaInCm + " square centimeters.");

        input.close();
    }
}

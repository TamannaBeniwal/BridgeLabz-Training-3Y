import java.util.Scanner;

public class AthleteRunCalculator {

    // Method to calculate number of rounds required to complete 5 km
    public static double calculateNumberOfRounds(double sideA, double sideB, double sideC) {
        double perimeter = sideA + sideB + sideC;
        double totalDistanceToRun = 5000; // in meters
        return totalDistanceToRun / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double sideA, sideB, sideC;

        System.out.print("Enter the length of side A (in meters): ");
        sideA = sc.nextDouble();

        System.out.print("Enter the length of side B (in meters): ");
        sideB = sc.nextDouble();

        System.out.print("Enter the length of side C (in meters): ");
        sideC = sc.nextDouble();

        double roundsRequired = calculateNumberOfRounds(sideA, sideB, sideC);

        System.out.printf("The athlete needs to complete %.2f rounds to run 5 km.%n", roundsRequired);

        sc.close();
    }
}

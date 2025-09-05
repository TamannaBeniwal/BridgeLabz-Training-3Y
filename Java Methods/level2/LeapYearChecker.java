import java.util.Scanner;

public class LeapYearChecker {

    // Method to check whether a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; // Not valid for Gregorian calendar
        }

        // Leap year condition:
        // Divisible by 4 AND (not divisible by 100 OR divisible by 400)
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later for Gregorian calendar.");
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        }

        sc.close();
    }
}

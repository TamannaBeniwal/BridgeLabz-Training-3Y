// import java.util.*;

public class NumberUtilityApp5 {
    public static void main(String[] args) {
        int number = 7;  // 🔁 You can change this number to test other cases

        System.out.println("Given Number: " + number);

        System.out.println("Is Prime Number: " + NumberChecker5.isPrime(number));
        System.out.println("Is Neon Number: " + NumberChecker5.isNeon(number));
        System.out.println("Is Spy Number: " + NumberChecker5.isSpy(number));
        System.out.println("Is Automorphic Number: " + NumberChecker5.isAutomorphic(number));
        System.out.println("Is Buzz Number: " + NumberChecker5.isBuzz(number));
    }
}

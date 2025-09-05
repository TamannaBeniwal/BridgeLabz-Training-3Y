import java.util.Arrays;

public class RandomStats {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            randomNumbers[i] = (int)(Math.random() * 9000) + 1000; // Range: 1000–9999
        }

        return randomNumbers;
    }

    // Method to find average, min, and max of an array
    // Returns: [average, min, max]
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        int[] randomArray = generate4DigitRandomArray(5);
        System.out.println("Random 4-digit numbers: " + Arrays.toString(randomArray));

        double[] stats = findAverageMinMax(randomArray);

        System.out.printf("Average: %.2f%n", stats[0]);
        System.out.println("Minimum: " + (int)stats[1]);
        System.out.println("Maximum: " + (int)stats[2]);
    }
}


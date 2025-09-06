import java.util.Random;

public class FootballTeamStats {

    public static void main(String[] args) {
        int[] heights = new int[11];

        // Generate random heights between 150 and 250 cm
        generateRandomHeights(heights);

        // Display all heights
        System.out.println("Player Heights:");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\n--- Team Stats ---");
        System.out.println("Total Height: " + sum + " cm");
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Player: " + shortest + " cm");
        System.out.println("Tallest Player: " + tallest + " cm");
    }

    // Method to generate random heights in range 150–250 cm
    public static void generateRandomHeights(int[] arr) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101) + 150;  // (0 to 100) + 150 = 150 to 250
        }
    }

    // Method to calculate the sum of all elements
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int height : arr) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean
    public static double calculateMean(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int height : arr) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int height : arr) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}

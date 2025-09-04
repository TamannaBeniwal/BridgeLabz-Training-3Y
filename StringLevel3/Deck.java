package StringLevel3;
import java.util.Scanner;

public class Deck {

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};

        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];

        // Initialize the deck
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index++] = ranks[j] + " of " + suits[i];
            }
        }

        // Shuffle the deck
        for (int i = 0; i < numOfCards; i++) {
            int randomCardNumber = i + (int) (Math.random() * (numOfCards - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        // Input: number of cards and number of players
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of cards to distribute: ");
        int n = scanner.nextInt();

        System.out.print("Enter number of players: ");
        int x = scanner.nextInt();
        scanner.close();

        if (n > numOfCards) {
            System.out.println("Not enough cards to distribute.");
            return;
        }

        if (n % x != 0) {
            System.out.println("Cards cannot be evenly distributed to players.");
            return;
        }

        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];

        // Distribute cards to players
        int cardIndex = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }

        // Print players and their cards
        for (int i = 0; i < x; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }
}

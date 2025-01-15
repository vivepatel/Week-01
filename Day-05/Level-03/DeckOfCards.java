import java.util.Scanner;

public class DeckOfCards {

    // Method to initialize the deck
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            // Swap cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // Method to distribute cards to players
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n > deck.length || n % x != 0) {
            throw new IllegalArgumentException("Cannot distribute cards evenly among players.");
        }

        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];
        int deckIndex = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[deckIndex++];
            }
        }

        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the deck
        String[] deck = initializeDeck();

        // Shuffle the deck
        shuffleDeck(deck);

        // Take user inputs
        System.out.print("Enter the number of cards to distribute (n): ");
        int n = scanner.nextInt();
        System.out.print("Enter the number of players (x): ");
        int x = scanner.nextInt();

        try {
            // Distribute the cards
            String[][] players = distributeCards(deck, n, x);

            // Print the players and their cards
            printPlayersCards(players);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        
    }
}

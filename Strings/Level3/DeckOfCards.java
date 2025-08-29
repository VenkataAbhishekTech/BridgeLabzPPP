package Strings.Level3;
import java.util.Scanner;
public class DeckOfCards {
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;
        for(String suit : suits) {
            for(String rank : ranks) {
                deck[idx++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for(int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }
    public static String[][] distributeCards(String[] deck, int nCards, int nPlayers) {
        if(nCards * nPlayers > deck.length) return null;
        String[][] players = new String[nPlayers][nCards];
        int idx = 0;
        for(int i = 0; i < nPlayers; i++) {
            for(int j = 0; j < nCards; j++) {
                players[i][j] = deck[idx++];
            }
        }
        return players;
    }
    public static void printPlayers(String[][] players) {
        for(int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i+1) + ": ");
            for(int j = 0; j < players[i].length; j++) {
                System.out.print(players[i][j] + (j < players[i].length-1 ? ", " : ""));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        System.out.print("Enter number of cards per player: ");
        int nCards = sc.nextInt();
        System.out.print("Enter number of players: ");
        int nPlayers = sc.nextInt();
        String[][] players = distributeCards(deck, nCards, nPlayers);
        if(players == null) System.out.println("Not enough cards to distribute.");
        else printPlayers(players);
        sc.close();
    }
}

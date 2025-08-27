package Strings;

import java.util.Scanner;

public class RockPaperScissorsGame {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3); 
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }
    public static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";

        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("paper") && computer.equals("rock"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    public static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / games;
        double compPercent = (compWins * 100.0) / games;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.format("%.2f%%", userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.format("%.2f%%", compPercent);

        return stats;
    }
    public static void displayStats(String[][] stats) {
        System.out.printf("\n%-10s %-10s %-15s\n", "Player", "Wins", "Win %");
        System.out.println("-----------------------------------");
        for (String[] row : stats) {
            System.out.printf("%-10s %-10s %-15s\n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0, draws = 0;

        System.out.printf("\n%-10s %-15s %-15s %-10s\n", "Game", "User Choice", "Computer Choice", "Winner");
        System.out.println("-------------------------------------------------------------");

        for (int i = 1; i <= games; i++) {
            System.out.print("Game " + i + " - Enter rock, paper, or scissors: ");
            String userChoice = sc.next().toLowerCase();

            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            else draws++;

            System.out.printf("%-10d %-15s %-15s %-10s\n", i, userChoice, compChoice, winner);
        }
        String[][] stats = calculateStats(userWins, compWins, games);
        displayStats(stats);

        System.out.println("\nNumber of Draws: " + draws);
    }
}

package Strings.Level2;
import java.util.Scanner;
public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 1; i <= games; i++) {
            System.out.print("Game " + i + " - Enter rock, paper, or scissors: ");
            String user = sc.next().toLowerCase();

            String[] choices = {"rock", "paper", "scissors"};
            String comp = choices[(int)(Math.random() * 3)];

            String winner;
            if (user.equals(comp)) {
                winner = "Draw";
                draws++;
            } else if ((user.equals("rock") && comp.equals("scissors")) ||
                       (user.equals("scissors") && comp.equals("paper")) ||
                       (user.equals("paper") && comp.equals("rock"))) {
                winner = "User";
                userWins++;
            } else {
                winner = "Computer";
                compWins++;
            }

            System.out.println("User: " + user + " | Computer: " + comp + " | Winner: " + winner);
        }

        // Show stats
        System.out.println("\n--- Game Stats ---");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + draws);

        System.out.printf("User Win %%: %.2f%%\n", (userWins * 100.0 / games));
        System.out.printf("Computer Win %%: %.2f%%\n", (compWins * 100.0 / games));
        sc.close();
    }
}

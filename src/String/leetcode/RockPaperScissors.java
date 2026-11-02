package String.Level2;

import java.util.Scanner;

public class RockPaperScissors {

    public static String computerChoice() {

        int choice = (int) (Math.random() * 3);

        if (choice == 0) {
            return "Rock";
        } else if (choice == 1) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }

    public static String findWinner(String user, String computer) {

        if (user.equals(computer)) {
            return "Draw";
        }

        if ((user.equals("Rock") && computer.equals("Scissors")) ||
                (user.equals("Paper") && computer.equals("Rock")) ||
                (user.equals("Scissors") && computer.equals("Paper"))) {
            return "Player";
        }

        return "Computer";
    }

    public static String[][] calculateStats(int playerWins,
                                            int computerWins,
                                            int games) {

        double playerPercentage = (playerWins * 100.0) / games;
        double computerPercentage = (computerWins * 100.0) / games;

        String[][] stats = new String[2][3];

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.valueOf(playerPercentage);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf(computerPercentage);

        return stats;
    }

    public static void displayResults(String[][] results,
                                      String[][] stats) {

        System.out.println("\n----- Game Results -----");
        System.out.println("Game\tPlayer\t\tComputer\tWinner");

        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t"
                    + results[i][0] + "\t\t"
                    + results[i][1] + "\t\t"
                    + results[i][2]);
        }

        System.out.println("\n----- Winning Statistics -----");
        System.out.println("Player\tWins\tWinning Percentage");
        System.out.println("Player\t" + stats[0][1] + "\t"
                + stats[0][2] + "%");
        System.out.println("Computer\t" + stats[1][1] + "\t"
                + stats[1][2] + "%");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        sc.nextLine();

        String[][] results = new String[games][3];

        int playerWins = 0;
        int computerWins = 0;


        for (int i = 0; i < games; i++) {

            System.out.print("\nEnter your choice (Rock/Paper/Scissors): ");
            String player = sc.nextLine();

            String computer = computerChoice();

            String winner = findWinner(player, computer);

            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }

            results[i][0] = player;
            results[i][1] = computer;
            results[i][2] = winner;
        }

                String[][] stats = calculateStats(
                playerWins, computerWins, games);

        displayResults(results, stats);

        sc.close();
    }
}

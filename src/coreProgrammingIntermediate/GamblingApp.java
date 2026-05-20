package coreProgrammingIntermediate;

import java.util.Random;
import java.util.Scanner;

public class GamblingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int money = 100; // Initial money
        int goal = 200;  // Winning target
        int bet = 10;    // Fixed bet amount

        int totalBets = 0;
        int totalWins = 0;

        System.out.println("===== Gambling Simulator =====");

        while (money > 0 && money < goal) {

            totalBets++;

            // Random result: 0 = Lose, 1 = Win
            int result = random.nextInt(2);

            if (result == 1) {
                money += bet;
                totalWins++;
                System.out.println("You WON Rs." + bet);
            } else {
                money -= bet;
                System.out.println("You LOST Rs." + bet);
            }

            System.out.println("Current Money: Rs." + money);
            System.out.println("--------------------------");
        }

        System.out.println("\n===== Final Report =====");

        if (money == goal) {
            System.out.println("Congratulations! You reached the goal.");
        } else {
            System.out.println("You lost all your money.");
        }

        System.out.println("Total Bets Made: " + totalBets);
        System.out.println("Total Wins: " + totalWins);

        double winPercentage = (double) totalWins / totalBets * 100;

        System.out.println("Win Percentage: " + winPercentage + "%");

        sc.close();
    }
}

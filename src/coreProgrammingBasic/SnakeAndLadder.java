package coreProgrammingBasic;

import java.util.Random;

public class SnakeAndLadder {

    static final int WINNING_POSITION = 100;
    static Random random = new Random();

    // Method to roll dice
    public static int rollDice() {
        return random.nextInt(6) + 1;
    }

    // Method to get option
    // 0 = No Play
    // 1 = Ladder
    // 2 = Snake
    public static int getOption() {
        return random.nextInt(3);
    }

    // Method to play turn
    public static int playTurn(String playerName, int position) {

        int dice = rollDice();
        int option = getOption();

        System.out.println(playerName + " rolled: " + dice);

        switch (option) {

            case 0:
                System.out.println("No Play");
                break;

            case 1:
                System.out.println("Ladder");
                position += dice;

                // Exact 100 condition
                if (position > WINNING_POSITION) {
                    position -= dice;
                }

                break;

            case 2:
                System.out.println("Snake");
                position -= dice;

                // Position should not go below 0
                if (position < 0) {
                    position = 0;
                }

                break;
        }

        System.out.println(playerName + " Position: " + position);
        System.out.println("--------------------------------");

        return position;
    }

    public static void main(String[] args) {

        int player1Position = 0;
        int player2Position = 0;

        int diceCount = 0;

        boolean player1Turn = true;

        while (player1Position < WINNING_POSITION &&
                player2Position < WINNING_POSITION) {

            if (player1Turn) {

                int oldPosition = player1Position;

                int dice = rollDice();
                int option = getOption();

                diceCount++;

                System.out.println("Player 1 rolled: " + dice);

                switch (option) {

                    case 0:
                        System.out.println("No Play");
                        break;

                    case 1:
                        System.out.println("Ladder");
                        player1Position += dice;

                        if (player1Position > WINNING_POSITION) {
                            player1Position = oldPosition;
                        }

                        System.out.println("Player 1 Position: " + player1Position);
                        System.out.println("--------------------------------");

                        // Player gets another chance
                        continue;

                    case 2:
                        System.out.println("Snake");
                        player1Position -= dice;

                        if (player1Position < 0) {
                            player1Position = 0;
                        }

                        break;
                }

                System.out.println("Player 1 Position: " + player1Position);
                System.out.println("--------------------------------");

                player1Turn = false;

            } else {

                int oldPosition = player2Position;

                int dice = rollDice();
                int option = getOption();

                diceCount++;

                System.out.println("Player 2 rolled: " + dice);

                switch (option) {

                    case 0:
                        System.out.println("No Play");
                        break;

                    case 1:
                        System.out.println("Ladder");
                        player2Position += dice;

                        if (player2Position > WINNING_POSITION) {
                            player2Position = oldPosition;
                        }

                        System.out.println("Player 2 Position: " + player2Position);
                        System.out.println("--------------------------------");

                        // Player gets another chance
                        continue;

                    case 2:
                        System.out.println("Snake");
                        player2Position -= dice;

                        if (player2Position < 0) {
                            player2Position = 0;
                        }

                        break;
                }

                System.out.println("Player 2 Position: " + player2Position);
                System.out.println("--------------------------------");

                player1Turn = true;
            }
        }

        // Winner
        if (player1Position == WINNING_POSITION) {
            System.out.println("Player 1 Wins!");
        } else {
            System.out.println("Player 2 Wins!");
        }

        System.out.println("Total Dice Played: " + diceCount);
    }
}

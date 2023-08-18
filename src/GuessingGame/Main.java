package GuessingGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Get the player's name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String playerName = scanner.nextLine();

        // Create a GuessingGame.GuessingGame object and start the game
        GuessingGame game = new GuessingGame(playerName);
        game.playGame();

        // Close the scanner
        scanner.close();
    }
}

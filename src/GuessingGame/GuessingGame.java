package GuessingGame;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
        public String playerName;
        public int numberOfGuesses;
        public int  targetNumber;

        // Constructor
        public GuessingGame(String playerName) {
            System.out.println("Greetings, " + playerName + "! Welcome to the Guessing Game!");
            this.playerName = playerName;
            this.numberOfGuesses = 0;

            // Generate a random number between 1 and 100
            Random random = new Random();
            this.targetNumber = random.nextInt(100) + 1;

        }

        public void playGame() {
            Scanner scanner = new Scanner(System.in);
            int guess = 0;

            System.out.println("I have picked a random number between 1 and 100. Try to guess it!");

            do {
                // Check if the input is an integer
                if (!scanner.hasNextInt()) {
                    System.out.println("That's not an integer, try again!");
                    scanner.next(); // Consume the non-integer input
                    continue;
                }

                guess = scanner.nextInt();

                // Check if the guess is within the valid range
                if (guess < 1 || guess > 100) {
                    System.out.println("Your guess is not a valid number, try again!");
                    continue;
                }

                numberOfGuesses++;


                // Check if the guess is correct, too high, or too low
                if (guess > targetNumber) {
                    System.out.println("Your Guess is too high! Try again.");
                } else if (guess < targetNumber) {
                    System.out.println("Your Guess is too low! Try again.");
                }
            } while (guess != targetNumber);

            // Close the scanner
            scanner.close();

            // Print the result
            System.out.println("Congratulations, " + playerName + "! You guessed the number with " + numberOfGuesses + " guesses.");
        }
    }

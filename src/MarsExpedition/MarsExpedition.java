package MarsExpedition;

// Packages
import java.util.Scanner;



public class MarsExpedition {
    private Scanner input;

    // Create Constructor
    public MarsExpedition() {
        input = new Scanner(System.in);

        // Print a creative bootup message with some delays
        try {
            System.out.println("Mars Expedition booting up...");
            Thread.sleep(1000);
            System.out.println("Initiating thrusters...");
            Thread.sleep(500);
            System.out.println("Loading navigation systems...");
            Thread.sleep(500);
            System.out.println("Calibrating communication satellites...");
            Thread.sleep(500);
            System.out.println("All systems operational. Ready for Mars exploration!");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // Handle the exception if needed
            e.printStackTrace();
        }

        // Ask for the users name
        System.out.println("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Hi, " + name + " - Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N ");

        // Format the response
        String readyResponse = input.nextLine().trim().toLowerCase();

        if (readyResponse.equals("y") || readyResponse.equalsIgnoreCase("yes")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        // Ask how many people the user wants on their team
        System.out.print("How many people do you want on your team? ");
        int teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2) {
            System.out.println("That's way too many people. We can only send 2 more members.");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("We need at least 2 more members. Sending 2 members.");
            teamSize = 2;
        } else {
            System.out.println("Perfect! You have exactly 2 members on your team.");
        }

        System.out.println("Expedition team is ready with " + (teamSize + 1) + " members including you. Safe travels!");

        // Log "You are allowed to bring one snack with you. What do you want to bring?"
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");

        // Select a vehicle
        System.out.println("Which vehicle would you like to choose?");
        System.out.println("A. Mars Rover");
        System.out.println("B. Clyde the horse");
        System.out.println("C. Space Shuttle");
        System.out.print("Choose a letter from the options above: ");

        String vehicleChoice = input.nextLine();

        // Store choice in variable
        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "a Mars Rover";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "a Clyde the horse";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "a Space Shuttle";
        } else {
            vehicleChoice = "your feet";
        }

        //
        System.out.println("Alright " + name + " we have packed the " + snack + " for you and your team of " + teamSize + " in the center console of the " + vehicleChoice + " .");

        // Print a countdown to launch
        try {
            Thread.sleep(3000);
            System.out.println("Preparing for takeoff in...");
            Thread.sleep(1000);
            System.out.println("5...");
            Thread.sleep(1000);
            System.out.println("4...");
            Thread.sleep(1000);
            System.out.println("3...");
            Thread.sleep(1000);
            System.out.println("2...");
            Thread.sleep(1000);
            System.out.println("1...");
            Thread.sleep(1000);
            System.out.println("Houston, we have a problem!!!!");

        } catch (InterruptedException e) {
            // Handle the exception if needed
            e.printStackTrace();
        }


    }
}

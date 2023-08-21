package FindingsList;

import jdk.jshell.spi.ExecutionControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsList {
    public FindingsList() throws ExecutionControl.InternalException {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Print a welcome back message
        System.out.println("Welcome back from your expedition. Time to catalog everything you found.");

        // Create an array tht will store string S
        ArrayList<String> rockList = new ArrayList<String>();

        // Add four rocks into your array
        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        // Print a message confirming that everything downloaded and print the list of rocks.
        System.out.println("Everything has downloaded");
        System.out.println(rockList);

        // Print message acknowledging that there is a not rock in the list
        System.out.println("It seems there has been an error, the list contains a 'not rock'. We need to delete that item!");

        // Remove the "not rock" from the list
        rockList.remove("not rock");
        System.out.println(rockList);

        // Stop terminal while it loads fossil data
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Create a HashMap that stores elements with 2 attrs (name, description), both of which are strings.
        HashMap<String, String> fossilDirectory = new HashMap<>();

        // Add 3 fossils and their descriptions to the HashMap
        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Fossil Data Added!");

        // Ask which of the fossils would you like to learn more about?
        System.out.println("Which of the fossils would you like to learn more about? Bird Fossil, Fish Fossil, or Tooth Fossil?");

        Scanner input = new Scanner(System.in);

        String fossilChoice = input.nextLine();

        // Conditional statement
        if (fossilChoice.equalsIgnoreCase("Bird Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        } else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }

        // Stop the terminal while it figures out what special supplies have been used.
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        HashSet<String> supplies = new HashSet<>();

        supplies.add("Teleporter");
        supplies.add("Stun Gun");
        supplies.add("Insta-Heal Capsules");

        // Print the contentss of the set
        System.out.println("Supplies Before Expedition: " + supplies);

        // Remove an item
        supplies.remove("Teleporter");

        // Stop the terminal while it figures out what special supplies have been used.
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Print the contentss of the set
        System.out.println("Supplies After Expedition: " + supplies);


    }
}

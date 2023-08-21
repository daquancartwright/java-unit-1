package FindingsList;

import jdk.jshell.spi.ExecutionControl;

public class Main {
    public static void main(String[] args) {
        // Create an instance of MarsExpedition, which will run the constructor
        try {
            FindingsList list = new FindingsList();
        } catch (ExecutionControl.InternalException e) {
            throw new RuntimeException(e);
        }
    }
}

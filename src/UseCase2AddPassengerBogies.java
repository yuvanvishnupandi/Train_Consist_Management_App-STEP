import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App
 * Use Case 2: Add Passenger Bogies to Train (ArrayList Operations)
 */
public class UseCase2AddPassengerBogies {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC2: Passenger Bogie Operations ---\n");

        // 1. Create an ArrayList<String> for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 2. Add bogies: Sleeper, AC Chair, First Class
        System.out.println("Adding passenger bogies to the train...");
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 3. Print the list after insertion
        System.out.println("Current Consist: " + passengerBogies);
        System.out.println("Total bogies: " + passengerBogies.size() + "\n");

        // 4. Remove one bogie (AC Chair)
        System.out.println("Detaching 'AC Chair' from the consist...");
        passengerBogies.remove("AC Chair");

        // 5. Use contains() to check if Sleeper exists
        System.out.println("Checking if 'Sleeper' bogie is still attached...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("-> Yes, 'Sleeper' is attached to the train.\n");
        } else {
            System.out.println("-> No, 'Sleeper' is not attached.\n");
        }

        // 6. Print final list state
        System.out.println("Final Passenger Bogies List: " + passengerBogies);
        System.out.println("Final bogie count: " + passengerBogies.size());
    }
}
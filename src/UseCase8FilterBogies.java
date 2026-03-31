import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Train Consist Management App
 * Use Case 8: Filter Passenger Bogies Using Streams
 */
public class UseCase8FilterBogies {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC8: Filter Bogies by Capacity (Streams) ---\n");

        // 1. Create a List<Bogie> (Notice we are reusing the Bogie object from UC7!)
        List<Bogie> passengerBogies = new ArrayList<>();

        System.out.println("Registering passenger bogies...");
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General Class", 90)); // Added a large one to show multiple matches

        System.out.println("\n--- All Passenger Bogies ---");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        // 2. Create a stream from the list and apply the filter condition (Capacity > 60)
        // 3. Collect the matching bogies into a new list
        System.out.println("\nApplying Stream filter for capacity > 60...");

        List<Bogie> highCapacityBogies = passengerBogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        // 4. Display the filtered bogies
        System.out.println("\n--- Filtered Result (High Capacity Bogies) ---");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies found matching the criteria.");
        } else {
            for (Bogie b : highCapacityBogies) {
                System.out.println(b);
            }
        }
        System.out.println("-------------------------------------------------");
    }
}
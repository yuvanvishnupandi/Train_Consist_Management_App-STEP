import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Train Consist Management App
 * Use Case 9: Group Bogies by Type (Collectors.groupingBy)
 */
public class UseCase9GroupBogies {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC9: Group Bogies by Type (Streams) ---\n");

        // 1. Create a List of Bogies (Reusing the Bogie class from UC7)
        List<Bogie> passengerBogies = new ArrayList<>();

        System.out.println("Registering passenger bogies in the yard...");
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("Sleeper", 72)); // Second Sleeper to demonstrate grouping!
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("AC Chair", 56)); // Second AC Chair

        System.out.println("\nGrouping bogies by their Type name...");

        // 2. Create a stream and apply Collectors.groupingBy()
        // 3. Store the result in Map<String, List<Bogie>>
        Map<String, List<Bogie>> groupedBogies = passengerBogies.stream()
                .collect(Collectors.groupingBy(Bogie::getName));

        // 4. Print the grouped bogie structure
        System.out.println("\n--- Structured Yard Inventory ---");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            String category = entry.getKey();
            List<Bogie> bogiesInThisCategory = entry.getValue();

            System.out.println("Category: [" + category + "] - Total Count: " + bogiesInThisCategory.size());

            // Print each bogie inside this specific group
            for (Bogie b : bogiesInThisCategory) {
                System.out.println("   -> " + b.toString());
            }
            System.out.println(); // Blank line for readability
        }
        System.out.println("---------------------------------");
    }
}
import java.util.HashMap;
import java.util.Map;

/**
 * Train Consist Management App
 * Use Case 6: Map Bogie to Capacity (HashMap)
 */
public class UseCase6MapBogieCapacity {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC6: Bogie Capacity Mapping (HashMap) ---\n");

        // 1. Create a HashMap<String, Integer> to store bogie-capacity information
        Map<String, Integer> bogieCapacities = new HashMap<>();

        System.out.println("Registering bogies and their seating capacities...");

        // 2. Insert capacity values for bogies using the put() method
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 60);
        bogieCapacities.put("First Class", 24);

        System.out.println("Registration complete.\n");
        System.out.println("--- Train Capacity Details ---");

        // 3. Iterate over the map using entrySet() and display the details
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            String bogieName = entry.getKey();
            Integer capacity = entry.getValue();

            System.out.println("Bogie Type: " + bogieName + " | Capacity: " + capacity + " seats");
        }

        System.out.println("------------------------------");
    }
}
import java.util.HashSet;
import java.util.Set;

/**
 * Train Consist Management App
 * Use Case 3: Track Unique Bogie IDs (Set - HashSet)
 */
public class UseCase3TrackUniqueBogies {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC3: Track Unique Bogie IDs ---\n");

        // 1. Create a HashSet<String> for bogie IDs
        Set<String> uniqueBogieIDs = new HashSet<>();

        System.out.println("Registering Bogie IDs to the train...");

        // 2. Add bogie IDs, including intentional duplicates
        uniqueBogieIDs.add("BG-101");
        uniqueBogieIDs.add("BG-102");
        uniqueBogieIDs.add("BG-103");
        System.out.println("Added: BG-101, BG-102, BG-103");

        System.out.println("\nAttempting to add duplicate ID: BG-101...");
        // The add() method returns false if the item is already in the Set
        boolean isAdded101 = uniqueBogieIDs.add("BG-101");

        if (!isAdded101) {
            System.out.println("-> System rejected duplicate ID: BG-101 (Automatic Deduplication)");
        }

        System.out.println("Attempting to add duplicate ID: BG-102...");
        boolean isAdded102 = uniqueBogieIDs.add("BG-102");

        if (!isAdded102) {
            System.out.println("-> System rejected duplicate ID: BG-102 (Automatic Deduplication)\n");
        }

        // 3. Print the final set to observe that duplicates were ignored
        System.out.println("Final Registered Bogie IDs (Notice unordered storage):");
        System.out.println(uniqueBogieIDs);
        System.out.println("Total Unique Bogies: " + uniqueBogieIDs.size());
    }
}
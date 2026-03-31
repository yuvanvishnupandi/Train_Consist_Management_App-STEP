import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Train Consist Management App
 * Use Case 5: Preserve Insertion Order of Bogies (LinkedHashSet)
 */
public class UseCase5LinkedHashSetOperations {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC5: Preserve Insertion Order (LinkedHashSet) ---\n");

        // 1. Create a LinkedHashSet<String> to represent the train formation
        Set<String> trainFormation = new LinkedHashSet<>();

        // 2. Attach bogies: Engine, Sleeper, Cargo, Guard
        System.out.println("Attaching bogies to the train engine...");
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Current Formation: " + trainFormation + "\n");

        // 3. Attempt to attach a duplicate bogie intentionally
        System.out.println("Attempting to attach a duplicate 'Sleeper' bogie...");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("-> System safely rejected duplicate 'Sleeper' (Automatic Deduplication).");
        }

        // 4. Display the final formation order
        System.out.println("\nFinal Train Formation (Notice exact physical sequence is preserved):");
        System.out.println(trainFormation);
        System.out.println("Total Unique Bogies: " + trainFormation.size());
    }
}
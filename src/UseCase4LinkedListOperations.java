import java.util.LinkedList;

/**
 * Train Consist Management App
 * Use Case 4: Maintain Ordered Bogie IDs (LinkedList)
 */
public class UseCase4LinkedListOperations {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC4: Ordered Train Consist (LinkedList) ---\n");

        // 1. Create a LinkedList<String> for the consist
        LinkedList<String> trainConsist = new LinkedList<>();

        // 2. Add bogies: Engine, Sleeper, AC, Cargo, Guard
        System.out.println("Assembling initial train consist...");
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");
        System.out.println("Current Consist: " + trainConsist + "\n");

        // 3. Insert a Pantry Car at position 2
        // Note: In Java Lists, index 0 is the first item, index 1 is the second, index 2 is the third.
        System.out.println("Inserting 'Pantry Car' at position 2...");
        trainConsist.add(2, "Pantry Car");
        System.out.println("Current Consist: " + trainConsist + "\n");

        // 4. Remove the first and last bogie
        System.out.println("Detaching the first bogie (Engine) and last bogie (Guard)...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 5. Display the final ordered train consist
        System.out.println("\nFinal Ordered Train Consist:");
        System.out.println(trainConsist);
        System.out.println("Total Bogies: " + trainConsist.size());
    }
}
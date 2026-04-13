import java.util.Arrays;

public class ConsistManagementApp {
    public static void main(String[] args) {
        // Unsorted array of bogie IDs
        String[] consist = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        System.out.println("--- Train Consist Management: Binary Search ---");
        System.out.println("Initial Array: " + Arrays.toString(consist));
        System.out.println("-----------------------------------------------");

        // Test Case 1: Searching for an existing bogie (will sort array first)
        performSearch(consist, "BG309");

        // Test Case 2: Searching for a non-existent bogie
        performSearch(consist, "BG999");

        // Test Case 3: First element match
        performSearch(consist, "BG101");
        
        // Test Case 4: Last element match
        performSearch(consist, "BG550");

        System.out.println("-----------------------------------------------");
    }

    public static void performSearch(String[] array, String key) {
        System.out.print("Searching for [" + key + "]... ");
        
        boolean found = BinaryBogieSearcher.binarySearch(array, key);
        
        if (found) {
            System.out.println("RESULT: Bogie Found.");
        } else {
            System.out.println("RESULT: Bogie NOT Found.");
        }
    }
}
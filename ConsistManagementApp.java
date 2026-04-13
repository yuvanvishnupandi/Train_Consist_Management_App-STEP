public class ConsistManagementApp {
    public static void main(String[] args) {
        // List of bogie IDs in the consist (unsorted)
        String[] consist = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        System.out.println("--- Train Consist Management: Linear Search ---");

        // Test Case 1: Searching for an existing bogie
        performSearch(consist, "BG309");

        // Test Case 2: Searching for a non-existent bogie
        performSearch(consist, "BG999");

        // Test Case 3: First element match
        performSearch(consist, "BG101");
        
        System.out.println("------------------------------------------------");
    }

    public static void performSearch(String[] array, String key) {
        System.out.print("Searching for [" + key + "]... ");
        
        boolean found = BogieSearcher.linearSearch(array, key);
        
        if (found) {
            System.out.println("RESULT: Bogie Found.");
        } else {
            System.out.println("RESULT: Bogie NOT Found.");
        }
    }
}
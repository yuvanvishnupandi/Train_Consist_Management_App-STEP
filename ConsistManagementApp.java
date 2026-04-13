public class ConsistManagementApp {
    public static void main(String[] args) {
        String[] populatedConsist = {"BG101", "BG205", "BG309"};
        String[] emptyConsist = {}; // Simulating an empty train

        System.out.println("--- Train Consist Management: Defensive Search ---");

        // Test Case 1 & 3: Valid search where data exists
        System.out.println("\n[Test 1] Searching in a populated train:");
        performSafeSearch(populatedConsist, "BG205");

        // Test Case 2: Invalid search where data is EMPTY (Triggers Exception)
        System.out.println("\n[Test 2] Searching in an EMPTY train:");
        performSafeSearch(emptyConsist, "BG101");
        
        System.out.println("\n--------------------------------------------------");
    }

    public static void performSafeSearch(String[] array, String key) {
        try {
            System.out.print("Attempting to search for [" + key + "]... ");
            
            // This method might throw an IllegalStateException
            boolean found = SafeBogieSearcher.search(array, key);
            
            if (found) {
                System.out.println("RESULT: Bogie Found.");
            } else {
                System.out.println("RESULT: Bogie NOT Found.");
            }
        } catch (IllegalStateException e) {
            // Catching the runtime exception so the user gets a meaningful message 
            // instead of the program just crashing.
            System.out.println("\n" + e.getMessage());
        }
    }
}
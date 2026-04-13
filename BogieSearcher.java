public class BogieSearcher {

    // Performs Linear Search to find a specific Bogie ID
    public static boolean linearSearch(String[] bogieIds, String searchKey) {
        // Step 1: Traverse the array sequentially
        for (int i = 0; i < bogieIds.length; i++) {
            
            // Step 2: Compare each element using .equals() for String safety
            if (bogieIds[i].equals(searchKey)) {
                // Step 3: Early Termination - found it!
                return true; 
            }
        }
        
        // Step 4: If loop finishes, the ID was not found
        return false;
    }
}
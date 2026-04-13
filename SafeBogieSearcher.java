public class SafeBogieSearcher {

    public static boolean search(String[] bogieIds, String searchKey) {
        // STATE VALIDATION (Fail-Fast Principle): 
        // If the array is empty (or completely missing), stop immediately!
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("CRITICAL ERROR: Cannot perform search. The train consist is completely empty!");
        }

        // If validation passes, proceed with a normal search
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                return true; // Match found
            }
        }
        
        return false; // Not found
    }
}
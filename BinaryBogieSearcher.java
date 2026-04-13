import java.util.Arrays;

public class BinaryBogieSearcher {

    // Performs optimized Binary Search to find a Bogie ID
    public static boolean binarySearch(String[] bogieIds, String searchKey) {
        
        // Precondition: Binary search ONLY works on sorted data.
        // We sort the array first to handle unsorted inputs automatically.
        Arrays.sort(bogieIds); 

        int low = 0;
        int high = bogieIds.length - 1;

        // Loop until the search range is exhausted
        while (low <= high) {
            // Find the middle index
            int mid = low + (high - low) / 2; 

            // Compare strings lexicographically using .compareTo()
            int comparisonResult = searchKey.compareTo(bogieIds[mid]);

            if (comparisonResult == 0) {
                return true; // Match found!
            } 
            else if (comparisonResult < 0) {
                // Key is alphabetically BEFORE mid, so discard right half
                high = mid - 1; 
            } 
            else {
                // Key is alphabetically AFTER mid, so discard left half
                low = mid + 1; 
            }
        }
        
        // If the loop finishes, the ID does not exist
        return false;
    }
}
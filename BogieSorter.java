public class BogieSorter {

    // Method to sort an array using Bubble Sort
    public static void bubbleSortCapacities(int[] capacities) {
        int n = capacities.length;
        
        // Outer loop for multiple passes over the array
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Optimization: check if array is already sorted
            
            // Inner loop compares adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                
                // If the left element is greater than the right element, swap them
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                    
                    swapped = true;
                }
            }
            
            // If no two elements were swapped in the inner loop, the array is sorted
            if (!swapped) {
                break;
            }
        }
    }
}
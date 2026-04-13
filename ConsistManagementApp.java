public class ConsistManagementApp {
    public static void main(String[] args) {
        // Array representing passenger bogie capacities
        int[] bogieCapacities = {72, 56, 24, 70, 60};

        System.out.println("--- Train Consist Management: Capacity Sorting ---");
        
        // Display unsorted array
        System.out.print("Unsorted Capacities: ");
        printArray(bogieCapacities);

        // Perform Bubble Sort (No library methods used!)
        BogieSorter.bubbleSortCapacities(bogieCapacities);

        // Display sorted array
        System.out.print("Sorted Capacities:   ");
        printArray(bogieCapacities);
        
        System.out.println("--------------------------------------------------");
    }

    // Helper method to display the array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
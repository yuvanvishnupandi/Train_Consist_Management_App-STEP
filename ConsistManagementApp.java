import java.util.Arrays;

public class ConsistManagementApp {
    public static void main(String[] args) {
        // 1. Array of bogie type names
        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        System.out.println("--- Train Consist Management: Bogie Name Sorting ---");
        
        // 2. Print unsorted list using Arrays.toString()
        System.out.println("Unsorted Bogies: " + Arrays.toString(bogieNames));

        // 3. Sort alphabetically using built-in library method
        Arrays.sort(bogieNames);

        // 4. Print the sorted result
        System.out.println("Sorted Bogies:   " + Arrays.toString(bogieNames));
        
        System.out.println("----------------------------------------------------");
    }
}
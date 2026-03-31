import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 1. Create a Bogie class with fields such as name and capacity
class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    // This helps print the object nicely instead of getting memory addresses
    @Override
    public String toString() {
        return "Bogie Type: " + name + " | Capacity: " + capacity + " seats";
    }
}

/**
 * Train Consist Management App
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 */
public class UseCase7SortBogies {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC7: Sort Bogies by Capacity (Comparator) ---\n");

        // 2. Create a List<Bogie> to store passenger bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // 3. Add bogies like Sleeper, AC Chair, and First Class with capacities
        System.out.println("Registering passenger bogies...");
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));

        System.out.println("\n--- Unordered List (As Added) ---");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }

        // 4. Use Comparator.comparingInt() to define sorting based on capacity
        // 5. Sort the list
        System.out.println("\nSorting bogies by capacity using Comparator...");
        passengerBogies.sort(Comparator.comparingInt(Bogie::getCapacity));

        // Display the sorted bogies
        System.out.println("\n--- Sorted List (Lowest to Highest Capacity) ---");
        for (Bogie b : passengerBogies) {
            System.out.println(b);
        }
        System.out.println("-------------------------------------------------");
    }
}
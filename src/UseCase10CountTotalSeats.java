import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App
 * Use Case 10: Count Total Seats in Train (reduce)
 */
public class UseCase10CountTotalSeats {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC10: Calculate Total Seating Capacity (Streams) ---\n");

        // 1. Create a List of Bogies (Reusing the Bogie class from UC7)
        List<Bogie> passengerBogies = new ArrayList<>();

        System.out.println("Assembling train with passenger bogies...");
        passengerBogies.add(new Bogie("Sleeper", 72));
        passengerBogies.add(new Bogie("AC Chair", 56));
        passengerBogies.add(new Bogie("First Class", 24));
        passengerBogies.add(new Bogie("General Class", 90));

        // Display current bogies
        for (Bogie b : passengerBogies) {
            System.out.println("- " + b.getName() + " (" + b.getCapacity() + " seats)");
        }

        System.out.println("\nCalculating total capacity using map() and reduce()...");

        // 2. Create a stream using stream()
        // 3. Apply map() to extract the numeric capacity values
        // 4. Use reduce(0, Integer::sum) to calculate the grand total
        int totalCapacity = passengerBogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        // 5. Display the final total seating capacity
        System.out.println("======================================");
        System.out.println("Total Train Seating Capacity: " + totalCapacity + " seats");
        System.out.println("======================================");
    }
}
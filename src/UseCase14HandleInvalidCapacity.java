// 1. Create a custom exception class representing a domain-specific error
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message); // Passes the error message up to the parent Exception class
    }
}

// 2. Create the Passenger Bogie class that enforces the business rules
class PassengerBogie {
    private String name;
    private int capacity;

    // 3. Declare the constructor with 'throws' so callers know it might fail
    public PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        // 4. Fail-Fast Validation: Validate capacity inside the constructor
        if (capacity <= 0) {
            // Throw the exception immediately if the rule is broken
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }

        // If it passes validation, create the object safely
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Bogie Type: " + name + " | Capacity: " + capacity + " seats";
    }
}

/**
 * Train Consist Management App
 * Use Case 14: Handle Invalid Bogie Capacity (Custom Exception)
 */
public class UseCase14HandleInvalidCapacity {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC14: Fail-Fast Capacity Validation ---\n");

        System.out.println("Attempting to assemble passenger bogies...\n");

        // Test 1: Valid Capacity
        attemptBogieCreation("Sleeper", 72);

        // Test 2: Invalid Capacity (Negative)
        attemptBogieCreation("AC Chair", -10);

        // Test 3: Invalid Capacity (Zero)
        attemptBogieCreation("First Class", 0);

        // Test 4: Another Valid Capacity
        attemptBogieCreation("General Class", 90);

        System.out.println("\n--- Program continues execution safely after handling errors! ---");
    }

    // Helper method to keep our main clean and demonstrate try-catch usage
    private static void attemptBogieCreation(String name, int capacity) {
        System.out.println("Trying to create: " + name + " with capacity " + capacity + "...");

        try {
            // This line will jump straight to the 'catch' block if it fails
            PassengerBogie bogie = new PassengerBogie(name, capacity);
            System.out.println("  -> [SUCCESS] " + bogie.toString() + " created safely.\n");

        } catch (InvalidCapacityException e) {
            // 5. Catch the custom exception and display the error message without crashing
            System.out.println("  -> [FAILED]  Validation Error: " + e.getMessage() + "\n");
        }
    }
}
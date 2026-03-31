import java.util.ArrayList;
import java.util.List;

/**
 * Train Consist Management App
 * Use Case 1: Initialize Train and Display Consist Summary
 */
public class UseCase1InitializeTrain {

    // Main Method - Entry point of the Java application
    public static void main(String[] args) {

        // 1. Application prints welcome message
        System.out.println("=== Train Consist Management App ===");

        // 2. Initialize an empty List using ArrayList to store bogies
        // (Using String temporarily as a placeholder until specific Bogie classes are introduced)
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train consist initialized.");

        // 3. Display the initial bogie count using size()
        System.out.println("Initial bogie count: " + trainConsist.size());

        // 4. Program continues
        System.out.println("Ready for operations.");
    }
}
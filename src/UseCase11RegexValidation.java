import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Train Consist Management App
 * Use Case 11: Validate Train ID & Cargo Codes (Regex)
 */
public class UseCase11RegexValidation {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC11: Validate Formats with Regex ---\n");

        // 1. Define regex patterns based on business rules
        // Train ID: "TRN-" followed by exactly 4 digits (\d is a digit, {4} means exactly four times)
        String trainIdRegex = "TRN-\\d{4}";

        // Cargo Code: "PET-" followed by exactly 2 uppercase letters ([A-Z] means uppercase, {2} means exactly two)
        String cargoCodeRegex = "PET-[A-Z]{2}";

        // 2. Compile patterns using the Pattern class
        Pattern trainIdPattern = Pattern.compile(trainIdRegex);
        Pattern cargoCodePattern = Pattern.compile(cargoCodeRegex);

        // --- Test Data (Simulating user input based on teacher's test cases) ---
        String[] testTrainIds = {"TRN-1234", "TRAIN12", "TRN-123", "TRN-12345", "1234-TRN", ""};
        String[] testCargoCodes = {"PET-AB", "PET-ab", "PET123", "AB-PET", ""};

        System.out.println("--- Validating Train IDs ---");
        for (String id : testTrainIds) {
            // 3. Create Matcher object for each input
            Matcher matcher = trainIdPattern.matcher(id);

            // 4. Use matches() to validate exact format
            if (matcher.matches()) {
                System.out.println("[VALID]   " + id);
            } else {
                System.out.println("[INVALID] " + (id.isEmpty() ? "<empty string>" : id) + " -> Expected format: TRN-1234");
            }
        }

        System.out.println("\n--- Validating Cargo Codes ---");
        for (String code : testCargoCodes) {
            Matcher matcher = cargoCodePattern.matcher(code);

            if (matcher.matches()) {
                System.out.println("[VALID]   " + code);
            } else {
                System.out.println("[INVALID] " + (code.isEmpty() ? "<empty string>" : code) + " -> Expected format: PET-AB (Uppercase only)");
            }
        }
        System.out.println("-----------------------------------------");
    }
}
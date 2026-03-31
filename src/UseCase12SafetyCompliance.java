import java.util.ArrayList;
import java.util.List;

// 1. Create a GoodsBogie class with type and cargo fields
class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return "Type: " + type + " | Cargo: " + cargo;
    }
}

/**
 * Train Consist Management App
 * Use Case 12: Safety Compliance Check for Goods Bogies (allMatch)
 */
public class UseCase12SafetyCompliance {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");
        System.out.println("--- UC12: Goods Bogie Safety Compliance Check ---\n");

        // 2. Create a collection of goods bogies
        List<GoodsBogie> goodsTrain = new ArrayList<>();

        System.out.println("Assembling Goods Train Phase 1 (Safe Configuration)...");
        goodsTrain.add(new GoodsBogie("Rectangular", "Coal"));
        goodsTrain.add(new GoodsBogie("Cylindrical", "Petroleum")); // Valid
        goodsTrain.add(new GoodsBogie("Rectangular", "Steel"));

        // Print the consist
        for (GoodsBogie gb : goodsTrain) {
            System.out.println("- " + gb);
        }

        // 3. Convert to stream and use allMatch() to validate
        // Rule: If the type is "Cylindrical", the cargo MUST be "Petroleum".
        System.out.println("\nRunning automated safety compliance check...");
        boolean isTrainSafe = goodsTrain.stream()
                .allMatch(bogie -> {
                    if (bogie.getType().equals("Cylindrical")) {
                        return bogie.getCargo().equals("Petroleum");
                    }
                    return true; // If it's not cylindrical, it passes the rule
                });

        // 4. Display result
        if (isTrainSafe) {
            System.out.println("-> [COMPLIANT] Train is safe to depart.");
        } else {
            System.out.println("-> [VIOLATION] Unsafe cargo configuration detected! Departure halted.");
        }

        System.out.println("\n------------------------------------------------");

        // --- Demonstrate a Failure ---
        System.out.println("\nAssembling Goods Train Phase 2 (Unsafe Configuration)...");
        goodsTrain.add(new GoodsBogie("Cylindrical", "Coal")); // INVALID: Coal in a tank!

        for (GoodsBogie gb : goodsTrain) {
            System.out.println("- " + gb);
        }

        System.out.println("\nRunning automated safety compliance check...");
        boolean isTrainSafeAfterError = goodsTrain.stream()
                .allMatch(bogie -> {
                    if (bogie.getType().equals("Cylindrical")) {
                        return bogie.getCargo().equals("Petroleum");
                    }
                    return true;
                });

        if (isTrainSafeAfterError) {
            System.out.println("-> [COMPLIANT] Train is safe to depart.");
        } else {
            System.out.println("-> [VIOLATION] Unsafe cargo configuration detected! Departure halted.");
        }
    }
}
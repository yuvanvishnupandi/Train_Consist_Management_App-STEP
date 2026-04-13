public class ConsistManagementApp {
    public static void main(String[] args) {
        GoodsBogie cylindricalBogie = new GoodsBogie("G101", "Cylindrical");
        GoodsBogie rectangularBogie = new GoodsBogie("G102", "Rectangular");

        // Attempt 1: Safe assignment
        processAssignment(cylindricalBogie, "Petroleum");

        System.out.println("\n--- Next Assignment ---");

        // Attempt 2: UNSAFE assignment (Rectangular + Petroleum)
        processAssignment(rectangularBogie, "Petroleum");

        System.out.println("\nFinal Consist Report:");
        System.out.println(cylindricalBogie.getStatus());
        System.out.println(rectangularBogie.getStatus());
    }

    public static void processAssignment(GoodsBogie bogie, String cargo) {
        try {
            bogie.assignCargo(cargo);
        } catch (CargoSafetyException e) {
            // This catches our custom exception
            System.err.println("CATCH BLOCK: " + e.getMessage());
        } finally {
            // This always runs, whether it worked or failed
            System.out.println("FINALLY BLOCK: Safety validation routine completed.");
        }
    }
}
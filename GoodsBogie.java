public class GoodsBogie {
    private String bogieId;
    private String shape; 
    private String currentCargo = "Empty";

    public GoodsBogie(String bogieId, String shape) {
        this.bogieId = bogieId;
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        System.out.println("Attempting to assign [" + cargoType + "] to Bogie [" + bogieId + " (" + shape + ")]...");
        
        // Safety Check: Petroleum cannot be in a Rectangular bogie
        if (shape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
            throw new CargoSafetyException("CRITICAL SAFETY VIOLATION: Petroleum cannot be assigned to a Rectangular bogie!");
        }

        this.currentCargo = cargoType;
        System.out.println("SUCCESS: " + cargoType + " assigned to bogie " + bogieId);
    }

    public String getStatus() {
        return "Bogie " + bogieId + " (" + shape + ") Status: " + currentCargo;
    }
}
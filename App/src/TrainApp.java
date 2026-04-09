import java.util.*;

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    String type;   // Rectangular / Cylindrical
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    // Method to assign cargo safely
    void assignCargo(String cargo) {
        try {
            // Safety Rule
            if (type.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be assigned to Rectangular bogie");
            }

            // Valid assignment
            this.cargo = cargo;
            System.out.println("Cargo '" + cargo + "' assigned to " + type + " bogie");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment attempt completed for " + type + " bogie\n");
        }
    }

    void display() {
        System.out.println("Bogie Type: " + type + ", Cargo: " + (cargo != null ? cargo : "None"));
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe assignment
        b1.assignCargo("Petroleum");

        // Unsafe assignment
        b2.assignCargo("Petroleum");

        // Another safe assignment
        b2.assignCargo("Coal");

        // Display final state
        System.out.println("Final Bogie Status:");
        b1.display();
        b2.display();

        System.out.println("Program continues safely...");
    }
}
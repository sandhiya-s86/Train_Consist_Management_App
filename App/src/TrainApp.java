import java.util.*;

// Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// Goods Bogie Class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type) {
        this.type = type;
    }

    void assignCargo(String cargo) {
        try {
            if (type.equalsIgnoreCase("Rectangular") &&
                    cargo.equalsIgnoreCase("Petroleum")) {

                throw new CargoSafetyException(
                        "Unsafe: Petroleum cannot be assigned to Rectangular bogie"
                );
            }

            this.cargo = cargo;
            System.out.println("Cargo '" + cargo +
                    "' assigned to " + type + " bogie");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Cargo assignment attempt completed for "
                    + type + " bogie\n");
        }
    }

    void display() {
        System.out.println("Bogie Type: " + type +
                ", Cargo: " + (cargo != null ? cargo : "None"));
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // =================================================
        // UC15 - Cargo Safety Validation
        // =================================================
        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");
        b2.assignCargo("Petroleum");
        b2.assignCargo("Coal");

        System.out.println("Final Bogie Status:");
        b1.display();
        b2.display();

        // =================================================
        // UC16 - Bubble Sort Passenger Capacities
        // =================================================
        System.out.println("\n=== UC16: Sort Passenger Bogies by Capacity ===");

        int[] capacities = {72, 56, 24, 70, 60};

        System.out.print("Original Capacities: ");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - 1 - i; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.print("\nSorted Capacities : ");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // =================================================
        // UC17 - Sort Bogie Names using Arrays.sort()
        // =================================================
        System.out.println("\n\n=== UC17: Sort Bogie Names ===");

        String[] bogieNames = {
                "Sleeper",
                "AC Chair",
                "First Class",
                "General",
                "Luxury"
        };

        System.out.println("Original Names: " +
                Arrays.toString(bogieNames));

        Arrays.sort(bogieNames);

        System.out.println("Sorted Names  : " +
                Arrays.toString(bogieNames));

        // =================================================
        // UC18 - Linear Search for Bogie ID
        // =================================================
        System.out.println("\n=== UC18: Search Bogie ID (Linear Search) ===");

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        String searchId = "BG309";

        System.out.println("Available Bogie IDs: " +
                Arrays.toString(bogieIds));

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchId + " found.");
        } else {
            System.out.println("Bogie ID " + searchId + " not found.");
        }

        // =================================================
        // UC19 - Binary Search for Bogie ID
        // =================================================
        System.out.println("\n=== UC19: Search Bogie ID (Binary Search) ===");

        String[] sortedIds = {
                "BG101",
                "BG205",
                "BG309",
                "BG412",
                "BG550"
        };

        String key = "BG412";

        int low = 0;
        int high = sortedIds.length - 1;
        boolean isFound = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(sortedIds[mid]);

            if (result == 0) {
                isFound = true;
                break;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println("Sorted IDs: " +
                Arrays.toString(sortedIds));

        if (isFound) {
            System.out.println("Bogie ID " + key + " found.");
        } else {
            System.out.println("Bogie ID " + key + " not found.");
        }

        System.out.println("\nProgram continues safely...");
    }
}
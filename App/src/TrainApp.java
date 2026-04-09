import java.util.ArrayList;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create ArrayList for passenger bogies
        ArrayList<String> passengerBogies = new ArrayList<>();

        // Step 2: Add passenger bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Step 3: Display bogies after adding
        System.out.println("Passenger Bogies after addition:");
        System.out.println(passengerBogies);

        // Step 4: Remove a bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // Step 5: Display bogies after removal
        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        // Step 6: Check if Sleeper exists
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie exists in the train.");
        } else {
            System.out.println("Sleeper bogie not found.");
        }

        // Step 7: Final list state
        System.out.println("Final Passenger Bogies:");
        System.out.println(passengerBogies);

        System.out.println("Program continues...");
    }
}
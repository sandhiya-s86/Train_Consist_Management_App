import java.util.HashSet;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create HashSet for bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Step 2: Add bogie IDs (including duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        // Step 3: Display unique bogie IDs
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIDs);

        System.out.println("Program continues...");
    }
}
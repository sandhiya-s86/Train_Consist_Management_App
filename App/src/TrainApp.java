import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        // Step 1: Print welcome message
        System.out.println("=== Train Consist Management App ===");

        // Step 2: Initialize empty train consist (list of bogies)
        List<String> trainConsist = new ArrayList<>();

        // Step 3: Display initial bogie count
        System.out.println("Train initialized successfully.");
        System.out.println("Initial number of bogies: " + trainConsist.size());

        // Step 4: Program continues...
        System.out.println("System is ready for further operations.");
    }
}
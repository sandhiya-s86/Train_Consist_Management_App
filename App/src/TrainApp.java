import java.util.regex.*;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        if (trainMatcher.matches()) {
            System.out.println("Train ID is valid");
        } else {
            System.out.println("Train ID is invalid");
        }

        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code is valid");
        } else {
            System.out.println("Cargo Code is invalid");
        }

        System.out.println("Program continues...");
    }
}
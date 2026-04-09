import java.util.*;

// Custom Exception Class
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie Class
class PassengerBogie {
    String type;
    int capacity;

    // Constructor with validation
    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    void display() {
        System.out.println("Bogie Type: " + type + ", Capacity: " + capacity);
    }
}

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<PassengerBogie> train = new ArrayList<>();

        try {
            // Valid bogies
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            PassengerBogie b2 = new PassengerBogie("AC Chair", 60);

            train.add(b1);
            train.add(b2);

            // Invalid bogie (will throw exception)
            PassengerBogie b3 = new PassengerBogie("First Class", 0);
            train.add(b3);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies
        System.out.println("Final Train Composition:");
        for (PassengerBogie b : train) {
            b.display();
        }

        System.out.println("Program continues safely...");
    }
}
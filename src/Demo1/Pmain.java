package Demo1;

public class Pmain {

    // Main method for testing
    public static void main(String[] args) {
        // Create Person objects with different constructors
        PMethod person1 = new PMethod("Rani", 25, "Female");
        PMethod person2 = new PMethod("Bob", 26);

        // Display person details
        person1.displayInfo();

        person2.displayInfo();

        // Modify age and display updated details
        person2.setAge(26);

        person2.displayInfo();
    }
}


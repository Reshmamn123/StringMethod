package Demo1;

public class main {

    // Main method for testing
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Rani", 25, "Female");

        // Display person details
        person.displayInfo();

        // Modify age and display updated details
        person.setAge(26);
        person.displayInfo();
    }
}

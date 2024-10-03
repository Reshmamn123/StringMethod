package Demo1;

public class PMethod {
    // Attributes
    private String name;
    private int age;
    private String gender;

    // Constructor to initialize all attributes
    public PMethod(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Additional constructor with default gender value
    public PMethod(String name, int age) {
        this(name, age, "NA"); // Calls the main constructor with default gender "NA"
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for gender
    public String getGender() {
        return gender;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

}


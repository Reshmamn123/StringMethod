package Demo4.java;

// Person class
class Person {
    String name;
    int age;

    // Constructor for Person
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method for Person
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Student class extends Person
class Student extends Person {
    int grade;

    // Constructor for Student
    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    // Override display method for Student
    @Override
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

// Teacher class extends Person
class Teacher extends Person {
    String subject;

    // Constructor for Teacher
    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Override display method for Teacher
    @Override
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Subject: " + subject);
    }
}


public class Overriding {
    public static void main(String[] args) {
        // Creating an instance of Person
        Person person = new Person("Alice", 30);
        person.display();

        // Creating an instance of Student
        Student student = new Student("Bob", 20, 12);
        student.display();

        // Creating an instance of Teacher
        Teacher teacher = new Teacher("Charlie", 40, "Mathematics");
        teacher.display();
    }
}


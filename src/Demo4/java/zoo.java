package Demo4.java;

// Base class
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Dog class extending Animal
class Dog extends Animal {
    // Override sound method
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

// Cat class extending Animal
class Cat extends Animal {
    // Override sound method
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

        // Lion class extending Animal
class Lion extends Animal {
    // Override sound method
    @Override
    void sound() {
        System.out.println("Roar");
    }

}

public class zoo {
    public static void main(String[] args) {
        // Create an array of Animal references
        Animal[] animals = new Animal[3];

        // Populate the array with instances of Dog, Cat, and Lion
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Lion();

        // Iterate over the array and call sound() using polymorphism
        for (Animal animal : animals) {
            animal.sound(); // Calls the overridden sound method
        }
    }

}



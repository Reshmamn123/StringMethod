package demo2;

public class main {

    // Main method to test the class
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Display dimensions
        rectangle.displayDimensions();

        // Calculate and display area
        double area = rectangle.calculateArea();
        System.out.println("Area: " + area);

        // Calculate and display perimeter
        double perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter: " + perimeter);
    }
}



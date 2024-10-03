package Demo3;

public class Rectangle {
    // Attributes
    private double length;
    private double width;

    // Constructor 1: No parameters (defaults to 1x1)
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor 2: One parameter (makes it a square)
    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to display dimensions
    public void displayDimensions() {
        System.out.println("Length: " + length + ", Width: " + width);
    }

    // Constructor 3: Two parameters (length and width)
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }




}

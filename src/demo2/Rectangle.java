package demo2;

public class Rectangle {

    // Attributes
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
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
        public void displayDimensions () {
            System.out.println("Length: " + length + ", Width: " + width);
    }


}

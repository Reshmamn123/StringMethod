package Demo3;

public class main {
    public static void main(String[] args) {
    // Using the no-argument constructor (default 1x1 rectangle)
    Rectangle rect1 = new Rectangle();
    System.out.println("Rectangle 1:");
    rect1.displayDimensions();
    System.out.println("Area: " + rect1.calculateArea());
    System.out.println("Perimeter: " + rect1.calculatePerimeter());
    System.out.println();

    // Using the one-argument constructor (square)
    Rectangle rect2 = new Rectangle(5.0);
    System.out.println("Rectangle 2 (Square):");
    rect2.displayDimensions();
    System.out.println("Area: " + rect2.calculateArea());
    System.out.println("Perimeter: " + rect2.calculatePerimeter());
    System.out.println();

    // Using the two-argument constructor (length and width)
    Rectangle rect3 = new Rectangle(4.0, 3.0);
    System.out.println("Rectangle 3:");
    rect3.displayDimensions();
    System.out.println("Area: " + rect3.calculateArea());
    System.out.println("Perimeter: " + rect3.calculatePerimeter());
}
}


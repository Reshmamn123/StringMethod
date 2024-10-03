package Demo5;

public class Book1 {
    private String title;
    private String author;
    private double price;
    private int publicationYear;

    // Constructor
    public Book1(String title, String author, double price,int publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    // Method to display book info
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("publicationYear:" + publicationYear);
    }

    // Method to calculate discounted price
    public double discountedPrice(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }
}

// Subclass: EBook
public class EBook extends Book {
    private double fileSize; // in MB

    // Constructor
    public EBook(String title, String author, double price,int publicationYear, double fileSize) {
        super(title, author, price,publicationYear); // Call to parent constructor
        this.fileSize = fileSize;
    }

    // Overriding the displayInfo method to include file size

    public void displayInfo() {
        super.displayInfo(); // Call the original displayInfo method
        System.out.println("File Size: " + fileSize + "MB");
    }

    // Overriding the discountedPrice method with a higher discount policy

    public double discountedPrice(double discountPercentage) {
        discountPercentage += 10; // Additional 10% discount for EBooks
        return super.discountedPrice(discountPercentage);
    }

}

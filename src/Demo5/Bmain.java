package Demo5;

public class Bmain {
public static void main(String[] args) {
    // Create a Book object
    Book physicalBook1 = new Book("Java Programming", "John Doe", 29.99);
    physicalBook1.displayInfo();
    System.out.println("Discounted Price: $" + physicalBook1.discountedPrice(15)); // 15% discount
    System.out.println();

    // Create an EBook object
    EBook eBook = new EBook("Advanced Java", "Jane Doe", 19.99, 5.5);
    eBook.displayInfo();
    System.out.println("Discounted Price: $" + eBook.discountedPrice(15)); // 15% discount (but with extra 10%)
}
}

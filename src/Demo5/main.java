package Demo5;

public class main {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill mockingbird", "Harper", 12.99, 1960);
        book1.displayinfo();
        book1.setPrice(10.99);
        book1.setAuthor("Harper lee Revised");
        System.out.println("\nUpdated Book info");
        book1.displayinfo();
    }


}

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book bookA = new Book("bookA", "지은이", true);
        Book bookB = new Book("bookB", "옮긴이", true);
        Book bookC = new Book("bookC", "엮은이", true);
        Book bookD = new Book("bookD", "아이유", true);

        library.addBook(bookA);
        library.addBook(bookB);
        library.addBook(bookC);
        library.addBook(bookD);

        library.deleteBook(bookD);

        library.findAllBooks();

        library.rentalBook("bookA");
        library.returnBook("bookA");

    }
}
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }

    public Book findByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void findAllBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book.getTitle());
            } else {
                System.out.println(book.getTitle() + "은 대여상태 입니다.");
            }
        }
    }

    public void rentalBook(String tilte) {
        Book book = findByTitle(tilte);
        if (book != null) {
            if (book.isAvailable()) {
                book.setAvailable(false);
                System.out.println(book.getTitle() + " 책을 대여했습니다.");
            } else {
                System.out.println("책이 이미 대출중 입니다.");
            }
        } else {
            System.out.println("책을 찾을 수 없습니다.");
        }
    }

    public void returnBook(String title) {
        Book book = findByTitle(title);
        if (book != null) {
            if (!book.isAvailable()) {
                book.setAvailable(true);
                System.out.println(book.getTitle() + " 책을 반납했습니다.");
            } else {
                System.out.println("책이 대출 전입니다.");
            }
        } else {
            System.out.println("책을 찾을 수 없습니다.");
        }
    }
}

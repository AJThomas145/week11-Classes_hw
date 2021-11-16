import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowed;

    public Borrower(String name) {
        this.name = name;
        this.borrowed = new ArrayList<>();
    }

    public int borrowedBooks() {
        return borrowed.size();
    }

    public void borrowBookFromLibrary(Library library) {
        Book book = library.removeBook();
        borrowed.add(book);
    }

    public Book removeBook(){
        return this.borrowed.remove(0);
    }

    public void returnBookToLibrary(Library library) {
        Book book = this.removeBook();
        library.addBook(book);
    }
}

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(){
        this.books = new ArrayList<>();
        this.capacity = 5;
        }

    public void addBook(Book book) {
        this.books.add(book);
           }

    public int countBooks() {
        return this.books.size();
    }

    public boolean freeSpaceInLibrary() {
        if (this.capacity > this.books.size()) {
            return true;
        } else {
            return false;
        }
    }

    public void checkCapacityBeforeAdding(Book book) {
        if (this.freeSpaceInLibrary() == true) {
            addBook(book);
        }

    }

    public Book removeBook() {
        return this.books.remove(0);
    }
}

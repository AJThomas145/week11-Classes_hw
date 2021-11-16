import jdk.jfr.StackTrace;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void setUp() {
        library = new Library();
        book = new Book("How to code", "Zsolt", "Coding");

    }

    @Test
    public void addBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canBookBeAddedToLibrary() {
        assertEquals(true, library.freeSpaceInLibrary());
    }

    @Test
    public void BookCantBeAddedToLibrary() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(false, library.freeSpaceInLibrary());

    }

    @Test
    public void capacityInLibraryToAddBook() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.checkCapacityBeforeAdding(book);
        assertEquals(4, library.countBooks());
    }

    @Test
    public void noCapacityInLibraryToAddBook() {
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.checkCapacityBeforeAdding(book);
        assertEquals(5, library.countBooks());

    }

    @Test
    public void removeBookFromLibrary() {
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.countBooks());

    }
}

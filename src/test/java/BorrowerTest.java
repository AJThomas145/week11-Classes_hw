import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Book book;
    private Library library;
    private Borrower borrower;


    @Before
    public void setUp(){
        book = new Book("How to code", "Zsolt", "Coding");
        library = new Library();
        borrower = new Borrower("Andy");
        library.addBook(book);

    }

    @Test
    public void getBookFromLibrary(){
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.borrowedBooks());
    }

    @Test
    public void removeBookFromBorrower(){
        borrower.borrowBookFromLibrary(library);
        borrower.removeBook();
        assertEquals(0, borrower.borrowedBooks());
    }

    @Test
    public void giveBookBackToLibrary(){
        borrower.borrowBookFromLibrary(library);
        borrower.returnBookToLibrary(library);
        assertEquals(0, borrower.borrowedBooks());
        assertEquals(1, library.countBooks());

    }
}

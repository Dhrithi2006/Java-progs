package library;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
    private Library library;
    private Book book1;


    @Before
    public void setUp() {
        library = new Library();
        book1 = new Book("The Silent Patient", "Alex Michaelides", "67890");
        library.addBook(book1);
    }

    @Test
    public void testIssueBook() {
        assertTrue(library.issueBook("67890"));   
        assertFalse(library.isAvailable("67890")); 
    }

    @Test
    public void testReturnBook() {
        library.issueBook("67890"); 
        assertTrue(library.returnBook("67890"));  
        assertTrue(library.isAvailable("67890")); 
    }

    @Test
    public void testIsAvailable() {
        assertTrue(library.isAvailable("67890")); 
    }
}
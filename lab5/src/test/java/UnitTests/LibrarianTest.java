package UnitTests;

import com.company.Book;
import com.company.BookProto;
import com.company.Magazine;
import com.company.Newspaper;
import com.company.classes.Librarian;
import com.company.enums.BookType;
import com.company.enums.CoverMaterial;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LibrarianTest {

    private final static int PAGE_COUNT = 10;
    private final static String REDACTION = "Test";
    private final static CoverMaterial COVER_MATERIAL = CoverMaterial.LEATHER;
    private final static int COST = 100;
    private final static BookType BOOK_TYPE = BookType.DRAMA;
    private final static Date DATE = new Date(2019, 1, 8);


    @Test
    public static void testGetGeneralCostOfLibrary(){
        List<BookProto> library = new ArrayList<BookProto>(){
            Book book = new Book(PAGE_COUNT, COVER_MATERIAL, COST, BOOK_TYPE);
            Newspaper newspaper = new Newspaper(PAGE_COUNT, COST * 2, DATE);
            Magazine magazine = new Magazine(PAGE_COUNT, COST, REDACTION, DATE);
        };
        int expectedCost = 0;
        for (BookProto book : library) {
            expectedCost += book.cost;
        }
        int actualCost = Librarian.GetGeneralCostOfLibrari(library);
        Assert.assertEquals(expectedCost, actualCost);
    }



}

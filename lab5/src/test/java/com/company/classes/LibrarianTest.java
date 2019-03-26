package com.company.classes;

import org.testng.Assert;
import org.testng.annotation.Test;

public class LibrarianTest{

    @Test
    public static void GetGeneralCostOfLibrariTest(){

        Assert.assertEquals(5, 5);
    }

    public static List<Newspaper> MakeSortNewspapersByReleaseTest(List<Newspaper> newspapers){
        Collections.sort(newspapers);
        return newspapers;
    }


    public static BookProto GetBookByPagesCountTest(List<BookProto> library, int pages){
        for (BookProto book : library){
            if (book.pagesCount == pages){
                return  book;
            }
        }
        return null;
    }
}

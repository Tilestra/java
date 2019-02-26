package com.company.classes;

import com.company.BookProto;
import com.company.Magazine;
import com.company.Newspaper;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Librarian{


    public static int GetGeneralCostOfLibrari(List<BookProto> library){
        int result = 0;
        for (var book : library) {
            result += book.getCost();
        }

        return result;
    }

    public static List<Newspaper> MakeSortNewspapersByRelease(List<Newspaper> newspapers){
        // Ascending sorting
        Collections.sort(newspapers);
        return newspapers;
    }


    public static BookProto GetBookByPagesCount(List<BookProto> library, int pages){
        for (var book : library){
            if (book.getPagesCount() == pages){
                return  book;
            }
        }
        return null;
    }
}

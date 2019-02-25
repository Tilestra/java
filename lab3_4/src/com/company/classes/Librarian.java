package com.company.classes;

import com.company.BookProto;
import com.company.Magazine;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Librarian implements Comparable<Magazine>{

    @Override
    public int compareTo(Magazine o) {
        return o.getRedaction().getReleaseDate().compareTo(o.getRedaction().getReleaseDate());
    }


    public static int GetGeneralCostOfLibrari(List<BookProto> library){
        int result = 0;
        for (var book : library) {
            result += book.getCost();
        }

        return result;
    }

    public static List<Magazine> MakeSortMagazinesByRelease(List<Magazine> magazines){
        return null;
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

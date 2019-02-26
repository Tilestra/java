package com.company;

import com.company.classes.Librarian;
import com.company.enums.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

public class Main {


    public static void main(String[] args) {

        try{
            Date magazineReleasedate = new Date(2019, 2, 25);
            Date newspaperOutDate = new Date(2019, 1, 8);
            String magazineRedactionName = "Deagostiny";

            BookProto book1 = new Book(300, CoverMaterial.LEATHER, 300, BookType.FANTASTIC);

            BookProto magazine1 = new Magazine(20, 3, magazineRedactionName, magazineReleasedate);

            List<Newspaper> newspapers = new ArrayList<Newspaper>();

            BookProto newspaper1 = new Newspaper(15, 1, newspaperOutDate);
            BookProto newspaper2 = new Newspaper(12, 1, magazineReleasedate);
            BookProto newspaper3 = new Newspaper(13, 2, newspaperOutDate);
            newspapers.add((Newspaper) newspaper1);
            newspapers.add((Newspaper) newspaper2);
            newspapers.add((Newspaper) newspaper3);

            for (var newsp : Librarian.MakeSortNewspapersByRelease(newspapers)){
                System.out.println(newsp.getOutDate().toString());
            }


        }catch (Exception exc){


        }finally {

        }
    }
}

package com.company;

import com.company.classes.Librarian;
import com.company.classes.Log;
import com.company.enums.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {


    public static void main(String[] args) throws IOException {

        try{
            Date magazineReleaseDate = new Date(2019, 2, 25);
            Date newspaperOutDate = new Date(2019, 1, 8);
            String magazineRedactionName = "Deagostiny";



            BookProto book1 = new Book(300, CoverMaterial.LEATHER, 300, BookType.FANTASTIC);

            BookProto magazine1 = new Magazine(20, 3, magazineRedactionName, magazineReleaseDate);

            List<Newspaper> newspapers = new ArrayList<Newspaper>();

            BookProto newspaper1 = new Newspaper(15, 1, newspaperOutDate);
            BookProto newspaper2 = new Newspaper(12, 1, magazineReleaseDate);
            BookProto newspaper3 = new Newspaper(13, 2, newspaperOutDate);
            newspapers.add((Newspaper) newspaper1);
            newspapers.add((Newspaper) newspaper2);
            newspapers.add((Newspaper) newspaper3);

            for (var newsp : Librarian.MakeSortNewspapersByRelease(newspapers)){
                System.out.println(newsp.getOutDate().toString());
            }




        }catch (Exception exc){

            Log.getLog().throwing(Main.class.toString(), "Main", new Throwable(exc.getMessage()));

        }
    }
}

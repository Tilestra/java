package com.company;

import com.company.classes.Librarian;
import com.company.classes.Serializer;
import com.company.enums.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        try{
            Date magazineReleaseDate = new Date(2019, 2, 25);
            Date newspaperOutDate = new Date(2019, 1, 8);

            /*String magazineRedactionName = "Deagostiny";
            BookProto book1 = new Book(300, CoverMaterial.LEATHER, 300, BookType.FANTASTIC);
            BookProto magazine1 = new Magazine(20, 3, magazineRedactionName, magazineReleasedate);*/

            List<BookProto> newspapers = new ArrayList();

            BookProto newspaper1 = new Newspaper(15, 1, newspaperOutDate);
            BookProto newspaper2 = new Newspaper(12, 1, magazineReleaseDate);
            BookProto newspaper3 = new Newspaper(13, 2, newspaperOutDate);
            newspapers.add(newspaper1);
            newspapers.add(newspaper2);
            newspapers.add(newspaper3);



            //Serializer.SerializeBooksToDat(newspapers);
            //Serializer.AnalyzeBooksXML();
            Serializer.SerializeBooksToXML(newspapers);

        }catch (Exception exc){
            System.out.println(exc.getMessage());
        }
    }
}

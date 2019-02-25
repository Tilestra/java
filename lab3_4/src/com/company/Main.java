package com.company;
import com.company.enums.*;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        try{
            BookProto book1 = new Book(300, CoverMaterial.LEATHER, 300, BookType.FANTASTIC);

            BookProto magazine1 = new Magazine(20, 3, "Deagostiny", new Date(2019, 2, 25));

            BookProto newspaper1 = new Newspaper(15, 1);

        }catch (Exception exc){


        }finally {

        }
    }
}

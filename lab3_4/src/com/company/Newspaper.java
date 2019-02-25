package com.company;

import com.company.enums.CoverMaterial;

public class Newspaper extends BookProto{

    // What here is might to be??


    public  Newspaper(int pagesCount, int cost){
        super(pagesCount, CoverMaterial.PAPER, cost);
    }
}

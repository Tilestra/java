package com.company;

import com.company.enums.CoverMaterial;

public class Magazine extends BookProto{

    // What here is might to be??

    public  Magazine(int pagesCount, int cost){
        super(pagesCount, CoverMaterial.CARTOON, cost);
    }
}

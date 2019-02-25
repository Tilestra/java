package com.company;

import com.company.enums.CoverMaterial;

public abstract class BookProto {

    private int pagesCount;
    private CoverMaterial coverMaterial;
    private int cost;



    public int getPagesCount() {
        return pagesCount;
    }


    public CoverMaterial getCoverMaterial() {
        return coverMaterial;
    }



    public int getCost() {
        return cost;
    }



    protected BookProto(int pagesCount, CoverMaterial coverMaterial, int cost){
        this.pagesCount = pagesCount;
        this.coverMaterial = coverMaterial;
        this.cost = cost;
    }

    public  BookProto(){
        pagesCount = 0;
        cost = 0;
        coverMaterial = CoverMaterial.NONE;
    }
}

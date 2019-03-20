package com.company;

import com.company.enums.CoverMaterial;
import java.io.Serializable;
import java.util.logging.Logger;


public abstract class BookProto implements Serializable {

    protected static final Logger log = Logger.getLogger(BookProto.class.toString());



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
    protected BookProto(){
        pagesCount = 0;
        coverMaterial = CoverMaterial.NONE;
        cost = 0;
    }
}

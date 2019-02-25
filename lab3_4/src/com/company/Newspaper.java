package com.company;

import com.company.enums.CoverMaterial;
import com.company.interfaces.IContent;


public class Newspaper extends BookProto implements IContent {

    private static final String MESSAGE_TO_INFORM = "The author name is Ilya";

    public void BringTheTruth(String message){
        System.out.println(message + " - it is a truth!");
    }

    public void BringTheLie(String message){
        System.out.println(message + " - it is a lie!");
    }

    public Newspaper(int pagesCount, int cost){
        super(pagesCount, CoverMaterial.PAPER, cost);
    }
}

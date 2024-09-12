package edu.misena.senaviewer.model;

import java.util.List;

public class Magazine extends Publication {

    //constructor
    public Magazine(String title, String edititionDate, String editorial){
        super(title, edititionDate, editorial);
    }
    @Override
    public String toString() {
        return "Magazine{} " + super.toString();
    }
}
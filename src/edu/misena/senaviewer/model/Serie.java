package edu.misena.senaviewer.model;

public class Serie extends Film{
    private int sessionQuantity;

    //constructor
    public Serie(String title, String genre, int duration, int sessionQuantity){
        super(title, genre, null, duration);
        this.sessionQuantity = sessionQuantity;
    }

    //getter y setter
    public int getSessionQuantity(){
        return sessionQuantity;
    }
    public void setSessionQuantity(int sessionQuantity){
        this.sessionQuantity = sessionQuantity;
    }
    @Override
    public String toString() {
        return "Series{" +
                "sessionQuantity=" + sessionQuantity +
                "} " + super.toString();
    }
}
package com.utility;


import com.model.Doubleroom;
import com.model.Singleroom;
import java.io.Serializable;

public class Holder implements Serializable
{   
    public Doubleroom luxury_doubleroom[];
    public Doubleroom deluxe_doubleroom[];
    public Singleroom luxury_singleroom[];
    public Singleroom deluxe_singleroom[];
    
    public Holder(){
        luxury_doubleroom = new Doubleroom[10]; //Luxury
        deluxe_doubleroom = new Doubleroom[20]; //Deluxe
        luxury_singleroom = new Singleroom[10]; //Luxury
        deluxe_singleroom = new Singleroom[20]; //Deluxe
    }
    
    public Doubleroom getLuxuryDoubleroom(int idx){
        return luxury_doubleroom[idx];
    }
    
}
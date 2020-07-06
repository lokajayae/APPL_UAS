package com.model;


import java.io.Serializable;

public class Food implements Serializable
{
    private int itemno;
    private int quantity;   
    private float price;
    
    public Food(int itemno,int quantity)
    {
        this.itemno=itemno;
        this.quantity=quantity;
        switch(itemno)
        {
            case 1:price=quantity*50;
                break;
            case 2:price=quantity*60;
                break;
            case 3:price=quantity*70;
                break;
            case 4:price=quantity*30;
                break;
        }
    }
    
    public float getPrice(){
        return price;
    }

    public int getItemno() {
        return itemno;
    }


    public void setItemno(int itemno) {
        this.itemno = itemno;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
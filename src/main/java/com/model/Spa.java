package com.model;

public class Spa {
    private int itemno;
    private int quantity;   
    private float price;
    
    public Spa(int itemno, int quantity) {
    	this.itemno = itemno;
    	this.quantity = quantity;
    	
    	switch(itemno) {
    		case 1 :
    			this.price = quantity * 50;
    			break;
    		
    		case 2 :
    			this.price = quantity * 100;
    			break;
    			
    		case 3 :
    			this.price = quantity * 175;
    			break;
    		
    		case 4 :
    			this.price = quantity * 250;
    			break;
    	}
    }
    
    public int getItemno() {
    	return this.itemno;
    }
    
    public void setItemNo(int item) {
    	this.itemno = item;
    }
    
    public int getQuantity() {
    	return this.quantity;
    }
    
    public void setQuantity(int quantity) {
    	this.quantity = quantity;
    }
    
    public float getPrice() {
    	return this.price;
    }
    
    public void setPrice(float newPrice) {
    	this.price = newPrice;
    }
}

package com.model;


import com.model.Food;
import java.io.Serializable;
import java.util.ArrayList;

public class Singleroom implements Serializable
{
    private Customer customer;  
    private ArrayList<Food> food =new ArrayList<>();

   
    public Singleroom()
    {
        this.customer = new Customer();
    }
    
    public Singleroom(Customer customer)
    {
        this.customer = customer;
    }
    
    public ArrayList<Food> getFood(){
        return food;
    }

    public Customer getCustomer(){
        return customer;
    }
    
    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    public void setFood(ArrayList<Food> food) {
        this.food = food;
    }
}
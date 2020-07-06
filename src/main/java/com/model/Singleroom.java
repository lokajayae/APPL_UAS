package com.model;


import com.model.Food;
import java.io.Serializable;
import java.util.ArrayList;

public class Singleroom implements Serializable
{
    private String name;
    private String contact;
    private String gender;   
    private ArrayList<Food> food =new ArrayList<>();

   
    public Singleroom()
    {
        this.name="";
    }
    
    public Singleroom(String name,String contact,String gender)
    {
        this.name=name;
        this.contact=contact;
        this.gender=gender;
    }
    
    public ArrayList<Food> getFood(){
        return food;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFood(ArrayList<Food> food) {
        this.food = food;
    }
}
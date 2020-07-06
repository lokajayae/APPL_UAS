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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @param food the food to set
     */
    public void setFood(ArrayList<Food> food) {
        this.food = food;
    }
}
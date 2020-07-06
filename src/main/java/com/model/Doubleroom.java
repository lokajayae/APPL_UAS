package com.model;

import com.model.Singleroom;
import java.io.Serializable;

public class Doubleroom extends Singleroom implements Serializable
{ 
    private String name2;
    private String contact2;
    private String gender2;  
    
    public Doubleroom(){
        super.setName("");
        this.name2="";
    }
    
    public Doubleroom(String name,String contact,String gender,String name2,String contact2,String gender2)
    {
        super.setName(name);
        super.setContact(contact);
        super.setGender(gender);
        this.name2=name2;
        this.contact2=contact2;
        this.gender2=gender2;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getContact2() {
        return contact2;
    }

    public void setContact2(String contact2) {
        this.contact2 = contact2;
    }

    public String getGender2() {
        return gender2;
    }

    public void setGender2(String gender2) {
        this.gender2 = gender2;
    }
}
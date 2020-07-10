/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.model.Hotel;
import com.model.Customer;
import com.model.Doubleroom;
import com.model.Food;
import com.model.Singleroom;
import com.utility.NotAvailable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Evan
 */
public class HotelController {
    static Scanner sc;
    Hotel hotel;
    
    public final static int LUXURY_DOUBLEROOM = 1;
    public final static int DELUXE_DOUBLEROOM = 2;
    public final static int LUXURY_SINGLEROOM = 3;
    public final static int DELUXE_SINGLEROOM = 4;
    
    public HotelController(Hotel hotel){
        sc = new Scanner(System.in);
        this.hotel = hotel;
    }
    
    public void bookRoom(int roomType){
        int j;
        int roomNumber;
        ArrayList<Integer> emptyRoom;
        
        System.out.println("\nChoose room number from : ");
        
        switch (roomType) {
            case LUXURY_DOUBLEROOM:
                emptyRoom = getEmptyRoomList(hotel.getHolder().getLuxury_doubleroom());
                printRoomList(emptyRoom, 1);
                System.out.print("\nEnter room number: ");
                
                try{
                    roomNumber = sc.nextInt();
                    roomNumber--;
                    
                    if(hotel.getHolder().getLuxury_doubleroom()[roomNumber] != null)
                        throw new NotAvailable();
                    
                    customerDetails(LUXURY_DOUBLEROOM,roomNumber);
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
                
            case DELUXE_DOUBLEROOM:
                emptyRoom = getEmptyRoomList(hotel.getHolder().getDeluxe_doubleroom());
                printRoomList(emptyRoom, 11);
                System.out.print("\nEnter room number: ");
                
                try{
                roomNumber = sc.nextInt();
                roomNumber -= 11;
                
                if(hotel.getHolder().getDeluxe_doubleroom()[roomNumber] != null)
                    throw new NotAvailable();
                
                customerDetails(DELUXE_DOUBLEROOM, roomNumber);
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
                
            case LUXURY_SINGLEROOM:
                emptyRoom = getEmptyRoomList(hotel.getHolder().getLuxury_singleroom());
                printRoomList(emptyRoom, 31);
                System.out.print("\nEnter room number: ");
                
                try{
                roomNumber = sc.nextInt();
                roomNumber -= 31;
                
                if(hotel.getHolder().getLuxury_singleroom()[roomNumber] != null)
                    throw new NotAvailable();
                
                customerDetails(LUXURY_SINGLEROOM, roomNumber);
                }
                catch(Exception e)
                {
                    System.out.println("Invalid Option");
                    return;
                }
                break;
                
            case DELUXE_SINGLEROOM:
                emptyRoom = getEmptyRoomList(hotel.getHolder().getDeluxe_singleroom());
                printRoomList(emptyRoom, 41);
                System.out.print("\nEnter room number: ");
                
                try{
                roomNumber = sc.nextInt();
                roomNumber -= 41;
                
                if(hotel.getHolder().getDeluxe_singleroom()[roomNumber]!=null)
                    throw new NotAvailable();
                
                customerDetails(DELUXE_SINGLEROOM, roomNumber);
                }
                catch(Exception e)
                {
                   System.out.println("Invalid Option");
                    return;
                }
                break;
            
            default:
                System.out.println("Enter valid option");
                break;
        }
        System.out.println("Room Booked!!!");
    }
    
    public void customerDetails(int roomType, int roomNumber){
        String name, contact, gender;
        String name2, contact2, gender2;
        Customer customer = new Customer();
        Customer secondCustomer = new Customer();
        
        System.out.print("\nEnter customer name: ");
        name = sc.next();
        System.out.print("Enter contact number: ");
        contact=sc.next();
        System.out.print("Enter gender: ");
        gender = sc.next();
        
        customer = new Customer(name, gender, contact);
        
        if(roomType == LUXURY_DOUBLEROOM || roomType == DELUXE_DOUBLEROOM){
            System.out.print("Enter second customer name: ");
            name2 = sc.next();
            System.out.print("Enter contact number: ");
            contact2=sc.next();
            System.out.print("Enter gender: ");
            gender2 = sc.next();
            
            secondCustomer = new Customer(name2, gender2, contact2);
        }      
          switch (roomType) {
            case 1:
                hotel.getHolder().addCustomerToLuxuryDoubleroom(roomNumber, customer, secondCustomer);
                break;
            case 2:
                hotel.getHolder().addCustomerToDeluxeDoubleroom(roomNumber, customer, secondCustomer);
                break;
            case 3:
                hotel.getHolder().addCustomerToLuxurySingleroom(roomNumber, customer);
                break;
            case 4:
                hotel.getHolder().addCustomerToDeluxeSingleroom(roomNumber, customer);
                break;
            default:System.out.println("Wrong option");
                break;
        }
    }
    
    public void features(int roomType){
        switch (roomType) {
            case LUXURY_DOUBLEROOM:
                System.out.println("Double Bed");
                System.out.println("AC : Yes");
                System.out.println("Free Breakfast : Yes");
                System.out.println("Charge : $400");
                break;
            case DELUXE_DOUBLEROOM:
                System.out.println("Double Bed");
                System.out.println("AC : No");
                System.out.println("Free Breakfast : Yes");
                System.out.println("Charge : $300");
                break;
            case LUXURY_SINGLEROOM:
                System.out.println("Single Bed");
                System.out.println("AC : Yes");
                System.out.println("Free Breakfast : Yes");
                System.out.println("Charge : $220");
                break;
            case DELUXE_SINGLEROOM:
                System.out.println("Single Bed");
                System.out.println("AC : No");
                System.out.println("Free Breakfast : Yes");
                System.out.println("Charge : $120");
                break;
            default:
                System.out.println("Enter valid option");
                break;
        }
    }
    
    public void availability(int roomType){
        ArrayList<Integer> emptyRoom;
        
        switch(roomType) {
            case LUXURY_DOUBLEROOM:
                emptyRoom = getEmptyRoomList(hotel.getHolder().getLuxury_doubleroom());
                break;
            case DELUXE_DOUBLEROOM:
                emptyRoom = getEmptyRoomList(hotel.getHolder().getDeluxe_doubleroom());
                break;
            case LUXURY_SINGLEROOM:
                emptyRoom = getEmptyRoomList(hotel.getHolder().getLuxury_singleroom());
                break;
            case DELUXE_SINGLEROOM:
                emptyRoom = getEmptyRoomList(hotel.getHolder().getDeluxe_doubleroom());
                break;
            default:
                System.out.println("Enter valid option");
                return;
        }
        
        System.out.println("Number of rooms available : " + emptyRoom.size());
    }
    
    public void bill(int roomNumber,int roomType){
        double amount=0;
        String list[]={"Sandwich","Pasta","Noodles","Coke"};
        System.out.println("\n*******");
        System.out.println(" Bill:-");
        System.out.println("*******");
               
        switch(roomType){
            case LUXURY_DOUBLEROOM:
                amount+=400;
                    System.out.println("\nRoom Charge - "+4000);
                    System.out.println("\n===============");
                    System.out.println("Food Charges:- ");
                    System.out.println("===============");
                     System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(Food obb : hotel.getHolder().getLuxury_doubleroom()[roomNumber].getFood())
                    {
                        amount += obb.getPrice();
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[obb.getItemno()-1], obb.getQuantity(),obb.getPrice() );
                    }
                    
                break;
            case DELUXE_DOUBLEROOM:
                    amount+=300;
                    System.out.println("Room Charge - "+3000);
                    System.out.println("\nFood Charges:- ");
                    System.out.println("===============");
                     System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(Food obb: hotel.getHolder().getDeluxe_doubleroom()[roomNumber].getFood())
                    {
                        amount+=obb.getPrice();
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[obb.getItemno()-1], obb.getQuantity(),obb.getPrice() );
                    }
                break;
            case LUXURY_SINGLEROOM:
                    amount+=220;
                    System.out.println("Room Charge - "+2200);
                    System.out.println("\nFood Charges:- ");
                    System.out.println("===============");
                    System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(Food obb : hotel.getHolder().getLuxury_singleroom()[roomNumber].getFood())
                    {
                        amount+=obb.getPrice();
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[obb.getItemno()-1], obb.getQuantity(),obb.getPrice() );
                    }
                break;
            case DELUXE_SINGLEROOM:
                    amount+=120;
                    System.out.println("Room Charge - "+1200);
                    System.out.println("\nFood Charges:- ");
                    System.out.println("===============");
                    System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(Food obb :  hotel.getHolder().getDeluxe_singleroom()[roomNumber].getFood())
                    {
                        amount+=obb.getPrice();
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[obb.getItemno()-1], obb.getQuantity(),obb.getPrice() );
                    }
                break;
            default:
                System.out.println("Not valid");
        }
        System.out.println("\nTotal Amount- "+amount);
    }
    
    public void checkOut(int roomNumber,int roomType){
        int j;
        char choice;
        Singleroom room = new Singleroom();
        
        switch (roomType) {
            case LUXURY_DOUBLEROOM :               
                if(hotel.getHolder().getLuxury_doubleroom()[roomNumber]!=null){
                    room = hotel.getHolder().getLuxury_doubleroom()[roomNumber];
                    System.out.println("Room used by " + room.getCustomer().getName());
                }
                else {    
                    System.out.println("Empty Already");
                        return;
                }
                
                System.out.println("Do you want to checkout ?(y/n)");
                choice = sc.next().charAt(0);
                 
                if(choice == 'y'|| choice == 'Y'){
                    bill(roomNumber, roomType);
                    hotel.getHolder().getDeluxe_doubleroom()[roomNumber] = null;
                    System.out.println("Deallocated succesfully");
                }
                
                break;
            case DELUXE_DOUBLEROOM :
                if(hotel.getHolder().getDeluxe_doubleroom()[roomNumber]!=null){
                    room = hotel.getHolder().getDeluxe_doubleroom()[roomNumber];
                    System.out.println("Room used by " + room.getCustomer().getName());
                }
                else {    
                    System.out.println("Empty Already");
                    return;
                }
                
                System.out.println("Do you want to checkout ?(y/n)");
                choice = sc.next().charAt(0);
                 
                if(choice == 'y'|| choice == 'Y'){
                    bill(roomNumber, roomType);
                    hotel.getHolder().getDeluxe_doubleroom()[roomNumber] = null;
                    System.out.println("Deallocated succesfully");
                }
                
                break;
            case LUXURY_SINGLEROOM:
                if(hotel.getHolder().getLuxury_singleroom()[roomNumber]!=null){
                    room = hotel.getHolder().getLuxury_singleroom()[roomNumber];
                    System.out.println("Room used by " + room.getCustomer().getName());
                }
                else {    
                    System.out.println("Empty Already");
                        return;
                }
                
                System.out.println("Do you want to checkout ?(y/n)");
                choice = sc.next().charAt(0);
                 
                if(choice == 'y'|| choice == 'Y'){
                    bill(roomNumber, roomType);
                    hotel.getHolder().getDeluxe_doubleroom()[roomNumber] = null;
                    System.out.println("Deallocated succesfully");
                }
                
                break;
            case DELUXE_SINGLEROOM:
                if(hotel.getHolder().getDeluxe_singleroom()[roomNumber]!=null){
                    room = hotel.getHolder().getDeluxe_singleroom()[roomNumber];
                    System.out.println("Room used by " + room.getCustomer().getName());
                }
                else {    
                    System.out.println("Empty Already");
                        return;
                }
                
                System.out.println("Do you want to checkout ?(y/n)");
                choice = sc.next().charAt(0);
                 
                if(choice == 'y'|| choice == 'Y'){
                    bill(roomNumber, roomType);
                    hotel.getHolder().getDeluxe_doubleroom()[roomNumber] = null;
                    System.out.println("Deallocated succesfully");
                }
                
                break;
            default:
                System.out.println("\nEnter valid option : ");
                break;
        }
    }
    
    public void orderFood(int roomNumber,int roomType){
        int food, quantity;
        char wish;
        
        try{
             System.out.println("\n==========\n   ");
             System.out.println("Menu:  ");
             System.out.println("==========");
             System.out.println("1.Sandwich\tRs.50");
             System.out.println("2.Pasta\t\tRs.60");
             System.out.println("3.Noodles\tRs.70");
             System.out.println("4.Coke\t\tRs.30");
             System.out.print("Choice : ");
            do
            {
                food = sc.nextInt();
                System.out.print("Quantity- ");
                quantity =sc.nextInt();

                switch(roomType){
                    case LUXURY_DOUBLEROOM: 
                        hotel.getHolder().getLuxury_doubleroom()[roomNumber].getFood().add(new Food(food, quantity));
                        break;
                    case DELUXE_DOUBLEROOM: 
                        hotel.getHolder().getDeluxe_doubleroom()[roomNumber].getFood().add(new Food(food, quantity));
                        break;
                    case LUXURY_SINGLEROOM: 
                        hotel.getHolder().getLuxury_singleroom()[roomNumber].getFood().add(new Food(food, quantity));
                        break;
                    case DELUXE_SINGLEROOM: 
                        hotel.getHolder().getDeluxe_singleroom()[roomNumber].getFood().add(new Food(food, quantity));
                        break;                                                 
                }

                System.out.println("Do you want to order anything else ? (y/n)");
                wish=sc.next().charAt(0); 
            }while(wish=='y'||wish=='Y');  
        
        }
        catch(NullPointerException e){
                System.out.println("\nRoom not booked");
        }
        
        catch(Exception e){
             System.out.println("Cannot be done");
         }
    }
    
    private ArrayList<Integer> getEmptyRoomList(Singleroom room[]){
        int count = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i = 0; i < room.length; i++){
            if(room[i] == null){
                result.add(i);
            }
        }
        
        return result;
    }
    
    private void printRoomList(ArrayList<Integer> list, int start){
        for(int room : list){
            System.out.print(room + start +", ");
        }
    }
    
}

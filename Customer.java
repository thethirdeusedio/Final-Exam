/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Theoritical_Exam;

/**
 *
 * @author _thethirdeusedio
 */
public abstract class Customer {
    
    private String name;
    double amount;
    
    //Constructor
    public Customer(String name, int amount){
        this.name = name;
        this.amount = amount;
    }
    
    //Method
    public abstract double calculateBill();
    
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
}

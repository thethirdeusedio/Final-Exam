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
public class SeniorCustomer extends Customer{
    
    private final double discount;
    
    public SeniorCustomer(String name, int amount){
        
        super(name, amount);  
        this.discount = amount - (amount * 0.20);
    }

    @Override
    public double calculateBill() {
       return discount;
    }
    
        
    
 
}

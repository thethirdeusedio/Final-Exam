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
public class Main {
    public static void main(String[]orgs){
    Customer customer;
    RegularCustomer regularcustomer = new RegularCustomer("Jose Lito", 500);
    SeniorCustomer  seniorcustomer = new SeniorCustomer("Diosdado", 500);
    
    customer = regularcustomer;
    System.out.println(customer.calculateBill() + "\t" + customer.getName() + ".");
    
    customer = seniorcustomer;
    System.out.println(customer.calculateBill() + "\t" + customer.getName() + ".");
    }
    
}

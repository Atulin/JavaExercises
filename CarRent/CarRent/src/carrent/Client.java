/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrent;

import java.math.BigInteger;

/**
 *
 * @author student
 */
public class Client {
    int ID;
    String name;
    String surname;
    int phone;
    String address1;
    String address2;
    String pesel;

    // Constructor
    public Client (int ID, String name, String surname, int phone, String address1, String address2, String pesel)
    {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address1 = address1;
        this.address2 = address2;
        this.pesel = pesel;
    }
    
    // Empty constructor
    public Client (){}

    // Print client
    public void displayClientInfo ()
    {
        System.out.print  ("╔═" + ID);
        for (int i = 0; i < 55 - String.valueOf(ID).length(); i++) { System.out.print("═");}
        System.out.println("╗");
        
        System.out.print  ("║ " + name + " " + surname);
        for (int i = 0; i < 53 - (name.length() + surname.length()); i++) { System.out.print(" ");}
        System.out.println(" ║");
        
        System.out.print ("║ Phone number: " + String.valueOf(phone));
        for (int i = 0; i < 40 - String.valueOf(phone).length(); i++) { System.out.print(" ");}
        System.out.println(" ║");
        
        System.out.print("║ Address:      " + address1);
        for (int i = 0; i < 40 - address1.length(); i++) { System.out.print(" ");}
        System.out.println(" ║");
        
        System.out.print("║               " + address2);
        for (int i = 0; i < 40 - address2.length(); i++) { System.out.print(" ");}
        System.out.println(" ║");
        
        System.out.println("║ PESEL:        " + pesel + "                             ║");
        
        System.out.println("╚════════════════════════════════════════════════════════╝");
    }
    
    
    
    // Getters and Setters
    public int getID() {
        return ID;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }
    
    
}

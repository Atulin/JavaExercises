/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrent;

import java.text.DecimalFormat;

/**
 *
 * @author student
 */
public class Car {
    
    int ID;
    String model;
    String manufacturer;
    String plateNumbers;
    int productionYear;
    double engineCapacity;
    boolean isRented;
    String rentedBy;
    
    // Constructor
    public Car(int ID,
               String Model,
               String Manufacturer,
               String PlateNumbers,
               int ProductionYear,
               double EngineCapacity)
    {
        this.ID = ID;
        model = Model;
        manufacturer = Manufacturer;
        plateNumbers = PlateNumbers;
        productionYear = ProductionYear;
        engineCapacity = EngineCapacity;
        isRented = false;
        rentedBy = "NULL";
    }
    
    // Empty constructor
    public Car (){}
    
    // Setters and Getters
    public int getID() {
        return ID;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getPlateNumbers() {
        return plateNumbers;
    }

    public void setPlateNumbers(String plateNumbers) {
        this.plateNumbers = plateNumbers;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isIsRented() {
        return isRented;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }
    
    public String getRentedBy() {
        return rentedBy;
    }
    
    public void setRentedBy(Client rentedBy) {
        this.rentedBy = rentedBy.getName() + " " + rentedBy.getSurname();
    }
    
    // Print car info
    public void displayCarInfo()
    {
        DecimalFormat df = new DecimalFormat("00.00");
        String capacityStr = df.format(engineCapacity);
        
        System.out.print  ("╔═" + ID);
        for (int i = 0; i < 55 - String.valueOf(ID).length(); i++) { System.out.print("═");}
        System.out.println("╗");
        
        System.out.print  ("║ " + manufacturer + " " + model);
        for (int i = 0; i < 53 - (manufacturer.length() + model.length()); i++) { System.out.print(" ");}
        System.out.println(" ║");
        
        System.out.print ("║ Plate numbers:    " + plateNumbers);
        for (int i = 0; i < 36 - plateNumbers.length(); i++) { System.out.print(" ");}
        System.out.println(" ║");
        
        System.out.println("║ Production year:  " + productionYear + "                                 ║");
        System.out.println("║ Engine capacity:  " + capacityStr + "                                ║");
        
        if (isRented) {
            System.out.print("║ Car is rented by: " + rentedBy);
            for (int i = 0; i < 36 - rentedBy.length(); i++) { System.out.print(" ");}
            System.out.println(" ║");
        }
        
        else          { System.out.println("║ Car is available                                       ║");}
        
        System.out.println("╚════════════════════════════════════════════════════════╝");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author student
 */
public class CarRent {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Car tmpCar1 = new Car(123121, "Escort", "Ford", "ZAQ1-2WSX", 1999, 1.8);
        Car tmpCar2 = new Car(2, "Niwa", "Łada", "ARD-332", 1921, 1.25);
        
        Client tmpClient = new Client(01, "Jan", "Kowalski", 829104955, "Kolejowa 28 m.12", "Bodziszkowo", "819296787712");
        
        tmpCar2.setIsRented(true);
        tmpCar2.setRentedBy(tmpClient);
        
        
        tmpCar1.displayCarInfo();
        tmpCar2.displayCarInfo();
        tmpClient.displayClientInfo();
        
        FileManager.initFiles();
        
        FileManager.addCar(tmpCar1);
        FileManager.addCar(tmpCar2);
        
        FileManager.addClient(tmpClient);
    }
    
}

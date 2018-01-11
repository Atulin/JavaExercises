/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrent;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
 

/**
 *
 * @author student
 */
public class FileManager {
    
    static Path fileCars;
    static Path fileClients;
    
    
    // Add car to file

    /**
     *
     * @param car
     * @throws IOException
     */
    
    // Initialize files
    public static void initFiles()
    {
        fileCars = Paths.get("cars.txt");
        fileClients = Paths.get("clients.txt");
    }
    
    // Add a car to the file
    public static void addCar(Car car) throws IOException
    {       
        List<String> lines = Files.readAllLines(fileCars);
        lines.add(  car.ID + "," +
                    car.manufacturer + "," +
                    car.model + "," +
                    car.plateNumbers + "," +
                    car.engineCapacity + "," +
                    car.productionYear  + "," +
                    car.isRented + "," +
                    car.rentedBy);
        
        Files.write(fileCars, lines, Charset.forName("UTF-8"));
    }
    
        // Add a client to the file
    public static void addClient(Client client) throws IOException
    {       
        List<String> lines = Files.readAllLines(fileClients);
        lines.add(  client.ID + "," +
                    client.name + "," +
                    client.surname + "," +
                    client.phone + "," +
                    client.address1 + "," +
                    client.address2  + "," +
                    client.pesel);
        
        Files.write(fileClients, lines, Charset.forName("UTF-8"));
    }
    
}

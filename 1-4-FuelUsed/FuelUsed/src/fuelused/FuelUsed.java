/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuelused;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author student
 */
public class FuelUsed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Kilometry na starcie: ");
        double kilometersStart = Double.parseDouble(br.readLine());
        System.out.println("Kilometry na koniec trasy: ");
        double kilometersEnd = Double.parseDouble(br.readLine());
        System.out.println("Paliwo: ");
        double fuel = Double.parseDouble(br.readLine());

        System.out.println("Spalanie to " + fuel / (kilometersEnd - kilometersStart) + " na kilometr");
    }
    
}

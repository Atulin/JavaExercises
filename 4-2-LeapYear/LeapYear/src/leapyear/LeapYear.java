/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author student
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter year");
        
        int year = Integer.parseInt(br.readLine());
        
        if (year < 1582)
        {
            System.out.println("Invalid input: year cannot be lower than 1582");
        }
        else if (year % 4 == 0 && year % 100 != 0)
        {
            System.out.println("Year " + year + " is a leap year");
        }
        else if (year % 400 == 0)
        {
            System.out.println("Year " + year + " is a leap year");
        }
        else
        {
            System.out.println("Year " + year + " is not a leap year");
        }
        
    }
    
}

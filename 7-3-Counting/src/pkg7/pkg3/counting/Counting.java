/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg3.counting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Angius
 */
public class Counting {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // TODO code application logic here
        
        String sNumbers;
        String[] asNumbers;
        String delimiter;
        ArrayList<Integer> aNumbers = new ArrayList<>();
        
        System.out.println("Enter numbers");
        
        sNumbers = br.readLine();
        
        System.out.println("Enter desired delimiter or REGEX expression");
        
        delimiter = br.readLine();
        
        asNumbers = sNumbers.split(delimiter);
        
        for (String s : asNumbers)
        {
            aNumbers.add(Integer.parseInt(s));
        }
        
        // Check bounds
        for (int i : aNumbers)
        {
            if (i > 50 || i < 0)
            {
                System.out.println("Numbers cannot exceed 50");
                System.exit(0);
            }
        }
        
        // Create set
        Set<Integer> setNumbers;
        setNumbers = new HashSet<>(aNumbers);
        
        for (int i : setNumbers)
        {
            System.out.println("Number " + i + " occurs " + Collections.frequency(aNumbers, i) + " times");
        }
    }
    
}

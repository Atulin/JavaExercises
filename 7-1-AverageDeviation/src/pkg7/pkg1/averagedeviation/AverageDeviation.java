/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg1.averagedeviation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Angius
 */
public class AverageDeviation {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // TODO code application logic here
        
        String sNumbers = "";
        String[] asNumbers;
        String delimiter = ",";
        ArrayList<Integer> aNumbers = new ArrayList<>();
        
        System.out.println("Enter up to 50 numbers");
        
        sNumbers = br.readLine();
        
        System.out.println("Enter desired delimiter or REGEX expression");
        
        delimiter = br.readLine();
        
        asNumbers = sNumbers.split(delimiter);
        
        for (String s : asNumbers)
        {
            aNumbers.add(Integer.parseInt(s));
        }
        
        System.out.print("The average is ");
        System.out.println(Average(aNumbers));
        System.out.print("The deviation is ");
        System.out.println(Deviation(aNumbers));

        
    }
    
    public static double Average(ArrayList<Integer> numbers)
    {
        int sum = 0;
        double fract;
        
        for (int i : numbers)
        {
            sum += i;
        }
        
        fract = 1.0 / (double)numbers.size();
        
        return fract * (double)sum;
    }
    
    public static double Deviation(ArrayList<Integer> numbers)
    {
        double sum = 0.0;
        double fract;
        
        for (int i : numbers)
        {
            sum += Math.pow((double)i - Average(numbers), 2);
        }
        
        fract = 1.0 / (double)(numbers.size() - 1);
        
        return Math.sqrt(fract * sum);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averageauto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author student
 */
public class AverageAuto {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a, b, c, d;
        
        System.out.println("Enter 4 numbers");
                
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        d = Integer.parseInt(br.readLine());
        
        if (a != 0)
        {       
            System.out.println("Average of a, b, c, d is: " + Averages.CalcAverage(a, b, c, d));
            System.out.println("Average of b, c, d  is: " + Averages.CalcAverage(b, c, d));
            System.out.println("Average of a, d is: " + Averages.CalcAverage(a, d));
        }
        else
        {
            
        }
    }
}

class Averages {
    
    public static double CalcAverage (int a, int b)
    {
        return (double)((a + b) / 2.0);
    }
    
    public static double CalcAverage (int a, int b, int c)
    {
        return (double)((a + b + c) / 3.0);
    }
    
    public static double CalcAverage (int a, int b, int c, int d)
    {
        return (double)((a + b + c + d) / 4.0);
    }
}



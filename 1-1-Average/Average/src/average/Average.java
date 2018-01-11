/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package average;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 *
 * @author student
 */
public class Average {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        List<Integer> numbersList = new ArrayList<>();
        
        boolean bInputControl = true;
        
        System.out.println("Enter 2 to 4 numbers or leave empty to stop and calculate the average");
        
        while (bInputControl)
        {
            String sTmp = br.readLine();         
            
            if (isInt(sTmp))
            {
                int xTmp = Integer.parseInt(sTmp);
                numbersList.add(xTmp);
            }
            else
            {
                int lengthTmp = numbersList.size();
                
                switch (lengthTmp) {
                    case 2: System.out.println("Average is " + Averages.CalcAverage(numbersList.get(0),
                                                                                    numbersList.get(1)));
                            break;
                    case 3: System.out.println("Average is " + Averages.CalcAverage(numbersList.get(0),
                                                                                    numbersList.get(1),
                                                                                    numbersList.get(2)));
                            break;
                    case 4: System.out.println("Average is " + Averages.CalcAverage(numbersList.get(0),
                                                                                    numbersList.get(1),
                                                                                    numbersList.get(2),
                                                                                    numbersList.get(3)));
                            break;
                    default: System.out.println("Incorrect number of inputs");
                            break;
                }
                
                bInputControl = false;
            }
        }
    }
    
    public static boolean isInt(String s)
    {
        try
        {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException ex)
        {
            return false;
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



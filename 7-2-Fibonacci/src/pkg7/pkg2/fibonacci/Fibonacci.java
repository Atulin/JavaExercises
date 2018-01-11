/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg2.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Angius
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // TODO code application logic here
        
        int length;
        
        System.out.println("Enter number of elements");
        
        length = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < length; i++)
        {
            System.out.print(Fibonacci(i));
            
            if (i != length-1)
                System.out.print(", ");
            else
                System.out.print(System.lineSeparator());
                
        }
    }
    
    public static int Fibonacci (int num)
    {
        switch (num)
        {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 1;
            default:
                return Fibonacci(num-1) + Fibonacci(num-2);
        }
    }
}

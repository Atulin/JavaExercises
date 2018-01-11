/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Angius
 */
public class Sum {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Numer końcowy: ");
        int endNumber = Integer.parseInt(br.readLine());
        
        if (endNumber < 2)
        {
            System.out.println("Numer nie może być niższy niż 2!");
        }
        else
        {
            int totalSum = 0;
            for (int i = 2; i <= endNumber; i++)
            {
                totalSum += i;
            }
            System.out.println("Suma wynosi: " + totalSum);
        }
    }
    
}

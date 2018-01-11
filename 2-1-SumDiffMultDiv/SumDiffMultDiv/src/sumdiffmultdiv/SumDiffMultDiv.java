/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumdiffmultdiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Angius
 */
public class SumDiffMultDiv {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Pierwszy numer: ");
        float firstNumber = Float.parseFloat(br.readLine());
        System.out.println("Drugi numer: ");
        float secondNumber = Float.parseFloat(br.readLine());
        
        float sum = firstNumber + secondNumber;
        float difference = firstNumber - secondNumber;
        float multiplication = firstNumber * secondNumber;
        float division = firstNumber / secondNumber;

        System.out.println("Suma: " + sum);
        System.out.println("Różnica: " + difference);
        System.out.println("Iloczyn: " + multiplication);
        System.out.println("Iloraz: " + division);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averageof3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.*;

/**
 *
 * @author student
 */
public class AverageOf3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double value1, value2, value3;
        
        value1 = Double.parseDouble(br.readLine());
        value2 = Double.parseDouble(br.readLine());
        value3 = Double.parseDouble(br.readLine());
        
        System.out.println((value1 + value2 + value3) / 3);
    }
    
}

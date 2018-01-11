/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneymoney;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Angius
 */
public class MoneyMoney {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ilość monet 5zł: ");
        int money5 = Integer.parseInt(br.readLine());
        
        System.out.println("Ilość monet 2zł: ");
        int money2 = Integer.parseInt(br.readLine());
        
        System.out.println("Ilość monet 1zł: ");
        int money1 = Integer.parseInt(br.readLine());
        
        System.out.println("Ilość monet 50gr: ");
        int money05 = Integer.parseInt(br.readLine());
        
        System.out.println("Ilość monet 20gr: ");
        int money02 = Integer.parseInt(br.readLine());
        
        System.out.println("Ilość monet 10gr: ");
        int money01 = Integer.parseInt(br.readLine());
        
        System.out.println("Ilość monet 5gr: ");
        int money005 = Integer.parseInt(br.readLine());
        
        System.out.println("Ilość monet 2gr: ");
        int money002 = Integer.parseInt(br.readLine());
        
        System.out.println("Ilość monet 1gr: ");
        int money001 = Integer.parseInt(br.readLine());

        
        int coinAmount = money5 + money2 + money1 + money05 + money02 + money01 + money005 + money002 + money001;
        
        float moneyAmount = (float) (
                (money5 * 5) + 
                (money2 * 2) +
                (money1 * 1) +
                (money05 * 0.5) +
                (money02 * 0.2) +
                (money01 * 0.1) +
                (money005 * 0.05) +
                (money002 * 0.02) +
                (money001 * 0.01)
        );
        
        System.out.println("Całkowita ilośc monet to: " + coinAmount);
        System.out.println("Suma pieniędzy to: " + moneyAmount);
    }
    
}

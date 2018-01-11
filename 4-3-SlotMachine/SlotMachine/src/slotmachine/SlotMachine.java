/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slotmachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.DoubleStream;
/**
 *
 * @author student
 */
public class SlotMachine {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Press enter to gamble!");
        
        displayMachine(0, 0, 0, "  GAMBLE!  ");
        
        br.read();
        
        boolean inputControl = true;
        
        while (inputControl)
        {
            int a = randomNumber();
            int b = randomNumber();
            int c = randomNumber();

            String result;

            if (a == b && b == c)
            {
                result = " JACKPOT!  ";
            }
            else if (a == b || b == c || c == a)
            {
                result = "  DOUBLE!  ";
            }
            else
            {
                result = " TRY AGAIN ";
            }
            
            displayMachine(a, b, c, result);
            
            System.out.println("\nTry again? (YES - press enter)");
            System.out.println("     (YES - press enter)");
            System.out.println("     (NO  - enter N)");
            
            String input = br.readLine();
            
            if (input.equalsIgnoreCase("N") || input.equalsIgnoreCase("n")) { inputControl = false; }
        }
        
        
        br.read();
        
    }
    
    public static int randomNumber() throws IOException
    {
        return ThreadLocalRandom.current().nextInt(0, 10);
    }
    
    public static void displayMachine(int a, int b, int c, String result) throws IOException
    {      
        System.out.println("╔═══╦═══╦═══╗");
        System.out.println("║ " + a + " ║ " + b + " ║ " + c + " ║");
        System.out.println("╠═══╩═══╩═══╣");
        System.out.println("║" + result + "║");
        System.out.println("╚═══════════╝");
    }
}

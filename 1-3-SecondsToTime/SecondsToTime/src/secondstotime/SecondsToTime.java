/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondstotime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author student
 */
public class SecondsToTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int seconds = Integer.parseInt(br.readLine());;

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secondsOut = (seconds % 3600) % 60;
        
        System.out.println(hours + ", " + minutes + ", " + secondsOut);
    }
    
}

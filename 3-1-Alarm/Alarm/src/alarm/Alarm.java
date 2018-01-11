/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alarm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author student
 */
public class Alarm {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x;
        x = Integer.parseInt(br.readLine());
        
        if (x < 1)
        {
            System.out.println("Invalid input!");
        } else {
            AlarmManager am = new AlarmManager(x);

            am.RunAlarm();
        }

    }   
}

class AlarmManager {
    int alarmCount;
    
    public AlarmManager (int x)
    {
        alarmCount = x;
    }
    
    void RunAlarm ()
    {
        for (int i = 0; i < alarmCount; i++)
        {
            System.out.println("Alarm!");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdayparadox;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

/**
 *
 * @author student
 */
public class BirthdayParadox {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Take in the amount of people in a room
        System.out.print("People in the room: ");
        int amount = Integer.parseInt(br.readLine());
        
        // Take in the amount of desired repeats
        System.out.print("Number of experiments: ");
        int repeats = Integer.parseInt(br.readLine());
        
        // Set date formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        
        // Create array of pairs
        int[] pairsArr = new int[repeats];
        
        // Repeats loop
        for (int rep = 0; rep < repeats; rep++)
        {
            
            // Save an array of dates
            LocalDate[] datesArr = DatesArray(amount);

            // Pairs counter
            int pairs = 0;
        
            // First loop of check
            for (int i = 0; i < amount; i++)
            {
                // Check if date is not null
                if (datesArr[i] != null)
                {
                    // Save date locally
                    LocalDate tmpDateI = datesArr[i];
                    // Remove it from array
                    datesArr[i] = null;

                    // Second loop of check
                    for (int j = 0; j < amount; j++)
                    {
                        // Save date locally
                        LocalDate tmpDateJ = datesArr[j];

                        if (tmpDateJ != null &&     // Check if date null
                            tmpDateI.getDayOfYear() == tmpDateJ.getDayOfYear()) // Check if day and month are the same
                        {
                            // Increase existing pairs counter
                            pairs++;
                            // Remove date from array
                            datesArr[j] = null;
                        }
                    }
                }
            }
            pairsArr[rep] = pairs;
            
            System.out.println("There are " + pairs + " pairs in check number " + (rep+1));
        }
        
        // Set totalPairs variable
        int totalPairs = 0;
        
        // Check how many reps had one or more pairs
        for (int i = 0; i < repeats; i++)
        {
            if (pairsArr[i] > 0) totalPairs++;
        }
        
        // Count percentage
        double perc = (double)totalPairs / repeats * 100;
        
        System.out.println("\nOut of " + repeats + " tries, one or more pair in the room occured " + totalPairs + " times,\nwhich is " + Round(perc, 4) + "%");
        
        if (perc >= 50.0 && amount >= 23)
        {
            System.out.println("It confirms the thesis.");
        }
        else if (perc < 50.0 && amount >= 23)
        {
            System.out.println("It disproves the thesis.");
        }
        else
        {
            System.out.println("It doesn't confirm or disprove the thesis. Below 23 people.");
        }
    }
    
    // Genrate an array of random dates
    public static LocalDate[] DatesArray (int amount)
    {
        LocalDate[] datesArr = new LocalDate[amount];
        
        for (int i = 0; i < amount; i++)
        {
            datesArr[i] = RandomDate();
        }
        
        return datesArr;
    }
    
    // Generate random date
    public static LocalDate RandomDate ()
    {
        // Months that have 31 days
        int[] months31 = new int[]{1, 3, 5, 7, 8, 10, 12};
        // Months that have 30 days
        int[] months30 = new int[]{4, 6, 9, 11};
        
        // Generate year
        int year = ThreadLocalRandom.current().nextInt(1917, 2018);
        
        // Check if leap
        boolean isLeapYear;
        
          if (year % 4 != 0) {
            isLeapYear = false;
          } else if (year % 400 == 0) {
            isLeapYear = true;
          } else if (year % 100 == 0) {
            isLeapYear = false;
          } else {
            isLeapYear = true;
          }
          
        // Generate month
        int month = ThreadLocalRandom.current().nextInt(1, 13);
        
        // Generate day
        int day;
        if (IntStream.of(months31).anyMatch(x -> x == month))
        {
            day = ThreadLocalRandom.current().nextInt(1, 32);
        }
        else if (IntStream.of(months30).anyMatch(x -> x == month))
        {
            day = ThreadLocalRandom.current().nextInt(1, 31);
        }
        else
        {
            if (isLeapYear)
            {
                day = ThreadLocalRandom.current().nextInt(1, 30);
            }
            else
            {
                day = ThreadLocalRandom.current().nextInt(1, 29);
            }
        }
        
        return LocalDate.of(year, month, day);
    }
    
    // Round doubles

    public static double Round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    BigDecimal bd = new BigDecimal(value);
    bd = bd.setScale(places, RoundingMode.HALF_UP);
    return bd.doubleValue();
}
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionnaire;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author student
 */
public class Questionnaire {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Variables
        ArrayList<Question> queries = new ArrayList<>();
        
        // Handle main loop
        boolean isActive = true;
        while (isActive)
        {
            System.out.println("╠══════════════════════════════════════════════════════════╗");
            System.out.println("║ Do you want to:                                          ║");
            System.out.println("║                Add questions      [ADD]                  ║");
            System.out.println("║                Answer questions   [ANS]                  ║");
            System.out.println("║                Display answers    [DIS]                  ║");
            System.out.println("╠══════════════════════════════════════════════════════════╝");
            System.out.print  ("╠─ ");

            String action = br.readLine();

            switch (action) {
                
            // Handle adding
                case "ADD":
                    System.out.println("╠══════════════════════════════════════════════════════════╗");
                    System.out.println("║ Enter your questions. Leave empty to stop.               ║");
                    System.out.println("╠══════════════════════════════════════════════════════════╝");
                    
                    // Handle adding loop
                    boolean b_add = true;
                    while (b_add)
                    {
                        String question = "";
                        
                        // Handle question type
                        System.out.println("║ ╠════════════════════════════════════════════════════════╗");
                        System.out.println("║ ║ Select question type:                                  ║");
                        System.out.println("║ ║                     Open    [OP]                       ║");
                        System.out.println("║ ║                     Closed  [CL]                       ║");
                        System.out.println("║ ╠════════════════════════════════════════════════════════╝");
                        System.out.print  ("║ ╠─ ");
                        
                        String type = br.readLine();
                        switch (type)
                        {
                            case "OP":
                                System.out.print  ("║ ╠─ ");
                                question = br.readLine();
                                queries.add(new Question(question, Question.queryType.OPEN));
                                break;
                                
                            case "CL":
                                ArrayList<String> options = new ArrayList<>();
                                
                                System.out.print  ("║ ╠─ ");
                                question = br.readLine();
                                
                                // Add options
                                boolean isAddingOptions = true;
                                int cnt = 1;
                                while (isAddingOptions)
                                {                                    
                                    System.out.print  ("║ ╠─ " + cnt + ": ");
                                    String option = br.readLine();
                                    
                                    if (!option.equals(""))
                                    {
                                        options.add(option + System.lineSeparator());
                                        cnt++;
                                    }
                                    else
                                    {
                                        isAddingOptions = false;
                                        break;
                                    }
                                }
                                
                                queries.add(new Question(question, options, Question.queryType.CLOSED));
                                
                                break;
                                
                            case "":
                                b_add = false;
                                break;
                                
                            default:
                                System.out.println("║ ╠════════════════════════════════════════════════════════╗");
                                System.out.println("║ ║                     Invalid input!                     ║");
                                System.out.println("║ ╠════════════════════════════════════════════════════════╝");
                                break;
                        }
                        
                        
                    }
                    break;
                    
                // Handle answering
                case "ANS":
                    for (int i = 0; i < queries.size(); i++)
                    {
                        if (queries.get(i).type == Question.queryType.OPEN)
                        {
                            System.out.println("╠══════════════════════════════════════════════════════════╗");
                            System.out.println("║ " + queries.get(i).question);
                            System.out.println("╠──────────────────────────────────────────────────────────╝");
                            System.out.print  ("╠─ ");

                            String answer = br.readLine();

                            queries.get(i).answer = answer;
                        }
                        else if (queries.get(i).type == Question.queryType.CLOSED)
                        {
                            System.out.println("╠══════════════════════════════════════════════════════════╗");
                            System.out.println("║ " + queries.get(i).question);
                            System.out.println("╠──────────────────────────────────────────────────────────╝");
                            
                            int cnt = 1;
                            for (String s : queries.get(i).options)
                            {
                                System.out.print  ("╠ " + cnt + ": " + s);
                                cnt++;
                            }
                            
                            System.out.print  ("╠─ ");
                            
                            String answer = br.readLine();

                            queries.get(i).answer = answer;
                        }
                    }   break;
                    
                // Handle printing answers input
                case "DIS":
                    for (int i = 0; i < queries.size(); i++)
                    {
                        System.out.print(queries.get(i).toString());
                    }   
                    System.in.read();
                    break;
                    
                    
                // Handle invalid input
                default:
                    System.out.println("╠══════════════════════════════════════════════════════════╗");
                    System.out.println("║                      Invalid input!                      ║");
                    System.out.println("╠══════════════════════════════════════════════════════════╝");
                    break;
            }
        }
    }
    
}

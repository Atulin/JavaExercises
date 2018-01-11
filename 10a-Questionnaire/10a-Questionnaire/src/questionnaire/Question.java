/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questionnaire;

import java.util.ArrayList;

/**
 *
 * @author student
 */
public class Question {
    public String question;
    public String answer;
    ArrayList<String> options = new ArrayList<>();
    public queryType type;
    
    public enum queryType
    {
        CLOSED,
        OPEN
    }

    // Constructor
    public Question(String question, queryType type) {
        this.question = question;
        this.type = type;
    }
    
    public Question(String question, ArrayList<String> options, queryType type) {
        this.question = question;
        this.options = options;
        this.type = type;
    }

    // Setter
    public void setQuestion(String question) {
        this.question = question;
    }

    // Getter
    public String getQuestion() {
        return question;
    }

    // To string
    @Override
    public String toString() {      
        if (this.type == queryType.OPEN)
        {
            return "╠══════════════════════════════════════════════════════════╗" + System.lineSeparator() +
                   "║ Q: " + question + System.lineSeparator() +
                   "║ A: " + answer + System.lineSeparator() +
                   "╠══════════════════════════════════════════════════════════╝" + System.lineSeparator();
        }
        else
        {
            return "╠══════════════════════════════════════════════════════════╗" + System.lineSeparator() +
                   "║ Q: " + question + System.lineSeparator() +
                   "║ A: " + options.get(Integer.parseInt(answer)-1) + 
                   "╠══════════════════════════════════════════════════════════╝" + System.lineSeparator();
        }
    }
}

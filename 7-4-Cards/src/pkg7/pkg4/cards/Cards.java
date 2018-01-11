/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg4.cards;

/**
 *
 * @author Angius
 */
public class Cards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 20; i++)
        {
            System.out.println(Card.RandomCard().toString());
        }
    }
    
}

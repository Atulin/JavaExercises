/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7.pkg4.cards;

import java.util.Random;

/**
 *
 * @author Angius
 */
public class Card {
    
    public enum eSuit
    {
        HEARTS,
        DIAMONDS,
        CLUBS,
        SPADES;
        
        public static eSuit GetRandomSuit()
        {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }
    
    public enum eFace
    {
        ACE,
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING;
        
        public static eFace GetRandomFace()
        {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }
    
    eSuit suit;
    eFace face;
    
    public Card (eSuit suit, eFace face)
    {
        this.suit = suit;
        this.face = face;
    }
    
    public static Card RandomCard()
    {
        eSuit suit = eSuit.GetRandomSuit();
        eFace face = eFace.GetRandomFace();
        
        return new Card(suit, face);
    }
    
    @Override
    public String toString()
    {
        return this.face.name() + " of " + this.suit.name();
    }
}

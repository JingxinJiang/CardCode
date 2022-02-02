/*
 * Modifier: Jingxin Jiang
 * Student Number: 991657051
 * 
 */
package ca.sheridancollege.week2.softwarefundamentals;

/**
 * The class where we create Cards
 * @author dancye, 2019
 */
public class CardDealer 
{
    public static void main(String[] args)
    {
        Card nineClubs = new Card("Clbs", 9);
        nineClubs.setSuit("diamonds");
        Card newClubs = new Card("cat",8);
        newClubs.setSuit("Spades");
        System.out.println("new clubs"+newClubs.getSuit()); 
    }
}

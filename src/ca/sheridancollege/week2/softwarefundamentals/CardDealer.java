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
        System.out.println("new clubs is "+newClubs.getSuit()); 
        System.out.println("new clubs value is "+newClubs.getValue());
        Card newClubs1 = new Card("dog",4);
        System.out.println("new clubs1 is "+newClubs1.getSuit()); 
        System.out.println("new clubs1 value is "+newClubs1.getValue());
        
    }
}

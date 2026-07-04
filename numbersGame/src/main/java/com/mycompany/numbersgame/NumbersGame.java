

package com.mycompany.numbersgame;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Shady 
 */
public class NumbersGame {

    public static void main(String[] args) {
        Scanner Shady = new Scanner(System.in);
        int theNumber = (int)(Math.random()*100) +1;
        //System.out.println( theNumber );
        int guess = 50;
        System.out.print("Would you like to play the numbers game: ");
        String answer = Shady.nextLine();
        if (answer.equalsIgnoreCase("yes"))
        { 
             System.out.print("Lets begin " );
        }
        else if  (answer.equalsIgnoreCase("no"))
                {
                System.out.print("Maybe next time" );
                System.exit(0);
                }
                        
                        
        while (guess != theNumber)
        {
         System.out.print("Enter your Number (Between 1 to 100): " );
         guess = Shady.nextInt(); 
         System.out.println( "You entered: " + guess + "." );
         if (guess < theNumber )
             System.out.println( guess + " is too small man. ");
         else if (guess > theNumber)
             System.out.println( guess + " is too big man. ");
            
    }
        Shady.close();
    }
}

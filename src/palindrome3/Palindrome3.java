/*
 * Mouner Dabjan 
 * 24/02/2020
 * This program determines if a phrase is a palindrome or not 
 */
package palindrome3;
import javax.swing.*;
/**
 *
 * @author User
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        //variables neeeded
        String input; 
        String reverse = "";
        //asking the user for the input 
        input=JOptionPane.showInputDialog("Enter the phrase ( do not include a puncuation mark ) "); 
        // removing all space from the input
        String inputClean = input.replaceAll(" ", ""); 
        // reversing the input 
        for ( int i = inputClean.length() - 1; i >=0; i--)
        {
            reverse += inputClean.charAt(i); 
        }
        // checking if the input is a palindrome or not
        // printing the result to the user 
        if (reverse.equalsIgnoreCase(inputClean))
        {
            JOptionPane.showMessageDialog(null, input + " is a palindrome");
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, input +" is NOT a palindrome");
        }
    }
    
}

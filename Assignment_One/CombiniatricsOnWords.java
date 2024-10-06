/*********************************************************
 * ACS-2906-001 Assignment One
 * 
 * Name: Ekamjot Singh
 * Student ID: 3167888
 * 
 * Description: The following assignment takes an interge value from the user and then divides into
 * two separate integers based solely on the binary (bit) values of the original integer.
 *   
 * @author ejdhindsa
 * GitHub link: https://github.com/ejdhindsa/ACS-2906_Assignments/tree/main/Assignment_One
 * 
 ********************************************************/

//  import statements
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CombiniatricsOnWords {
    public static void main(String[] args) {

        // creating a scanner object
        Scanner kb = new Scanner(System.in);

        // asking user for the int at which required operations will be performed
        System.out.println("Please enter an integer value:");
        int userInput = kb.nextInt();

        // calling a method that will convert the integer into a binary value
        ArrayList<Integer> binaryValue = convertToBinary(userInput);

    } // end of main

    /******************************************************
     * @method convertToBinary
     * @param userInput Integer that is to be converted into its binary value
     * @return binaryValue returns a binary value
     *
     * The following method converts integer that has been passed a parameter to the method
     * into a binary value, which is then returned to the main method
    *****************************************************/
    public static ArrayList<Integer> convertToBinary(int userInput)
    {
        // creating an arraylist that will hold the binary bits of the userInput
        ArrayList<Integer> binaryValues = new ArrayList<>();

        // creating an algorithm that will convert the decimal values to binary values
        // creating variables required for said algorithms
        int quotient = userInput;
        int remainder = 0;

        // creating a while loop until the quotient becomes 0
        while(quotient != 0)
        {
            // since we are working with decimal values, the remainder when divided by two
            // provides the binary conversion (when reversed)
            remainder = quotient % 2;

            // now containing this value in the arraylist
            binaryValues.add(remainder);

            // to move forward to the next bit, we will change the quotient to half of what it is
            // i.e. divide it by the binary base of quotient
            quotient /= 2;

        } // end of while

        // since we have found the binary value but the order of the binary value is reversed
        // we will reverse the arraylist using the Collections package
        Collections.reverse(binaryValues);

        // returns the binary value
        return binaryValues;

    } // end of convert binary

} // end of class
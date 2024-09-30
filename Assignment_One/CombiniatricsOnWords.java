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

public class CombiniatricsOnWords {
    public static void main(String[] args) {

        // creating a scanner object
        Scanner kb = new Scanner(System.in);

        // asking user for the int at which required operations will be performed
        System.out.println("Please enter an integer value:");
        int userInput = kb.nextInt();

        // calling a method that will convert the integer into a binary value
        short binaryValue = convertToBinary(userInput);

    } // end of main

    /******************************************************
     * @method convertToBinary
     * @param userInput Integer that is to be converted into its binary value
     * @return binaryValue returns a binary value
     *
     * The following method converts integer that has been passed a parameter to the method
     * into a binary value, which is then returned to the main method
    *****************************************************/
    public static short convertToBinary(int userInput)
    {
        short binaryValue = 0;
        // now creating an algorithm that will convert integer values to binary values


        // returns the value
        return binaryValue;

    } // end of convert binary

} // end of class
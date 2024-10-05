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

        // creating an integer that will be a factorial of two
        // this int will be the value which will tell how many bits the userInput will be of
        int highestBit = 1;

        // this while-loop iterates as long as the highest bit is not higher than the user input,
        // therefore giving an exaxct number of bits for the input value
        while (userInput > Math.pow(2, highestBit))
        {
            highestBit++;
        } // end of while

        System.out.println(highestBit);


        // returns the value
        return binaryValues;

    } // end of convert binary

} // end of class
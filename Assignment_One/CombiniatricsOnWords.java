/*********************************************************
 * ACS-2906-001 Assignment One
 * 
 * Name: Ekamjot Singh
 * Student ID: 3167888
 * 
 * Description: The following assignment takes an integer value from the user and then divides into
 * two separate integers based solely on the binary (bit) values of the original integer.
 *   
 * @author ejdhindsa
 * GitHub link: https://github.com/ejdhindsa/ACS-2906_Assignments/tree/main/Assignment_One
 * 
 ********************************************************/

//  import statements
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CombiniatricsOnWords {
    public static void main(String[] args) {

        // creating a scanner object
        Scanner kb = new Scanner(System.in);

        // asking user for the int at which required operations will be performed
        System.out.println("Enter an integer x:");
        int userInput = kb.nextInt();

        // calling a method that will convert the integer into a binary value
        ArrayList<Integer> binaryValue = convertToBinary(userInput);

        // now to the equal division of the binary values into two separate entities

        // making two arrays that will hold the split values
        int binaryBitSize = binaryValue.size();
        int[] binarySplitOne = new int[binaryBitSize];
        int[] binarySplitTwo = new int[binaryBitSize];

        // creating a flag outside for loop to alternate between adding in splitOne and splitTwo
        boolean addToSplitOne = true;

        // now creating a for loop that will iterate through reversedBinaryValue
        for (int i = 0; i < binaryValue.size(); i++) {
            // since arrays are already filled with zeroes, it skips an additional step of
            // filling with zeros
            if (binaryValue.get(i) == 1) {
                // now working with the flag that the bit has been added to splitOne or not
                if (addToSplitOne) {
                    binarySplitOne[i] = binaryValue.get(i);
                    // now set the split to true so the flag is interchanged, and we can add value in split two
                    addToSplitOne = false;

                } // end of if
                else {
                    binarySplitTwo[i] = binaryValue.get(i);

                    // now set the split to false so that we can add value to split one
                    addToSplitOne = true;
                } // end of else

            } // end of main if

        } // end of for

        // now reversing the arrays to achieve the correct answer
        reverseArray(binarySplitOne);
        reverseArray(binarySplitTwo);

        // using a method convert the split binary values to decimal
        int splitOne = convertToDecimal(binarySplitOne);
        int splitTwo = convertToDecimal(binarySplitTwo);

        System.out.println("y \tz");
        System.out.println(splitOne + "\t" + splitTwo);

    } // end of main

    /******************************************************
     * @method convertToBinary
     * @param userInput Integer that is to be converted into its binary value
     * @return binaryValue returns a binary value
     *
     * @description The following method converts integer that has been passed a parameter to the method
     * into a binary value, which is then returned to the main method
     *****************************************************/
    public static ArrayList<Integer> convertToBinary(int userInput) {
        // creating an arraylist that will hold the binary bits of the userInput
        ArrayList<Integer> binaryValues = new ArrayList<>();

        // creating an algorithm that will convert the decimal values to binary values
        // creating variables required for said algorithms
        int quotient = userInput;
        int remainder;

        // creating a while loop until the quotient becomes 0
        while (quotient != 0) {
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

    /******************************************************
     * @method convertToDecimal
     * @param binaryArray binary array that is to be converted into an integer
     * @return decimalValue value of binary as an int
     *
     * @description The following method converts the binary array to the int value
     *****************************************************/
    public static int convertToDecimal(int[] binaryArray)
    {
        int decimalValue;
        String binaryValueString = "";

        for (int items : binaryArray)
        {
            binaryValueString += items;
        } // end of for-each

        // now using the Integer package method to convert to binary
        decimalValue = Integer.parseInt(binaryValueString, 2);

        return decimalValue;

    } // end of convertToDecimal

    // -------------------------------------------------------------
    // -------------------- UTILITY METHODS ------------------------
    // -------------------------------------------------------------

    /**************************************************************
     * @method printArrayList
     * @param arrayList Array List that is needed to be printed
     *
     * @description The following method prints the arraylist to the console
     *************************************************************/
    public static void printArrayList(ArrayList<Integer> arrayList)
    {
        // using a for each loop to print the contents of arraylist
        for (int items : arrayList)
        {
            System.out.print(items);
        } // end of for-each

    } // end of printArrayList

    /**************************************************************
     * @method printArray
     * @param array Array that is needed to be printed
     *
     * @description The following method prints the array to the console
     *************************************************************/
    public static void printArray(int[] array)
    {
        // printing the array using for loop
        for (int items : array)
        {
            System.out.print(items);
        } // end of for-each

        System.out.println();

    } // end of printArray

    /**************************************************************
     * @method reverse
     * @param array Array that needs to be reversed
     *
     * @description The following method reverses the array
     *************************************************************/
    static void reverseArray(int[] array)
    {
        // calling the Collections package and reversing the arrays
        Collections.reverse(Arrays.asList(array));

    } // end of reverseArray()

} // end of main
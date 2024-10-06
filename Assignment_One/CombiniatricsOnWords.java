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
        System.out.println("Please enter an integer value:");
        int userInput = kb.nextInt();

        // calling a method that will convert the integer into a binary value
        ArrayList<Integer> binaryValue = convertToBinary(userInput);

        // printing out the binary values of userInput
        System.out.print("Binary Value: 0B");
        printArrayList(binaryValue);

        // now to the equal division of the binary values into two separate entities

        // making two arrays that will hold the split values
        int binaryBitSize = binaryValue.size();
        int[] binarySplitOne = new int[binaryBitSize];
        int[] binarySplitTwo = new int[binaryBitSize];

        // since we need to split values from the least significant bit, we will reverse the binaryValue
        ArrayList<Integer> reversedBinaryValue = binaryValue;
        Collections.reverse(reversedBinaryValue);

        boolean addToSplitOne = true;

        // now creating a for loop that will iterate through reversedBinaryValue
        for(int i = 0; i < reversedBinaryValue.size(); i++)
        {
            // since arrays are already filled with zeroes, it skips an additional step of
            // filling with zeros
            if(reversedBinaryValue.get(i) == 1)
            {
                // now working with the flag that the bit has been added to splitOne or not
                if(addToSplitOne)
                {
                    binarySplitOne[i] = reversedBinaryValue.get(i);
                    // now set the split to true so the flag is interchanged, and we can add value in split two
                    addToSplitOne = false;

                } // end of if
                else
                {
                    binarySplitTwo[i] = reversedBinaryValue.get(i);

                    // now set the split to false so that we can add value to split one
                    addToSplitOne = true;
                } // end of else

            } // end of main if

        } // end of for

        // printing both arrays
        System.out.println();
        System.out.println(Arrays.toString(binarySplitOne));
        System.out.println(Arrays.toString(binarySplitTwo));

    } // end of main

    /******************************************************
     * @method convertToBinary
     * @param userInput Integer that is to be converted into its binary value
     * @return binaryValue returns a binary value
     *
     * @description The following method converts integer that has been passed a parameter to the method
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

    /**************************************************************
     * @method printArrayList
     * @param arrayList Array List that is needed to be printed
     *
     * @description The following method prints the arraylist to the console
     *************************************************************/
    public static void printArrayList(ArrayList<Integer> arrayList)
    {
        // using a for each loop to print the contents of arraylist
        for ( int items : arrayList)
        {
            System.out.print(items);
        } // end of for-each

    } // end of printArrayList

} // end of class
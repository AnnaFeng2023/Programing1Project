package Programing1Project;

import java.util.Arrays;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given an array nums containing n distinct numbers in the range [0, n], 
		 * return the only number in the range that is missing from the array.
		 */
		
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int size = kb.nextInt();

        int[] myarr = new int[size];

        System.out.println("Enter the elements of the array in the range [0, " + size +  "]:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            myarr[i] = kb.nextInt();
        }


		System.out.print("nums = ");
		System.out.println(Arrays.toString(myarr));
		
		System.out.print("output: ");
		System.out.println(findMissingElements(myarr));
		kb.close();

	}
	
	
	public static int findMissingElements(int[] myarr) {

		int[] newArray = new int[myarr.length + 1];
		
		for (int i = 0; i < myarr.length + 1; i++) {
			newArray[i] = i;
        }
//		System.out.print("output: ");
//		System.out.println(Arrays.toString(newArray));
		
		
		int missingEl = 0 ;
        for (int newEl : newArray) {
            boolean found = false;
            for (int el : myarr) {
                if (newEl == el) {
                    found = true;
                    break;
                }
            }
            if (!found) {
            	missingEl = newArray[newEl];
            }
        }

        return missingEl;
    }

}

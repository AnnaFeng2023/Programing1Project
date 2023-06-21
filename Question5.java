package Programing1Project;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Given an array nums of size n, return the majority element.
 		   The majority element is the element that appears more than ⌊n / 2⌋ times. 
 		   You may assume that the majority element always exists in the array.
		 */
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int size = kb.nextInt();

        int[] myarr = new int[size];

        int times = size / 2;
        System.out.println("Enter the elements of the array, one of the elements at lease appears more than " + times + " times:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            myarr[i] = kb.nextInt();
        }


		System.out.print("nums = ");
		System.out.println(Arrays.toString(myarr));
		
		
		System.out.print("output: ");
		System.out.println(findMajorityEl(myarr));
		kb.close();
	}
	
	public static int findMajorityEl(int[] myarr) {
		int majorityEl = myarr[0];
        int count = 1;

        for (int i = 1; i < myarr.length; i++) {
            if(myarr[i] == majorityEl) {
                count++;
            } 
            else{
                count--;
                if (count == 0) {
                	majorityEl = myarr[i];
                    count = 1;
                }
            }
        }

        return majorityEl;
    }
}

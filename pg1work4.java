package pg1work;

import java.util.Random;
import java.util.Scanner;

public class pg1work4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = getarray();
		System.out.println();
		System.out.println("Your sorted  Array in Ascending order is:  ");
		for (int ele: a) {
			System.out.print(ele+"  "); 
		}
	}
    
	public static int[] getarray() {
		
		
		int[] arr= {2,5, 77, 22, 99,18, 22,7, 12,81};
		
		System.out.println();
		System.out.println("Your Unsorted  Array  is:  ");
		for (int ele: arr) {
			System.out.print(ele+"  "); 
		}
		int[] sortarr  = sort(arr);
		return arr;
	}
	
	public static int[] sort(int[] b) {
		
		int i, j, val =0;
		for (i = 0; i < b.length; i++) {
			for (j = i+1; j < b.length ; j++) {
				if (b[i] > b[j]) {
					val = b[i];
		            b[i] =    b[j];
		            b[j] =    val;
		            
			
				}
			}
		}
		return b;
	}

}


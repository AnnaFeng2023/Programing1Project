package pg1work;

import java.util.Random;
import java.util.Scanner;

public class pg1work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		int i, j, jok , put, val=0;
		System.out.println("Enter number value for JOKER :  ");
		jok = scan.nextInt();
		System.out.println("Enter number of times to input :  ");
		put = scan.nextInt();
		int[] arr = new int[put];
		
		System.out.println("Enter the number for input "+ put+ " times :");
		for (i = 0; i < put; i++) {
			arr [i] = scan.nextInt();
			
		}
		
		System.out.println("Number output is as: ");
		for ( i =0; i< put; i++) {
			if (arr[i] < jok) {
				System.out.print(arr[i]+"  ");
			}else {
				arr[i] = arr[i]%jok;
				System.out.print(arr[i]+"  ");
			}
		}
		
	}

}

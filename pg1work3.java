package pg1work;

import java.util.Random;
import java.util.Scanner;

public class pg1work3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		int i, j, row, col, val=0;
		System.out.println("Enter number of rows for arrary :  ");
		row = scan.nextInt();
		System.out.println("Enter number of columns for arrary :  ");
		col = scan.nextInt();
		int[][] a = new int[row][col];
		
		System.out.println("Your Array  is:  ");
		for (i = 0; i < row; i++) {
			for ( j = 0; j < col; j++) {
			a[i][j] = rand.nextInt(99)+1;
			System.out.print(a[i][j]+"  "); 
		}
			System.out.println();	
		}	
		
		System.out.println("Enter number to disappear :  ");
		val = scan.nextInt();
		
		for (i= 0; i<row; i++) {
			for (j=0; j<col;j++) {
				if ( a[i][j] == val) {
					a[i][j] = 0;
				}
			}
		}
			
			System.out.println("Modified Array  is:  ");
			for (i = 0; i < row; i++) {
				for ( j = 0; j < col; j++) {
				
				System.out.print(a[i][j]+"  "); 
			}
				System.out.println();	
			}
		
			
	
	}

}

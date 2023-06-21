package Programing1Project;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 3 2-digit numbers: ");
		
		System.out.print("n1: ");
		String n1String = kb.nextLine(); 
		n1String = n1String.replace(" ", "");
		int n1 = Integer.parseInt(n1String);
		
		System.out.print("n2: ");
		String n2String = kb.nextLine(); 
		n2String = n2String.replace(" ", "");
		int n2 = Integer.parseInt(n2String);
		
		System.out.print("n3: ");
		String n3String = kb.nextLine(); 
		n3String = n3String.replace(" ", "");
		int n3 = Integer.parseInt(n3String);
		
		int sum = n1 + n2 + n3;
		int firstDigitN2 = n2 / 10; 
		int lastDigitN2 = n2 % 10;
		
		//A multiple of 3 but not a multiple of 5 
		//then the magic number is made up of the 1st digit of n2 followed by the sum of n1 and n3.
		if((sum % 3 == 0) && (sum % 5 != 0)) {
			System.out.printf("The magicNum is: %d%d", firstDigitN2, (n1+n3));
		}
		//Not a multiple of 3 but a multiple of 5 
		//then the magic number is made up of the sum of n1 and n3 followed by the last digit of n2.
		else if((sum % 3 != 0) && (sum % 5 == 0)) {
			System.out.printf("The magicNum is: %d%d", (n1+n3), lastDigitN2);
		}
		//A multiple of 3 and a multiple of 5 
		//then the magic number is n2 followed by n1 followed by the digit 1.
		else if((sum % 3 == 0) && (sum % 5 == 0)) {
			System.out.printf("The magicNum is: %d%d1", n2, n1);
		}
		//None of the above conditions then the magic number is n1 followed by n2 followed by n3.
		else {
			System.out.printf("The magicNum is: %d%d%d", n1, n2, n3);
		}
		kb.close();
		
	}

}

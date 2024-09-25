package javaPrograms;

import java.util.Scanner;

public class positiveNeg {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		posNeg(n);

	}
	
	public static void posNeg(int n) {
		if(n>0) {
			System.out.println("It is a positive number");
		}
		else if(n== 0) {
			System.out.println("It is neither a positve number nor a negative number");
		}
		else {
			System.out.println("It is a negative number");
		}
		
	}

}

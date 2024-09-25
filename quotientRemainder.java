package javaPrograms;

import java.util.Scanner;

public class quotientRemainder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dividend : ");
		int dividend = sc.nextInt();
		System.out.println("Enter the dividor : ");
		int divisor = sc.nextInt();
		quotientRemainder(dividend, divisor);
		

	}
	
	public static void quotientRemainder(int dividend, int divisor) {
		
		int quotient = dividend / divisor;
		int Remainder = dividend % divisor;
		
		System.out.println(" Quotient : " + quotient +" and Remainder : " + Remainder);
		
	}

}

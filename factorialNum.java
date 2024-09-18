package javaPrograms;

import java.util.Scanner;

public class factorialNum {

	public static void main(String[] args) {
		
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		numFact(num);

	}

	
	public static void numFact(int num) {
		int fact = 1;
		for (int i=1; i<=num; i++) {
			fact = fact*i;
			
		}
		
		System.out.println("The factorial of " + num +" is :" + fact);
	}
}

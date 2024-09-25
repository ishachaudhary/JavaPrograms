package javaPrograms;

import java.util.Scanner;

public class swapNums {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first num : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second num : ");
		int b = sc.nextInt();
		
		swapNum(a, b);

	}
	
	public static void swapNum(int a, int b) {
		
		int temp =0;
		 temp = a;
		 a = b;
		 b = temp;
		
	     
		System.out.println("After swapping, first num is : " + a + " Second num is : " + b);
		
	}

}

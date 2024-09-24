package javaPrograms;

import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		oddEven(n);
		

	}
	public static void oddEven(int n) {
		
		if (n>0) {
			if (n%2==0) {
				System.out.println("It is an even number");
			}
			else {
				System.out.println("It is an odd number");
			}
		}
		else {
				System.out.println("It is neither a even nor odd number");
			}
		
	}
}

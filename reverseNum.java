package javaPrograms;

import java.util.Scanner;

public class reverseNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for reversing : ");
		int n = sc.nextInt();
		reverseNum(n);

	}
	
	public static void reverseNum(int n) {
		
		int num =0;
		int n1 = 0;
		
		while (n !=0) {
		n1 = n % 10;
		num = num * 10 + n1;
		n = n/10;
		
		
		}
		System.out.println("Reverse of number is : " + num );
		
	}

}

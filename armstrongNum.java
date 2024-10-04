package javaPrograms;

import java.util.Scanner;

public class armstrongNum {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number : ");
		 int num = sc.nextInt();
		 armstrongNum(num);
		 
	}
	public static void armstrongNum(int num) {
		 int n = 0; 
		 int sum =0;
		 int digits =0;
		 int originalnum = num;
		 
		 int temp = num;
	        while (temp != 0) {
	            temp = temp / 10;
	            digits++;
	        }
		 
		 while (num!=0) {
			 n = num%10;
			 sum += Math.pow(n, digits);
			 num = num/10;
			 
			  }
		 System.out.println("the armstrong check = " + sum);
		 if(sum == originalnum) {
			 System.out.println("It is an armstrong num");
		 }
		 else {
			 System.out.println("It is not an armstrong num");
		 }
	}
		

}

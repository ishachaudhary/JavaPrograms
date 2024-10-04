package javaPrograms;

import java.util.Scanner;

public class palindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter number : ");
		 int num = sc.nextInt();
		 palindromeNum(num);
		 
	}
	public static void palindromeNum(int num) {
		 int n =0;
		 int n1=0;
		 int originalnum = num;
		 while(num!=0) {
			 n = num%10;
			 n1 = n1*10+n;
			 num = num/10;
		 }
		 System.out.println("reverse num is : " + n1);
		 System.out.println("original num : " + originalnum);
		 
		 if(originalnum == n1) {
			 
			 System.out.println("It is an palindrome number");
		 }
		 else {
			 System.out.println("It is not an palindrome number");
		 }
	}
		

}


	



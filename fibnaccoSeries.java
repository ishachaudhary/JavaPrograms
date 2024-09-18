package javaPrograms;

import java.util.Scanner;

public class fibnaccoSeries {

	public static void main(String[] args) {
		
		System.out.println("Enter the number for fibnaccio series: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		getFibnaccioSeries(num);
		
	
		
		
	}
	public static void getFibnaccioSeries(int num) {
		
		int num1 = 0;
		int num2= 1;
		 
		 for (int i =0; i<num; i++) {
			 System.out.println(num1);
			 int sum = num1+num2;
			 num1 = num2;
			 num2 = sum;
			 
			 
		 }
				
		
	}
	

}

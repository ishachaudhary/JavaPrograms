package javaPrograms;

import java.util.Scanner;

public class sumOfNaturalNums {

	public static void main(String[] args) {

			

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Number");

			

			int num = sc.nextInt();

			sumOfNaturalNums(num);

			

		}

		

		public static void sumOfNaturalNums(int num) {

			int sum =0;

			for (int i =1; i<=num; i++) {

				sum += i;

				

				

			}

			System.out.println("The sum of " + num + " integers: " + sum );

			



	

	}

}

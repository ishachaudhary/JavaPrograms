package javaPrograms;

import java.util.Scanner;

public class largestAmongThreeNumbers {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		  System.out.print("Enter the first number: ");
				         int num1 = scanner.nextInt();

	     System.out.print("Enter the second number: ");
				         int num2 = scanner.nextInt();

	     System.out.print("Enter the third number: ");
				         int num3 = scanner.nextInt();
         largestOfThreeNum(num1, num2, num3);	         
	}
	
	public static void largestOfThreeNum(int num1, int num2, int num3) {
		int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);


	
	

}
}

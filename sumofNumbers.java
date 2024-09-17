package javaPrograms;

import java.util.Scanner;

public class sumofNumbers {

	public static void main(String[] args) 
		{
			int N ;
			//initialising the Scanner class
			 Scanner sc = new Scanner(System.in);
			 
			 System.out.println("Enter number of elements : ");
			  N = sc.nextInt();
			  int sum = 0;
			  
			  System.out.println("Enter " + N + " elements : ");
			  
			  for (int i =0; i<N; i++){
				 int a = sc.nextInt();
				 sum += a;
				  
			  }
					  
		
			  System.out.println("Sum of Input Numbers : " + sum);
			 
			
		

	}

}

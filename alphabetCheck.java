package javaPrograms;

import java.util.Scanner;

public class alphabetCheck {
	
	
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		

		char c1 = sc.next().charAt(0);
	
		
		if((c1>='a' && c1<='z') || (c1>='A' && c1<='Z') )
		{
			System.out.println("It is a Alphabet");
		}
		else
		{
			System.out.println("It is not  Alphabet");
		}
		
}
}

// or we can use isAlphabetic method 
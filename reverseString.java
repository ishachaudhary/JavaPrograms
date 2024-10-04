package javaPrograms;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a word : ");
		String word = sc.next();
		reverseString(word);
		
	
	
	}
	public static void reverseString(String word) {
		char ch;
		String nstr ="";
		
		for(char i=0; i<word.length(); i++) {
			ch = word.charAt(i);
			nstr = ch+ nstr;
		}
		System.out.println(" The reversed string is : " + nstr);
	}

}
// we can use direct reverse() method too 

//StringBuilder input1 = new StringBuilder();

// append a string into StringBuilder input1
//input1.append(input);

// reverse StringBuilder input1
//input1.reverse();

// print reversed String
//System.out.println(input1);
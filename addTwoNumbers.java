
package javaPrograms;

import java.io.*;

public class addTwoNumbers {
	
	public static int sum (int num1, int num2) {
		return num1+num2;
		
	}
	
	public static void main(String[] args) {
		addTwoNumbers obj = new addTwoNumbers();
		int res = obj.sum(24, 48);
		System.out.println(res);
	}

}

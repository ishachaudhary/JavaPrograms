package javaPrograms;

public class numOfDigits {

	public static void main(String[] args) {
		
		long num = 234567;

		int count = 0;
		
		while(num != 0){
			num = num/10;//123 12 1 0
			++count;//1 2 3 4
		}
		
		System.out.println("number of digits : "+ count);
		
		
		
	}


		

	}



package javaPrograms;

import java.util.Random;

public class generateRandomNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int rand1 = rand.nextInt(2000);
		int rand2 = rand.nextInt(2000);
		double rand3 = rand.nextDouble(1000);
		
		System.out.println("The random integers are " + rand1 +" ,"+ rand2 +" and " + rand3 );

	}

}

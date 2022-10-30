package test;

import java.util.Scanner;

class sumOfNumber {
	
	static void sumOfNum() {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number you want to calculate.");
		String input = sc.nextLine();
		int number = Integer.parseInt(input);
		
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
				
		}
			
		System.out.println("The result is " + sum + ".");	
			
	}
		
		
		
	
	
	public static void main(String[] args) {
		sumOfNum();
	}
	
}

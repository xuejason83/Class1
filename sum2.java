package sum;

import java.util.Scanner;

public class sum2 {
	static void suryabhatt(){
			Scanner sc = new Scanner(System.in);
			System.out.println("Please input the number you want to add up to");
			int number = sc.nextInt();
			int a = 0;
			for (int i = 1; i <=number; i++) {
				a = a + i;
				if (i == number) {
					System.out.println("The sum of 1 to "+ number + " is " + a);
				}
			}
			}
	public static void main(String[] args) {
		suryabhatt();
		
	}

}

import java.util.Scanner;
public class Sum {


	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("input number to add up");
			int number = sc.nextInt();
			int add = 0;
			for (int nextnum = 1; nextnum <= number; nextnum++) {
				add = add + nextnum;
				if (nextnum == number) {
					System.out.println("The sum of 1 to "+ number + " is " + add);
			}
		}
	}
}
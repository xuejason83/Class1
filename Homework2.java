import java.util.Random;
import java.util.Scanner;
public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
		String[] names = new String[4];
		Scanner input = new Scanner(System.in);
		for (int counter = 0; counter < 4; counter++) {
			System.out.println("Enter the name of friend "+(counter+1));
			names[counter] = input.nextLine();
		}
		System.out.println("repeat x times");
		int repeat = input.nextInt();
		int person1 = 0;
		int person2 = 0;
		int person3 = 0;
		int person4 = 0;
		int count = 0;
		while (count<= repeat-1) {
			System.out.println("type 1 to starting");
			int starting = input.nextInt();
			Random random = new Random();
			int randomnumber = random.nextInt(4, 13);
			int thing = 0;
			if (starting == 1) {
				while (thing<(randomnumber-1)) {
					if(thing%4==0) {
						Thread.sleep(500);
						System.out.println(names[0]);
						thing++;
					}
					else if(thing%4==1) {
						Thread.sleep(500);
						System.out.println(names[1]);
						thing++;
					}
					else if(thing%4==2) {
						Thread.sleep(500);
						System.out.println(names[2]);
						thing++;
					}
					else if(thing%4==3) {
						Thread.sleep(500);
						System.out.println(names[3]);
						thing++;
					}
			
				}
				int a = ((randomnumber-1)%4);
				Thread.sleep(500);
				System.out.println("Final result is " + names[a]);
				count++;
				if (a == 0) {
					person1++;
				}
				else if (a == 1) {
					person2++;
				}
				else if (a==2) {
					person3++;
				}
				else if (a==3) {
					person4++;
				}
			
		
		}
	}
	System.out.println("how many times each person was picked");
	System.out.println(names[0] + ":" + person1);
	System.out.println(names[1] + ":" + person2);
	System.out.println(names[2] + ":" + person3);
	System.out.println(names[3] + ":" + person4);
}
}

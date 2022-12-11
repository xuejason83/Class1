import java.util.Random;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
		String[] names = new String[4]; // string list
		Scanner input = new Scanner(System.in); // input
		for (int counter = 0; counter < 4; counter++) { // for loop
			System.out.println("Enter the name of friend " + (counter + 1));
			names[counter] = input.nextLine(); // input name into list
		}
		String[] names1 = new String[4];
		names1 = names;
		System.out.println("repeat x times"); // repeat x times
		int repeat = input.nextInt(); // input = int repeat varaible
		int person0 = 0; // primitave variable, integar
		int person1 = 0; // primitave variable, integar
		int person2 = 0; // primitave variable, integar
		int person3 = 0; // primitave variable, integar
		int count = 0; // primitave variable, integar
		while (count <= repeat - 1) { // while loop, repeats until count is smaller than repeat-1
			System.out.println("type 1 to starting");
			int starting = input.nextInt(); // starting = input for line above
			Random random = new Random();
			int randomnumber = random.nextInt(4, 13); // pick random number between 4 and 13
			int thing = 0; //// primitave variable, integar
			int p0count = 0;
			int p1count = 0;
			int p2count = 0;
			int p3count = 0;

			if (starting == 1) { // if 1 is typed
				if (person0 == 5) {

				}
				while (thing < (randomnumber - 1)) { // repeat x times, while thing is smaller than randomnumber-1
					if (thing % 4 == 0 && person0 <= 5) { // if thing mod 4 is 0
						Thread.sleep(500); // pause 500 miliseconds
						System.out.println(names1[0]); // print names index 0, first name
						thing++; // thing++, keep count of how many times repeated
					} else if (thing % 4 == 1 && person1 <= 5) { // if thing mod 4 is 1
						Thread.sleep(500); // pause 500 miliseconds
						System.out.println(names1[1]); // print names index 1, second name
						thing++; // thing++, keep count of how many times repeated
					} else if (thing % 4 == 2 && person2 <= 5) { // if thing mod 4 is 2
						Thread.sleep(500); // pause 500 miliseconds
						System.out.println(names1[2]); // print names index 2, third name
						thing++; // thing++, keep count of how many times repeated
					} else if (thing % 4 == 3 && person3 <= 5) { // if thing mod 4 is 2
						Thread.sleep(500); // pause 500 miliseconds
						System.out.println(names1[3]); // print names index 3, fourth name
						thing++; // thing++, keep count of how many times repeated
					}
					if (person0 == 5) {
						p0count++;
					} else if (person1 == 5) {
						p1count++;
					} else if (person2 == 5) {
						p2count++;
					} else if (person3 == 5) {
						p3count++;
					}

				}
				int total = p0count + p1count + p2count + p3count;
				if (total == 0) {
					int remainder = ((randomnumber - 1) % 4); // final name
					Thread.sleep(500); // pause 500 miliseconds
					System.out.println("Final result is " + names[remainder]); // print final name
					count++; // count++ repeat process x times
				} else if (total == 1) {
					int remainder = ((randomnumber - 1) % 3); // final name
					Thread.sleep(500); // pause 500 miliseconds
					System.out.println("Final result is " + names[remainder]); // print final name
					count++; // count++ repeat process x times
				} else if (total == 2) {
					int remainder = ((randomnumber - 1) % 2); // final name
					Thread.sleep(500); // pause 500 miliseconds
					System.out.println("Final result is " + names[remainder]); // print final name
					count++; // count++ repeat process x times
				} else if (total == 3) {
					int remainder = ((randomnumber - 1) % 1); // final name
					Thread.sleep(500); // pause 500 miliseconds
					System.out.println("Final result is " + names[remainder]); // print final name
					count++; // count++ repeat process x times
				}
				if (remainder == 0) { // keep count how many times person has gone
					person0++;
				} else if (remainder == 1) { // keep count how many times person has gone
					person1++;
				} else if (remainder == 2) { // keep count how many times person has gone
					person2++;
				} else if (remainder == 3) { // keep count how many times person has gone
					person3++;
				}

				System.out.println("how many times each person was picked"); // print how many times each person was
																				// picked
				System.out.println(names[0] + ":" + person0);
				System.out.println(names[1] + ":" + person1);
				System.out.println(names[2] + ":" + person2);
				System.out.println(names[3] + ":" + person3);
				System.out.println(names1[0]);
				System.out.println(names1[1]);
				System.out.println(names1[2]);
				System.out.println(names1[3]);

			}

		}

	}
}

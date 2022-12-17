import java.util.Random;
import java.util.Scanner;

public class Homework2 {
public static String[] removeelement(String[] listname,String name){ // removeelement, (String[] listname,String name) as format. 
	String[] Stringlist1 = new String[listname.length-1]; //string Stringlist1 = new string with length listname-1
	int index = 0; //index is 0
	for(String i:listname) { // assign an index of listname to i
		if (i.equals(name)) { //if i is equal to what you want to remove
			continue; //continue
		}
		Stringlist1[index++] = i; //iliterate through elements of list
	}
	return Stringlist1; //return new list with removed element
}

	public static void main(String[] args) throws InterruptedException {
		String[] names = new String[4]; // string list
		Scanner input = new Scanner(System.in); // input
		String[] names1 = new String[4];
		for (int counter = 0; counter < 4; counter++) { // for loop
			System.out.println("Enter the name of friend " + (counter + 1));
			names[counter] = input.nextLine(); // input name into list
			names1[counter] = names[counter];
		}
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

			if (starting == 1) { // if 1 is typed
				while (thing < (randomnumber - 1)) { // repeat x times, while thing is smaller than randomnumber-1
					if (thing % 4 == 0) { // if thing mod 4 is 0
						Thread.sleep(200); // pause 500 miliseconds
						System.out.println(names1[0]); // print names index 0, first name
						thing++; // thing++, keep count of how many times repeated
					} else if (thing % 4 == 1) { // if thing mod 4 is 1
						Thread.sleep(200); // pause 500 miliseconds
						System.out.println(names1[1]); // print names index 1, second name
						thing++; // thing++, keep count of how many times repeated
					} else if (thing % 4 == 2) { // if thing mod 4 is 2
						Thread.sleep(200); // pause 500 miliseconds
						System.out.println(names1[2]); // print names index 2, third name
						thing++; // thing++, keep count of how many times repeated
					} else if (thing % 4 == 3) { // if thing mod 4 is 2
						Thread.sleep(200); // pause 500 miliseconds
						System.out.println(names1[3]); // print names index 3, fourth name
						thing++; // thing++, keep count of how many times repeated
					}
					if (person0 == 5) { //if person0 is picked 5 times
						names = removeelement(names,names1[0]); //use remove element to remove person0 from list
						person0++; //person0++, (person0==6?5:person0)
					} else if (person1 == 5) { //if person1 is picked 5 times
						names = removeelement(names,names1[1]); //use remove element to remove person1 from list
						person1++; //person0++, (person1==6?5:person0)
					} else if (person2 == 5) { //if person2 is picked 5 times
						names = removeelement(names,names1[2]); //use remove element to remove person2 from list
						person2++; //person0++, (person2==6?5:person0)
					} else if (person3 == 5) { //if person3 is picked 5 times
						names = removeelement(names,names1[3]); //use remove element to remove person3 from list
						person3++; //person0++, (person3==6?5:person0)
					} 

				}
				int remainder = 0;
					remainder = ((randomnumber - 1) % names.length); // final name
					Thread.sleep(200); // pause 500 miliseconds
					System.out.println("Final result is " + names[remainder]); // print final name
					count++; // count++ repeat process x times
					
				if (names[remainder].equals(names1[0])) { // keep count how many times person has gone
					person0++;
				} else if (names[remainder].equals(names1[1])) { // keep count how many times person has gone
					person1++;
				} else if (names[remainder].equals(names1[2])) { // keep count how many times person has gone
					person2++;
				} else if (names[remainder].equals(names1[3])) { // keep count how many times person has gone
					person3++;
				}
				
				Thread.sleep(500);
				System.out.println("how many times each person was picked"); // print how many times each person was
				Thread.sleep(500);																// picked
				System.out.println(names1[0] + ":" +(person0==6?5:person0)); //if person0 is picked 6 times then print 5:person0, x:y, if x is true then y
				System.out.println(names1[1] + ":" +(person1==6?5:person1)); //if person1 is picked 6 times then print 5:person1, x:y, if x is true then y
				System.out.println(names1[2] + ":" +(person2==6?5:person2)); //if person2 is picked 6 times then print 5:person2, x:y, if x is true then y
				System.out.println(names1[3] + ":" +(person3==6?5:person3)); //if person3 is picked 6 times then print 5:person3, x:y, if x is true then y

			}

		}

	}
}

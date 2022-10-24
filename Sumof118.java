public class Sumof118 {
	public static void main(String[] args) {
		int total = 0;
		int nums = 0;
		boolean stoploop = true;
		while (nums <= 188){
			total = total + nums;
			nums = nums + 1;
			if (total >= 134 && stoploop) {
				System.out.println("The sum of" + " " + nums + " numbers is bigger 134.");
				stoploop = false;
			}
		}
		System.out.println("The sum of 1 to 188 is " + total);
}
	}



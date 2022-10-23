package test;

class sumOf188 {
	
	static void sum188() {
		int sum = 0;
		int count = 0;
		boolean first = true;
		while (count < 188) {
			count++;
			sum = sum + count;
			if (sum >= 134 && first) {
				System.out.println("Sum of first " + count + " numbers is equal to " + sum + " which is bigger than or equal to 134");
				first = false;
			}
			
		}
		System.out.println("Sum of 1 to 188 is " + sum);
		
	}
	
	public static void main(String[] args) {
		sum188();
	}
	
} 

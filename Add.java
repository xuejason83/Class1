package addup;

class addingup {

	

	 static void mymethod(){
		int count = 0;
		int x = 0;
		int thing = 1;
		while (x <= 188){
			count = count+x;
			x = x + 1;
			if (count >= 134 && thing == 1) {
				System.out.println("The sum of first "+ x + " numbers is bigger than 134.");
				thing += 1;
			}
		}
		System.out.println("The sum of 1 to 188 is " + count);
	 }
		public static void main(String[] args) {
			mymethod();
		}


}

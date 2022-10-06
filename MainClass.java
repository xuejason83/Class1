package suryabhatt;

public class MainClass {
	public int printStepWays(int targetStep) {
		int targetways = 0;

		if (targetStep == 1 || targetStep == 0) {
			return 1;
		} else if (targetStep == 2) {
			return 2;
		} else if (targetStep == 3) {
			return 4;
		} else if (targetStep < 0) {
			System.out.println("This does not work");
			return(0);
			
		}

		else {
			return (printStepWays(targetStep - 1) + printStepWays(targetStep - 2) + printStepWays(targetStep - 3));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass test1 = new MainClass();
		System.out.println("The final result = " + test1.printStepWays(-5));

	}
}
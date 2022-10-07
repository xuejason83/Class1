import java.util.Scanner;
	public class MainClass {
		public int printStepWays(int targetStep) {
    		Scanner scan = new Scanner (System.in);
    		System.out.println("Enter number");
    		int targetStep = scan.nextInt();
    		
    		
    			
    		if (targetStep < 0) {
    			System.out.println("Cannot have less than 0");
    			return(0);
    		} else if (targetStep == 1) {
    			return 1;
    		} else if (targetStep == 0) {
    			return 1;
    		} else if (targetStep == 2) {
    			return 2;
    		} else if (targetStep == 3) {
    			return 4;
    			
    		}

    		else {
    			return (printStepWays(targetStep - 1) + printStepWays(targetStep - 2) + printStepWays(targetStep - 3));
    		}
    	}

    	public static void main(String[] args) {
    		MainClass test1 = new MainClass();
    		System.out.println("The final result = " + test1.printStepWays(TargetStep));
    	}
    }
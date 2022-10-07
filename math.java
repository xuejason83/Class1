package test;

public class math {
	public static int printStepWays(int targetStep) {
		if (targetStep == 1) {
			return 1;
		} else if (targetStep == 2) {
			return 2;
		} else if (targetStep == 3) {
			return 4;
		}
		
		int targetWays = printStepWays(targetStep-1) +
				printStepWays(targetStep-2) +
				printStepWays(targetStep-3);
		
		return targetWays;
	}
	
	public static void main(String[] args) {
		System.out.println("The amount of ways to climb 8 steps is " + printStepWays(8));
	}
}

// I do not know how to do input so as a placeholder I just put 8 as the targetStep
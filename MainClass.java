package suryabhatt;

class MainClass{
public int  printStepWays(int targetStep) {
        int targetways = 0;
        if (targetStep > 3) {
        	 targetways = targetways + (printStepWays(targetStep-1)+printStepWays(targetStep-2)+printStepWays(targetStep-3));
        }
    
         else if (targetStep == 1){
        	return 1;
        }else if (targetStep == 2) {
        	return 2;
        } else if (targetStep == 3) {
        	return 4; }
		return targetways;}
        



   public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello World");
        MainClass test1 = new MainClass();
        System.out.println("The final result = " + test1.printStepWays(8));
    
}
}
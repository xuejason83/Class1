
public class MainClass {
    public MainClass () {

    }
    public void  printStepWays(int targetStep) {
        int stepsFor1 = 1;
        int stepsFOr2 = 2;
        int targetways = 0;
        if (targetStep > 1) {
            printStepWays(targetStep - 1);
        } else {
        System.out.println("The target step ways is " + stepsFor1);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Hello World");
        MainClass test1 = new MainClass();
        test1.printStepWays(10);
    }

}
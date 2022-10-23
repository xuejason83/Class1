public class Sum {
	
    public static void main(String[] args) {
        int x=1;
        int sum=0;
        boolean Printed = false ;

        while(x<=188){
            sum =sum+x++;
            if (sum >= 134 && Printed == false){
                System.out.println("Sum bigger than 134 is " + sum + ", index is " + x );
                Printed =true ;
            }
        }
        System.out.println("Total is " + sum);
    }
}















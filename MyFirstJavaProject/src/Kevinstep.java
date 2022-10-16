
public class Kevinstep 

{
	public static void main(String[] args) {
		int steps=4;
		System.out.println("Possiblity:" +P(steps));
	}
	public static int P(int steps) {
		
		if(steps<=0){
			return 0;
		}
		else if(steps==1) {
			return 1;
		}
		else if(steps==2) {
			return 2;
		}
		else if(steps==3) {
			return 4;
		}
		else{
			return P(steps-1) + P(steps -2) + P(steps -3) ;
		}
	}
}

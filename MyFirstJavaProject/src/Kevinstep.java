public class Kevinstep 

{
	public static void main(String[] args) {
		int steps=9;
		System.out.println("Possiblity:" +P(steps));
	}
	
	
	public static int P(int steps) {
		
		int ret ;
		
		if(steps<=0){
			ret =  0;
		}
		else if(steps==1) {
			ret =  1;
		}
		else if(steps==2) {
			ret = 2;
		}
		else if(steps==3) {
			ret =  4;
		}
		else{
			ret = P(steps -1) + P(steps -2) + P(steps -3) ;
		}
		
		return ret ;
	}
}

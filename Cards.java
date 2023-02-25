package blackjack;
import java.util.Random;

public class Cards {
    private String[] heart = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private String[] spades = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private String[] box = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private String[] club = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    
    public String getCards() {
    	String rst = "";
    	int pos = 0;
    	Random rn = new Random();
    	int a = rn.nextInt(4) + 1;
    	if (a == 1) {
    		rst += "heart-";
    		pos = rn.nextInt(heart.length);
    		rst+=heart[pos];
    	} else if (a == 2) {
    		rst += "spades-";
    		pos = rn.nextInt(spades.length);
    		rst+=spades[pos];
    	} else if (a == 3) {
    		rst += "box-";
    		pos = rn.nextInt(box.length);
    		rst+=box[pos];
    	} else if (a == 4) {
    		rst += "club-";
    		pos = rn.nextInt(club.length);
    		rst+=club[pos];
    	} else {
    		System.out.println("Invalid value of the array:" + a);
    	}
    	return rst;
    }
}

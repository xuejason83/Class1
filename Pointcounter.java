package tennis;
import java.util.Scanner;
public class Pointcounter{
	  public static void main(String[] args) {
		  int score1 =0;
		  int score2 =0;
		  String winPlayer;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Please input the first player name");
		  String player1 = sc.nextLine();
		  System.out.println("Please input the second player name");
		  String player2 = sc.nextLine();
		  int gameended = 0;
		while (gameended == 0) {
			  System.out.println("Score:" + score1 + ":" + score2);
			  System.out.println("Please input the win player:");
			  winPlayer = sc.nextLine();
			  if (winPlayer.equals(player1)&& score1 < 30) {
			 	score1 += 15;
			  }
			  else if (winPlayer.equals(player2)&& score2 < 30) {
				  score2 += 15;
				  
			  }
			  else if (winPlayer.equals(player1)&& score1 == 30) {
				  score1 += 10;
			  }	
			  else if (winPlayer.equals(player2)&& score2 == 30) {
				  score2 += 10;
			  }
			  else if (winPlayer.equals(player1)&& score1 >= 40) {
				  score1 += 1;
				  
			  }
			  else if (winPlayer.equals(player2)&& score2 >= 40) {
				  score2 += 1;
			  }			
			  	

			  else{
				  System.out.println("Error input");
			  }
			  if (score1 == score2 + 2) {
				  System.out.println("Game ended: "+player1+" wins!");
				  gameended += 1;
			  }
			  if (score1 == score2 - 2) {
				  System.out.println("Game ended: "+player2+" wins!");
				  gameended += 1;
			  }
			  if (score1 == 41 && score2<40) {
				  System.out.println("Game ended: "+player1+" wins!");
				  gameended += 1;
			  }
			  if (score2 == 41 && score1 < 40) {
				  System.out.println("Game ended: "+player2+" wins!");
				  gameended += 1;
			  }
				  
	   	  
	  

}}}
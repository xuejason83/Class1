package tennis;

import java.util.Scanner;

public class tennis2 {
	String pointwinner;
	int scores[] = { 0, 15, 30, 40 };
	String playername;
	int arrayindex = 0;
	int score;

	boolean Winner(int otherplayerscore) {
		if (score > 40 && otherplayerscore <= score - 2) {
			System.out.println("Game ended:" + playername + " wins!");
			return true;
		}
		else{
			return false;
		}
		
	}

	void scoreupdate() {
		if (score < 40) {

			arrayindex++;
			score = scores[arrayindex];
		} else {
			score++;

		}
	}

	public static void main(String[] args) {
		tennis2 player1 = new tennis2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the first player name");
		player1.playername = sc.nextLine();

		tennis2 player2 = new tennis2();
		System.out.println("Please input the first player name");
		player2.playername = sc.nextLine();
		boolean ended = false;
		while (ended == false) {
			System.out.println("Please input the win player:");
			String Pointwinner = sc.nextLine();
			if (Pointwinner.equals(player1.playername)) {
				player1.scoreupdate();
				ended = player1.Winner(player2.score);
			}

			else if (Pointwinner.equals(player2.playername)) {
				player2.scoreupdate();
				ended = player2.Winner(player1.score);
			}

			else {
				System.out.println("Error input");
			}

			if (!ended) {
				System.out.println("Score:" + player1.score + ":" + player2.score);
			}

		}

	}
}
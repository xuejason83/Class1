import java.util.Scanner;

public class Tennis {
	String winner;
	int scores[] = { 0, 15, 30, 40 };
	String playername;
	int scoreindex = 0;
	int score;

	boolean Winner(int otherplayerscore) {
		if (score > 40 && otherplayerscore <= score - 2) {
			System.out.println(playername + " won!");
			return true;
		}
		else{
			return false;
		}
		
	}

	void updatescore() {
		if (score < 40) {
			scoreindex++;
			score = scores[scoreindex];
		} else {
			score++;
			}
	}
	public static void main(String[] args) {
		Tennis player1 = new Tennis();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the first player name");
		player1.playername = sc.nextLine();
		Tennis player2 = new Tennis();
		System.out.println("Please input the first player name");
		player2.playername = sc.nextLine();
		boolean end = false;
		while (end == false) {
			System.out.println("Please input the win player:");
			String winner = sc.nextLine();
			if (winner.equals(player1.playername)) {
				player1.updatescore();
				end = player1.Winner(player2.score);
			}
			else if (winner.equals(player2.playername)) {
				player2.updatescore();
				end = player2.Winner(player1.score);
			}
			else {
				System.out.println("Input error");
			}

			if (!end) {
				System.out.println("Score:" + player1.score + ":" + player2.score);
			}
		}
	}
}
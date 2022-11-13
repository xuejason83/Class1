package test;

import java.util.Scanner;

class tennisPlayer {
	String m_name;
	int m_score;
	int m_setScore;
	public tennisPlayer(String name) {
		m_name = name;
	}
	
	public int calcScore() {
		if (m_score < 30) {
			m_score += 15;

		} else if (m_score == 30) {
			m_score += 10;

		} else if (m_score >= 40) {
			m_score += 1;
			
		} else {
			System.out.println("Error input");
			
		}
		
		return m_score;
	}

	public static String checkWin(tennisPlayer p1, tennisPlayer p2) {
		String gameWinner = "";
		if (p1.m_score == (p2.m_score + 2)) {
			System.out.println("The game winner is " + p1.m_name + "!");
			gameWinner = p1.m_name;
		} 
		else if (p2.m_score == (p1.m_score + 2)) {
			System.out.println("The game winner is " + p2.m_name + "!");
			gameWinner = p2.m_name;
		}
		else if (p1.m_score == 41 && p2.m_score < 40) {
			System.out.println("The game winner is " + p1.m_name + "!");
			gameWinner = p1.m_name;
		}
		else if (p2.m_score == 41 && p1.m_score < 40) {
			System.out.println("The game winner is " + p2.m_name + "!");
			gameWinner = p2.m_name;
		}
		return gameWinner;
	}
	
	public int calcSetScore() {
		m_setScore++;
		return m_setScore;
	}
	
	public static boolean checkSetWin(tennisPlayer p1, tennisPlayer p2) {
		if (p1.m_setScore >= 6 && p1.m_setScore >= p2.m_setScore + 2) {
			System.out.println("The winner of the first set is " + p1.m_name + "!");
			return false;

		}else if (p2.m_setScore >= 6 && p2.m_setScore >= p1.m_setScore + 2) {
			System.out.println("The winner of the first set is " + p2.m_name + "!");
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String winPlayer;
		boolean check = true;
		boolean bigCheck = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first player's name");
		String player1 = sc.nextLine();
		System.out.println("Input second player's name");
		String player2 = sc.nextLine();
		System.out.println("Player 1: " + player1 + " Player 2 " + player2);
		
		tennisPlayer p1 = new tennisPlayer(player1);
		tennisPlayer p2 = new tennisPlayer(player2);
		while (bigCheck) {
			check = true;
			p1.m_score = 0;
			p2.m_score = 0;
			while (check) {
				System.out.println("Input player that won");
				winPlayer = sc.nextLine();
				if (winPlayer.equals(player1)) {
					p1.calcScore();
				
				} else if (winPlayer.equals(player2)) {
					p2.calcScore();
					
				} else {
					System.out.println("Error input");
				}
				
				System.out.println(p1.m_name + ": " + p1.m_score);
				System.out.println(p2.m_name + ": " + p2.m_score);
				
				String gameWinner = checkWin(p1, p2);
				if (gameWinner == p1.m_name) {
					check = false;
					p1.calcSetScore();	
				} else if (gameWinner == p2.m_name) {
					check = false;
					p2.calcSetScore();
				}
				
			}
			System.out.println("Set score " + p1.m_name + ": " + p1.m_setScore);
			System.out.println("Set score " + p2.m_name + ": " + p2.m_setScore);
			bigCheck = checkSetWin(p1, p2);
		}
	}
}

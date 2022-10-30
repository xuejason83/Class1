package test;

import java.util.Scanner;

class tennisPlayer {
	String m_name;
	int m_score;
	
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

	public static boolean checkWin(tennisPlayer p1, tennisPlayer p2) {
		boolean gameCheck = true;
		if (p1.m_score == (p2.m_score + 2)) {
			System.out.println("The winner is " + p1.m_name + "!");
			gameCheck = false;
			
		} 
		else if (p2.m_score == (p1.m_score + 2)) {
			System.out.println("The winner is " + p2.m_name + "!");
			gameCheck = false;
		}
		else if (p1.m_score == 41 && p2.m_score < 40) {
			System.out.println("The winner is " + p1.m_name + "!");
			gameCheck = false;
		}
		else if (p2.m_score == 41 && p1.m_score < 40) {
			System.out.println("The winner is " + p2.m_name + "!");
			gameCheck = false;
		}
		return gameCheck;
	}
	
	
	public static void main(String[] args) {
		String winPlayer;
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first player's name");
		String player1 = sc.nextLine();
		System.out.println("Input second player's name");
		String player2 = sc.nextLine();
		System.out.println("Player 1: " + player1 + " Player 2 " + player2);
		
		tennisPlayer p1 = new tennisPlayer(player1);
		tennisPlayer p2 = new tennisPlayer(player2);
		
		while (check) {
			System.out.println("Input player that won");
			winPlayer = sc.nextLine();
			if (winPlayer == player1) {
				p1.calcScore();
			
			} else if (winPlayer == player2) {
				p2.calcScore();
				
			} else {
				System.out.println("Error input");
			}
			
			System.out.println(p1.m_name + ": " + p1.m_score);
			System.out.println(p2.m_name + ": " + p2.m_score);
			
			check = checkWin(p1, p2);
		}
		
	}
}

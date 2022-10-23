package test;

import java.util.Scanner;

public class tennis {
	public static void main(String[] args) {
		int score1 = 0;
		int score2 = 0;
		boolean gameEnd = true;
		String winPlayer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first player's name");
		String player1 = sc.nextLine();
		System.out.println("Input second player's name");
		String player2 = sc.nextLine();
		System.out.println("Player 1: " + player1 + " Player 2 " + player2);
		while (gameEnd) {
			System.out.println(player1 + ": " + score1);
			System.out.println(player2 + ": " + score2);
			System.out.println("Input player that won");
			winPlayer = sc.nextLine();
			if (winPlayer.equals(player1) && score1 < 30) {
				score1 += 15;
				
			} else if (winPlayer.equals(player2) && score2 < 30) {
				score2 += 15;
				
			} else if (winPlayer.equals(player1) && score1 == 30) {
				score1 += 10;
			} else if (winPlayer.equals(player2) && score2 == 30) {
				score2 += 10;
			} else if (winPlayer.equals(player1) && score1 >= 40) {
				score1 += 1;
				
			} else if (winPlayer.equals(player2) && score2 >= 40) {
				score2 += 1;
			
			} else {
				System.out.println("Error input");
				
			}
			if (score1 == (score2 + 2)) {
				System.out.println("The winner is " + player1 + "!");
				gameEnd = false;
				
			} 
			if (score2 == (score1 + 2)) {
				System.out.println("The winner is " + player2 + "!");
				
			}
			if (score1 == 41 && score2 < 40) {
				System.out.println("The winner is " + player1 + "!");
				gameEnd = false;
			}
			if (score2 == 41 && score1 < 40) {
				System.out.println("The winner is " + player1 + "!");
				gameEnd = false;
			}
		}
		
	
	}
	
}

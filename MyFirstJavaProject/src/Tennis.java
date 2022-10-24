	import java.util.Scanner;
public class Tennis{
public static void main(String[]args) {

    String player1, player2 ;
    int player1Score = 0 , player2Score =0 ;
    int round = 1 ;
    int firstTwoRoundScore = 15 ;
    int scoreAfterThirdRound = 10 ;

    System.out.println("Please input player 1 name:");
    Scanner sc = new Scanner(System.in) ;
    player1 = sc.nextLine() ;

    System.out.println("Please input player 2 name:");
    player2 = sc.nextLine() ;

    while(true) {

        System.out.println(player1Score +  ":" +  player2Score);

        System.out.println("Who is the winner of round " + round++);
        String winner = sc.nextLine();

        if (winner.equals(player1)){

            if (player1Score < firstTwoRoundScore * 2 )
                player1Score += firstTwoRoundScore ;
            else
                player1Score += scoreAfterThirdRound ;

            if ( player1Score > 40 && player1Score-player2Score >= 20 ){
                break;
            }
        }
        else if(winner.equals(player2)) {

            if (player2Score < firstTwoRoundScore * 2 )
                player2Score += firstTwoRoundScore ;
            else
                player2Score += scoreAfterThirdRound ;

            if (  player2Score > 40 &&  player2Score-player1Score >= 20){
                break;
            }
        }
    }

    if (player1Score > player2Score){
        System.out.println(player1 +" wins!");
    }
    else if (player2Score > player1Score) {
        System.out.println(player2 + " wins!");
    }
    else {
        System.out.println(player1 + " tie with " + player2);

    System.out.println(player1 + " score:" + player1Score);
    System.out.println(player2 + " score:" + player2Score);
    System.out.println("GAME OVER");


}

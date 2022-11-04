package Tennis;

import java.util.Scanner;

public class The_tennis_game {

    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();

        System.out.println("Please input player 1 name:");
        Scanner sc = new Scanner(System.in) ;
        p1.name =  sc.nextLine() ;

        System.out.println("Please input player 2 name:");
        p2.name =  sc.nextLine() ;


        System.out.println("Player 1 is " +  p1.name  + ", player 2 is " + p2.name);

        p1.score();
        p2.score+=2 ;

        if (p1.score > p2.score){
            System.out.println(p1.name + " wins!");
        }
        else if(p1.score < p2.score){
            System.out.println(p2.name + " wins!");
        }
        else{
            System.out.println("Tie");
        }



    }



}


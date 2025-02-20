import java.util.*;

public class L4Q5 {
    public static void main(String[]aargs){
        Random r = new Random();
        int Player1,Player2,SumP1=0,SumP2=0;

        while(SumP1<100||SumP2<100){

            System.out.println("\nPlayer 1 score : " + SumP1);
            System.out.println("Player 2 score : " + SumP2);
            System.out.println();

            System.out.println("It's player 1 turns");
            Player1 = r.nextInt(1,7);
            SumP1 +=Player1;
            System.out.println("The number is " + Player1);

            while(Player1==6){
                System.out.println("You roll a 6. Second chance!!");
                Player1 = r.nextInt(1,7);
                SumP1 +=Player1;
                System.out.println("The number is " + Player1);
            }

            if(SumP1>100){
                System.out.println("\nThe sum is " + SumP1);
                System.out.println("Player 1 wins");
                break;
            }

            System.out.println("It's player 2 turns");
            Player2 = r.nextInt(1,7);
            SumP2 +=Player2;
            System.out.println("The number is " + Player2);

            while(Player2==6){
                System.out.println("You roll a 6. Second chance!!");
                Player2 = r.nextInt(1,7);
                SumP2 +=Player2;
                System.out.println("The number is " + Player2);
            }

            if(SumP2>100){
                System.out.println("\nThe sum is " + SumP2);
                System.out.println("Player 2 wins");
                break;
            }
        }
    }
}

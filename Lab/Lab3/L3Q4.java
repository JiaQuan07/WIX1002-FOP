import java.util.*;

public class L3Q4 {
    public static void main(String[]args){
        Random r = new Random();
        int dice_1a = r.nextInt(1,7);
        int dice_1b = r.nextInt(1,7);
        int dice_2a = r.nextInt(1,7);
        int dice_2b = r.nextInt(1,7);

        System.out.println("The number roll by player 1 is " + dice_1a + " " + dice_1b);
        System.out.println("The number roll by player 2 is " + dice_2a + " " + dice_2b);

        int sum1 = dice_1a + dice_1b;
        int sum2 = dice_2a + dice_2b;

        if(sum1 > sum2){
            System.out.println("Player 1 wins");
        }
        else{
            System.out.println("Player 2 wins");
        }
    }
}
import java.util.Random;

public class Game {
    private String name;
    private int sum=0;

    public Game (String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int move_sum(){
        Random r = new Random();
        int score = r.nextInt(7);
        sum = sum + score;
        System.out.println(name + " have roll a " + score + " ,and the sum is " + sum);
        return sum;
    }
}

public class Q5 {
    public static void main(String[]args){
        Game game1 = new Game("Player 1");
        Game game2 = new Game("Player 2");

        while(true){
            int score = game1.move_sum();
            if(score >= 100){
                System.out.println(game1.getName() + " Wins!!!!");
                break;
            }

            int score2 = game2.move_sum();
            if(score2 >= 100){
                System.out.println(game2.getName() + " Wins!!!!");
                break;
            }
            System.out.println();
        }
    }
}
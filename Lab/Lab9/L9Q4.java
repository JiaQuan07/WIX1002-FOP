//DiceGame.java
import java.util.Random;

public class DiceGame {
    private int score;
    private Random r;

    public DiceGame(){
        this.score = 0;
        this.r = new Random();
    }

    public int rollDice(){
        return r.nextInt(1,8);
    }

    public int getScore(){
        return score;
    }

    public void setScore(int score){
        this.score = score;
    }
}

//FirstDiceGame.java
public class FirstDiceGame extends DiceGame{

    public void RollDice(){
        int dice1 = super.rollDice();
        int dice2 = super.rollDice();
        System.out.println("Dice 1 : " + dice1 + "\nDice 2 : " + dice2);
        super.setScore(super.getScore()+dice1+dice2);
        System.out.println("You current score is : " + super.getScore()+ "\n");
        while(dice1 == dice2){
            System.out.println("You rolled the same number. Please rolled again");
            dice1 = super.rollDice();
            dice2 = super.rollDice();
            System.out.println("Dice 1 : " + dice1 + "\nDice 2 : " + dice2);
            super.setScore(super.getScore()+dice1+dice2);
            System.out.println("You current score is : " + super.getScore()+ "\n");
        }
    }

    public boolean won(){
        if(super.getScore()>100){
            return false;
        }
        else{
            return true;
        }
    }
}

//SecondDiceGame.java
//slightly change by our demo for the second dice game.
//Winning condition : reach 50 point exactly
//                  : dice can roll up to 7
//                  : if rolled 7 for three times, no score gained
//                  : if exceed 50 point, no score added.
public class SecondDiceGame extends DiceGame{

    boolean flag = true;

    public void RollDice(){
        int dice = super.rollDice();
        System.out.println("Dice : " + dice);
        if(super.getScore()+dice >50){
            System.out.println("You have exceed 50 point. No score added in this round");
        }
        else{
            super.setScore(super.getScore()+dice);
            System.out.println("You current score is : " + super.getScore()+ "\n");

            if(dice == 7){
                System.out.println("You roll a 7. Roll the dice again");
                dice = super.rollDice();
                System.out.println("Dice : " + dice);

                if(super.getScore()+dice >50 || dice == 7){
                    if(super.getScore()+dice >50){
                        System.out.println("You have exceed 50 point. No score added in this round");
                        System.out.println();
                    }
                    if(dice == 7){
                        super.setScore(super.getScore()+dice);
                        System.out.println("You have dice 7 in second attempt, dice is rolled again");
                        dice = super.rollDice();
                        System.out.println("Dice : " + dice);

                        if(super.getScore()+dice >50 || dice == 7){
                            if(super.getScore() + dice > 50){
                                System.out.println("You have exceed 50 point. No score added in this rolled");
                                System.out.println();
                                flag = false;
                            }
                            if(dice == 7 && flag == false){
                                super.setScore(super.getScore()+dice);
                                System.out.println("You have rolled 7 for three times. No score added for this round!");
                                super.setScore(super.getScore()-7-7);
                                System.out.println("You current score is : " + super.getScore()+ "\n");
                            }
                            else{

                                System.out.println("You have rolled 7 for three times. No score added for this round!");
                                super.setScore(super.getScore()-7-7-7);
                                System.out.println("You current score is : " + super.getScore()+ "\n");
                            }
                        }
                    }
                }
                if(super.getScore() + dice <=50 && dice < 7){
                    super.setScore(super.getScore()+dice);
                    System.out.println("You current score is : " + super.getScore()+ "\n");
                }
            }
        }

    }

    public boolean win(){
        if(super.getScore()==50){
            return false;
        }
        else{
            return true;
        }
    }
}

public class TesterDice {
    public static void main(String[]args){

        FirstDiceGame name1 = new FirstDiceGame();
        FirstDiceGame name2 = new FirstDiceGame();

        while(name1.won() && name2.won()){
            System.out.println("Player 1 turns ");
            name1.RollDice();
            if(name1.won() == false){
                System.out.println("Player 1 Wins!!!!");
                break;
            }
            System.out.println("Player 2 turns");
            name2.RollDice();
            if(name2.won() == false){
                System.out.println("Player 2 Wins!!!!");
                break;
            }
        }

        System.out.println();

        SecondDiceGame player1 = new SecondDiceGame();
        SecondDiceGame player2 = new SecondDiceGame();

        while(player1.win() && player2.win()){
            System.out.println("Player 1 turns");
            player1.RollDice();
            if(player1.win() == false){
                System.out.println("Player 1 wins!!!");
                break;
            }
            System.out.println("Player 2 turns");
            player2.RollDice();
            if(player2.win() == false){
                System.out.println("Player 2 wins!!!");
                break;
            }
        }
    }
}
import java.util.Scanner;

public class Q1 {
    public static void main(String[]args){

        Scanner scanner  = new Scanner(System.in);

        String [][] ticTacToe = new String [3][3];

        for(int i=0;i<ticTacToe.length;i++){
            for(int j=0;j<ticTacToe.length;j++){
                ticTacToe [i][j] = "." ;
            }
        }

        labelNameX:
        while(true){

            boolean winner = false;
            boolean flag = true;


            //print the board
            for(int i=0;i<ticTacToe.length;i++){
                for(int j=0;j<ticTacToe.length;j++){
                    System.out.print(ticTacToe [i][j]);
                }
                System.out.println();
            }
            System.out.println("#");

            //player X
            System.out.println("It's player X turns");
            while(true){
                System.out.print("Enter the row : ");
                int row = scanner.nextInt();
                System.out.print("Enter the column : ");
                int column = scanner.nextInt();
                if(row < 4 && row > 0 && column < 4 && column > 0 && ticTacToe[row-1][column-1].equals(".")){
                    ticTacToe[row-1][column-1] = "X";
                    break;
                }
                else if(row < 4 && row > 0 && column < 4 && column > 0 && !(ticTacToe[row-1][column-1].equals("."))){
                    System.out.println("This position have been drawed");
                }
                else{
                    System.out.println("You entered an unexisting row or column");
                }
            }
            for (int i = 0; i < 3; i++) {
                if ((ticTacToe[i][0].equals(ticTacToe[i][1]) && ticTacToe[i][1].equals(ticTacToe[i][2]) && ticTacToe[i][0].equals("X")) ||
                        (ticTacToe[0][i].equals(ticTacToe[1][i]) && ticTacToe[1][i].equals(ticTacToe[2][i]) && ticTacToe[0][i].equals("X")) ||
                        (ticTacToe[0][0].equals(ticTacToe[1][1]) && ticTacToe[1][1].equals(ticTacToe[2][2]) && ticTacToe[0][0].equals("X")) ||
                        (ticTacToe[0][2].equals(ticTacToe[1][1]) && ticTacToe[1][1].equals(ticTacToe[2][0]) && ticTacToe[2][0].equals("X"))
                ){
                    System.out.println("Winner : X");
                    winner  = true;
                    break labelNameX;
                }
            }

            System.out.println("It's player 0 turns");
            while(true){
                System.out.print("Enter the row : ");
                int row = scanner.nextInt();
                System.out.print("Enter the column : ");
                int column = scanner.nextInt();
                if(row < 4 && row > 0 && column < 4 && column > 0 && ticTacToe[row-1][column-1].equals(".")){
                    ticTacToe[row-1][column-1] = "O";
                    break;
                }
                else if(row < 4 && row > 0 && column < 4 && column > 0 && !(ticTacToe[row-1][column-1].equals("."))){
                    System.out.println("This position have been drawed");
                }
                else{
                    System.out.println("You entered an unexisting row or column");
                }
            }
            for (int j = 0; j < 3; j++) {
                if((ticTacToe[j][0].equals(ticTacToe[j][1]) && ticTacToe[j][1].equals(ticTacToe[j][2]) && ticTacToe[j][0].equals("O")) ||
                        (ticTacToe[0][j].equals(ticTacToe[1][j]) && ticTacToe[1][j].equals(ticTacToe[2][j]) && ticTacToe[0][j].equals("O")) ||
                        (ticTacToe[0][0].equals(ticTacToe[1][1]) && ticTacToe[1][1].equals(ticTacToe[2][2]) && ticTacToe[0][0].equals("O")) ||
                        (ticTacToe[0][2].equals(ticTacToe[1][1]) && ticTacToe[1][1].equals(ticTacToe[2][0]) && ticTacToe[2][0].equals("O"))
                ){
                    System.out.println("Winner : O");
                    winner = true;
                    break labelNameX;
                }
            }

            for(int i=0;i<ticTacToe.length;i++){
                for (int j = 0; j < 3; j++) {
                    if (ticTacToe[i][j].equals(".")) {
                        flag = false;
                    }
                }
            }

            if(flag == true){
                System.out.println("Winner : Draw");
                break labelNameX;
            }

        }

    }
}
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[]args){

        char [][] TicTacToe = new char[3][3];

        try{
            Scanner input = new Scanner(new FileInputStream("TicTacToe.txt"));

            int gameCounter = 1;
            while (input.hasNextLine()) {

                int counter = 0;
                while (counter < 3 && input.hasNextLine()) {
                    String line = input.nextLine();
                    for (int i = 0; i < 3; i++) {
                        TicTacToe[counter][i] = line.charAt(i);  // Fill the board
                    }
                    counter++;
                }

                System.out.println("Game " + gameCounter + ":");
                printBoard(TicTacToe);
                checkPlayerWin(TicTacToe);
                gameCounter++;

                if (input.hasNextLine()) {
                    input.nextLine();  // Skip the "#"
                }
            }
            input.close();

        }
        catch(IOException e){
            System.out.println("Error in reading the file");
        }
    }

    public static void checkPlayerWin(char [][] ticTacToe){
        boolean draw = false;
        for (int j = 0; j < 3; j++) {
            if((ticTacToe[j][0] == (ticTacToe[j][1]) && ticTacToe[j][1] == (ticTacToe[j][2]) && ticTacToe[j][0] == ('O')) ||
                    (ticTacToe[0][j] == (ticTacToe[1][j]) && ticTacToe[1][j] == (ticTacToe[2][j]) && ticTacToe[0][j] == ('O')) ||
                    (ticTacToe[0][0] == (ticTacToe[1][1]) && ticTacToe[1][1] == (ticTacToe[2][2]) && ticTacToe[0][0] == ('O')) ||
                    (ticTacToe[0][2] == (ticTacToe[1][1]) && ticTacToe[1][1] == (ticTacToe[2][0]) && ticTacToe[2][0] == ('O'))
            ){
                System.out.println("Winner : O");
                draw = true;
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            if ((ticTacToe[i][0] == (ticTacToe[i][1]) && ticTacToe[i][1] == (ticTacToe[i][2]) && ticTacToe[i][0] == ('X')) ||
                    (ticTacToe[0][i] == (ticTacToe[1][i]) && ticTacToe[1][i] == (ticTacToe[2][i]) && ticTacToe[0][i] == ('X')) ||
                    (ticTacToe[0][0] == (ticTacToe[1][1]) && ticTacToe[1][1] == (ticTacToe[2][2]) && ticTacToe[0][0] == ('X')) ||
                    (ticTacToe[0][2] == (ticTacToe[1][1]) && ticTacToe[1][1] == (ticTacToe[2][0]) && ticTacToe[2][0] == ('X'))
            ){
                System.out.println("Winner : X");
                draw = true;
                break;
            }
        }
        if(!draw){
            if(checkGameOngoing(ticTacToe)){
                System.out.println("Winner : None (on going)");
            }
            else{
                System.out.println("Winner : Draw");
            }
        }
        System.out.println();
    }

    public static void printBoard(char [][] ticTacToe){
        for(int i=0;i<ticTacToe.length;i++){
            for(int j=0;j<ticTacToe.length;j++){
                System.out.print(ticTacToe [i][j]);
            }
            System.out.println();
        }
    }

    public static boolean checkGameOngoing(char[][] ticTacToe) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (ticTacToe[i][j] == '.') {
                    return true;
                }
            }
        }
        return false;
    }
}
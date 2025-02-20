import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        String temp, winner = "";
        double max=0;
        try{

            Scanner input = new Scanner(new FileInputStream("Q4.txt"));

            while(input.hasNextLine()){
                String [] result = input.nextLine().split(",");

                for(int i=0;i<result.length;i++){
                    for(int j=1;j<result.length-1;j++){
                        if(Double.parseDouble(result[j]) > Double.parseDouble(result[j+1])){
                            temp = result[j];
                            result[j] = result[j+1];
                            result[j+1] = temp;
                        }
                    }
                }

                double sum = Double.parseDouble(result[2]) + Double.parseDouble(result[3]) + Double.parseDouble(result[4]);

                System.out.println(result[0] + " score " + sum);

                if(sum > max){
                    sum = max;
                    winner = result[0];
                }

            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Error");
        }

        System.out.println(winner + " is the winner");
    }
}

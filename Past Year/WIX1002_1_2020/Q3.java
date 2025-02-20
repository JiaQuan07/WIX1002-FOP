import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String []args){

        int [] frequency = new int [5];

        try{
            Scanner input = new Scanner(new FileInputStream("raw.txt"));
            while(input.hasNextInt()){
                int num = input.nextInt();
                if(num == 2){
                    frequency[0] ++;
                }
                if(num == 4){
                    frequency[1] ++;
                }
                if(num == 6){
                    frequency[2] ++;
                }
                if(num == 8){
                    frequency[3] ++;
                }
                if(num == 10){
                    frequency[4] ++;
                }
            }
        }
        catch(IOException e){
            System.out.println("Error");
        }

        int max=0,max2=0;
        for(int i=0;i<frequency.length;i++){
            if(frequency[i] > max){
                max = frequency[i];
                max2 = (i+1)*2;
            }
        }

        System.out.println("2 : " + frequency[0]);
        System.out.println("4 : " + frequency[1]);
        System.out.println("6 : " + frequency[2]);
        System.out.println("8 : " + frequency[3]);
        System.out.println("10 : " + frequency[4]);
        System.out.println("The mode of the dataset is : " + max2);
    }
}
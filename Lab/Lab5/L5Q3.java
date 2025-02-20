import java.util.Random;
import java.util.Scanner;

public class Lab5Q3 {
    public static void main(String[]args){
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of workers :");
        int N = scanner.nextInt();
        int workers [][] = new int [N][7];
        int sum[] = new int [N];
        int sumhour = 0;

        for(int i=0;i<N;i++){
            System.out.println("Employer " + (i+1) + " : ");
            System.out.print("Work hour for the week: ");
            for(int j=0;j<7;j++){
                workers[i][j] = r.nextInt(1,9);
                System.out.print(workers[i][j] + " ");
                sumhour += workers[i][j];
            }
            System.out.println("\nThe total hours of working for 7 days is : " + sumhour + " hours");
            System.out.println();
            sum[i] = sumhour;
            sumhour =0;
        }
    }
}
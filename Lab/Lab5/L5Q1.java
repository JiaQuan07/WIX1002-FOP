import java.util.Scanner;
import java.util.Random;

public class Lab5 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        Random r= new Random();
        double sum=0;int highest =0;int lowest = 101;
        System.out.print("Enter number of student: ");
        int N = scanner.nextInt();

        int score[] = new int[N];
        for(int i=0;i<N;i++){
            score[i] = r.nextInt(101);
            System.out.print(score[i] + " ");
            if(highest<score[i]){
                highest = score[i];
            }
            if(lowest>score[i]){
                lowest = score[i];
            }
            sum +=score[i];
        }

        double ave = sum/N;

        System.out.println(" ");
        System.out.println("The highest score: " + highest);
        System.out.println("The lowest score: " + lowest);
        System.out.println("The average score: " + ave);
    }
}
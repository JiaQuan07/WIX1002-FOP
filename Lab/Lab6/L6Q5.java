import java.util.Random;
import java.util.Scanner;

public class Lab6_Q5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int counter = 0;
        while(true){
            System.out.println("Enter negative number to quit");
            int a = r.nextInt(1,13);
            int b = r.nextInt(1,13);
            System.out.print(a + " x " + b + " = ");
            int c = scanner.nextInt();
            if(c <0){
                break;
            }
            if(CheckAnswer(a,b,c) == true){
                counter++;
            }
        }
        System.out.println("Your Score is " + counter);
    }

    public static boolean CheckAnswer(int num1,int num2, int num3){
        int multiple;
        multiple = num1*num2;
        return multiple == num3;
    }
}

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        Random r = new Random();
        int lastDigit = 0,AAA=0,AA=0,A=0;

        System.out.print("Enter N number: ");
        int N = scanner.nextInt();
        System.out.print("The random numbers are: ");
        for(int i=0;i<N;i++){
            int num = r.nextInt(50,151);
            System.out.print(num + " ");
            lastDigit = num%10;
            if(lastDigit<=3){
                AAA++;
            }
            else if(lastDigit<=6){
                AA++;
            }
            else if(lastDigit<=9){
                A++;
            }
        }
        System.out.println("\nGroup AAA : " + AAA);
        System.out.println("Group AA : " + AA);
        System.out.println("Group A : " + A);

    }
}
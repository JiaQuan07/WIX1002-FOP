import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[]args){

        String yesOrNot;
        Random  r = new Random();
        Scanner scanner = new Scanner(System.in);

        while(true){

            int number1 = r.nextInt(0,9);
            int number2 = r.nextInt(0,9);

            System.out.print("What is " + number1 + " + " + number2 + " ? " );
            int ans = scanner.nextInt();
            int compareAns = number1 + number2;
            System.out.print(number1 + " + " + number2 + " = " + ans + " is " );
            if(ans == compareAns){
                System.out.println("true");
            }
            else{
                System.out.println("false");
            }

            do{
                System.out.print("Do you want to try another question(y/n)?: ");
                yesOrNot = scanner.nextLine();
            }while(!(yesOrNot.equalsIgnoreCase("y") || yesOrNot.equalsIgnoreCase("n")));

            if(yesOrNot.equalsIgnoreCase("n")){
                break;
            }

            System.out.println();
        }

        System.out.println("Program ends");

    }
}
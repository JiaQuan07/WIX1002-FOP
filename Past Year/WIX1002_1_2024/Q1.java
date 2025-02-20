//Question 1(a)
import java.util.Scanner;

public class Q1a {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        int countZero=0, countPositive=0, countNegative=0;

        while(true){
            System.out.print("Enter a number(Press X to quit): ");
            String num = scanner.nextLine();

            if(num.equalsIgnoreCase("X")){
                break;
            }

            try{
                int number = Integer.parseInt(num);

                if(number<0){
                    countNegative++;
                }
                if(number>0){
                    countPositive++;
                }
                if(number == 0){
                    countZero++;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Please enter a number or character X only.");
            }
        }

        System.out.println("The number of positive number: " + countPositive);
        System.out.println("The number of negative number: " + countNegative);
        System.out.println("The number of zero number: " + countZero);

    }
}

//Question 1(b)
import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1b {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        double sum=0;
        try{
            System.out.print("Please enter a number: ");
            int num = scanner.nextInt();

            for(double i=1;i<=num;i++){
                sum +=1/i;
            }
        }
        catch(InputMismatchException e){
            System.out.println("Please enter number only");
        }

        System.out.printf("The total sum is: %.2f\n" , sum);

    }
}

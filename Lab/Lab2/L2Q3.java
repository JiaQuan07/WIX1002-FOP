import java.util.*;
public class L2Q3 {
    public static void main(String[] args) {
        Random r = new Random();
        double num1 = r.nextDouble(10,51);
        double num2 = r.nextDouble(10,51);
        double num3 = r.nextDouble(10,51);

        System.out.printf("The value of number 1 : %.2f",num1);
        System.out.printf("\nThe value of number 1 : %.2f",num2);
        System.out.printf("\nThe value of number 1 : %.2f",num3);

        double sum = num1 + num2 + num3;
        System.out.printf("\nThe sum of three number : %.2f",sum);
        double ave = sum/3;
        System.out.printf("\nThe average of three number : %.2f",ave);
        System.out.println("\n");
    }
}
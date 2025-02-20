import java.util.*;
public class L2Q1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter temperature in degree Fahrenheit: ");
        double F = obj.nextDouble();
        double C = (F-23)/1.8;
        System.out.printf("The temperature in degree Celcius is : %.2f ",C);
    }
}
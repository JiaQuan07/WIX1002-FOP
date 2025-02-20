import java.util.*;
public class L2Q2 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the price of the car: ");
        double P = obj.nextDouble();
        System.out.print("Enter the down payment of the car: ");
        double D = obj.nextDouble();
        System.out.print("Enter the interest rate in % of the car: ");
        double R = obj.nextDouble();
        System.out.print("Enter the loan duration in year of the car: ");
        double Y = obj.nextDouble();

        double M = (P-D)*(1+ R*Y/100) / (Y*12);
        System.out.printf("The monthly payment of the car is : %.5f\n",M);
    }
}
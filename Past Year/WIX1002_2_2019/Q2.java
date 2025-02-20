import java.util.Scanner;

public class Q2 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of bags sold : ");
        int num = scanner.nextInt();
        System.out.print("Enter the weight per bag (kilogram) : ");
        int unitWeight = scanner.nextInt();

        double totalPrice = (double)unitWeight * (double)num * 5.99;
        double totalPriceWithTax = totalPrice + totalPrice*0.0725;

        System.out.println();
        System.out.println("Price per kilogram :    $5.99");
        System.out.println("Sales tax :             7.25%");
        System.out.printf("Total price :           $%.2f\n", totalPriceWithTax);
    }
}
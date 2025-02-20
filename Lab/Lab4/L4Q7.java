import java.util.*;

public class L4Q7 {
    public static void main(String[]args){

        double Total=0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double Principal = obj.nextDouble();
        System.out.print("Enter interest in %: ");
        double interest = obj.nextDouble();
        System.out.print("Enter total number of month(s): ");
        double month = obj.nextDouble();

        System.out.printf("%-8s%-20s %-15s %-12s %-15s %-15s\n","Month","Monthly Payment","Principal","Interest","Unpaid Balance","Total Interest");
        for(int i=1;i<=month;i++){

            double Monthly_Payment = (Principal*(interest/(12*100)))/(1-Math.pow(1+(interest/(12*100)),-month));

            double Principal_due = Monthly_Payment * Math.pow((1+(interest/(12*100))),-(1+12-i));

            double Interest_due = Monthly_Payment - Principal_due;

            double Unpaid_Balance = Interest_due/(interest/(12*100)) - Principal_due ;

            Total += Interest_due;

            System.out.printf("%-8d%-20.2f %-15.2f %-15.2f%-15.2f%-15.2f\n",i , Monthly_Payment  , Principal_due  , Interest_due  , Unpaid_Balance  , Total);
        }
    }
}

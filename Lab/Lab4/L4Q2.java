import java.util.*;

public class L4Q2 {
    public static void main(String[]args){
        int sum = 0, finalsum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = obj.nextInt();
        for(int i=1;i<=n;i++){
            sum = sum + i;
            finalsum = finalsum + sum;
        }
        System.out.println("The final sum is " + finalsum );
    }
}
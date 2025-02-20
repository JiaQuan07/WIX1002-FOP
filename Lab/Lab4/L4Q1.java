import java.util.Scanner;

public class L4Q1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        double n = obj.nextInt();
        System.out.print("The factors are: ");
        for(int i=0;i<=n;i++){
            if((n/i)== (int)(n/i)){
                System.out.print(i + " ");
            }
        }
    }
}
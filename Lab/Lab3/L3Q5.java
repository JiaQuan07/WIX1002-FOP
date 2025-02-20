import java.util.*;

public class L3Q5 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        System.out.print("Enter the value of d: ");
        double d = scanner.nextDouble();

        System.out.print("Enter the value of e: ");
        double e = scanner.nextDouble();

        System.out.print("Enter the value of f: ");
        double f = scanner.nextDouble();

        double x = (e*d-b*f)/(a*d-b*c);
        double y=(a*f-e*c)/(a*d-b*c);

        if(a*d-b*c == 0){
            System.out.println("The equation has no solution");
        }
        else{
            System.out.println("The value of x is " + x + " and the value of y is " + y);
        }
    }
}
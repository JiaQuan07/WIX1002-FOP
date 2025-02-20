//QuadraticEquation.java
public class QuadraticEquation {

    private double a,b,c;

    public QuadraticEquation(){

    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA(){
        return a;
    }

    public double getB(){
        return b;
    }

    public double getC(){
        return c;
    }

    public double Discriminant(){
        return b*b - 4*a*c;
    }

    public double calcRoot1(){
        if(Discriminant() >= 0){
            return (-b+Math.sqrt(Discriminant()))/(2*a);
        }
        return 0;
    }

    public double calcRoot2(){
        if(Discriminant() >= 0){
            return (-b-Math.sqrt(Discriminant()))/(2*a);
        }
        return 0;
    }
}

//Main class
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter values of a,b and c : " );
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        QuadraticEquation x = new QuadraticEquation(a,b,c);

        System.out.println("The equation is : " + a + "x(^2) + (" + b + ")x + (" + c + ")");
        System.out.println("Discriminant : " + x.Discriminant());
        if(x.Discriminant() < 0){
            System.out.println("The equation has no roots");
        }
        else if(x.Discriminant() == 0){
            System.out.println("Same roots : " + x.calcRoot1());
        }
        else if(x.Discriminant() > 0){
            System.out.println("The roots : " + x.calcRoot1() + " and " + x.calcRoot2());
        }

    }
}


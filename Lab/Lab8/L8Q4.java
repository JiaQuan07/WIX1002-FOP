import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator;
    Scanner scanner = new Scanner(System.in);

    public void Input(){
        System.out.print("Enter value of numerator : ");
        numerator = scanner.nextInt();
        System.out.print("Enter value of denominator : ");
        denominator = scanner.nextInt();
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int dominator){
        this.denominator = dominator;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public int findGreatestCommonDivisor(int numerators, int denominators){
        int temp;
        while(denominators!=0){
            temp = denominators;
            denominators = numerators % denominators;
            numerators = temp;
        }
        return numerators;
    }

    public void display(){
        int gcd = findGreatestCommonDivisor(numerator, denominator);
        System.out.println("The fraction in the lowest term is: " + numerator/gcd + "/" + denominator/gcd);
    }
}

public class Q4 {
    public static void main(String[]args){
        Fraction fraction = new Fraction();
        fraction.Input();
        fraction.display();
    }
}
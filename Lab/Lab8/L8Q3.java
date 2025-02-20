import java.util.Scanner;

public class WeightCalculator {
    private int age;
    private double height;
    private double recommendWeight;
    Scanner scanner = new Scanner(System.in);

    public void Input(){
        System.out.print("Enter your age : " );
        age = scanner.nextInt();
        System.out.print("Enter your height : ");
        height = scanner.nextDouble();
        System.out.println("The age is " + age);
        System.out.println("The height is " + height);
    }

    public void recommendWeight(){
        recommendWeight = (height - 100 + age / 10)*0.9;
        System.out.println("The recommendWeight is " + recommendWeight);
    }
}

public class Q3 {
    public static void main(String []args){
        WeightCalculator calculator = new WeightCalculator();
        calculator.Input();
        calculator.recommendWeight();
    }
}
import java.util.*;

public class Lab3 {
    public static void main(String[] args) {
        double ans;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter first integer number : ");
        int num1 = obj.nextInt();
        System.out.print("Enter second integer number : ");
        int num2 = obj.nextInt();

        System.out.print("Enter the operand: ");
        String operand = obj.next();

        switch(operand){
            case "+":
                ans = num1 + num2;
                System.out.println(num1 + " " + operand.charAt(0) + " " + num2 + " = " + ans);
                break;
            case "-":
                ans = num1 - num2;
                System.out.println(num1 + " " + operand.charAt(0) + " " + num2 + " = " + ans);
                break;
            case "*":
                ans = num1 * num2;
                System.out.println(num1 + " " + operand.charAt(0) + " " + num2 + " = " + ans);
                break;
            case "/":
                double ans2 = (double)num1 / num2;
                System.out.println(num1 + " " + operand.charAt(0) + " " + num2 + " = " + ans2);
                break;
            case "%":
                ans = num1 % num2;
                System.out.println(num1 + " " + operand.charAt(0) + " " + num2 + " = " + ans);
                break;
        }
    }
}
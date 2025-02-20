import java.util.*;

public class L3Q3 {
    public static void main(String[]args){
        double commision =0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter the sales volume: ");
        int sales = obj.nextInt();
        if(sales<=100){
            commision = sales *0.05;
        }
        else if(sales<=500){
            commision = sales *0.075;
        }
        else if(sales<=1000){
            commision = sales *0.1;
        }
        else if(sales>1000){
            commision = sales *0.125;
        }
        System.out.printf("The commision is %.2f\n", commision);
    }
}
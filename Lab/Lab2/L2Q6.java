import java.util.*;
public class L2Q6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter amount of water in gram: ");
        int water = obj.nextInt();
        double M = (double)water/1000;
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initial = obj.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double Final_T = obj.nextDouble();
        double initial_T = (initial-23)/1.8;
        double final_T = (Final_T-23)/1.8;

        double Q =M*(final_T-initial_T)*4184;
        System.out.printf("The energy needed is %e\n", Q);
    }
}
import java.util.*;
public class L2Q5 {
    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        int num = r.nextInt(0,10001);
        System.out.println("The random number is : " + num);
        while(num>0){
            int temp = num%10;
            sum = sum + temp;
            num = num/10;
        }
        System.out.println("The sum of all digit in the number is : " + sum);
    }
}
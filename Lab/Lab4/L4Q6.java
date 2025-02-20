import java.util.*;

public class L4Q6 {
    public static void main(String[]args){
        Random r = new Random();
        int num = r.nextInt(0,2147483647);
        System.out.println("The number is "+ num);
        System.out.println("The digit of the number is " + String.valueOf(num).length());
    }
}

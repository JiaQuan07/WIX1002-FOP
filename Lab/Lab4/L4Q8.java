import java.util.*;

public class L4Q8 {
    public static void main(String[]args){
        int counter=0, integer = 2;
        Random r = new Random();
        int num = r.nextInt(101);

        while (counter < num) {
            boolean condition = true;

            for (int i = 2; i <= Math.sqrt(integer); i++) {
                if (integer % i == 0) {
                    condition = false;
                    break;
                }
            }

            if (condition) {
                System.out.print(integer + " ");
                counter++;
            }
            integer++;
        }

        System.out.println();
    }
}
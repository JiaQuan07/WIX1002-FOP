import java.util.Random;

public class Main {
    public static void main(String[]args){

        Random r = new Random();
        int sum=0;
        int reverse=0;

        int num = r.nextInt(1001);
        System.out.println("Generated Number : " + num);
        while(num>0){
            reverse = reverse*10 + num%10;
            sum = sum + num%10;
            num = num/10;
        }
        System.out.println("Number in reverse order : " + reverse);
        System.out.println("The sum of all integers : " + sum);
    }
}

import java.util.Random;

public class Main {
    public static void main(String[]args){
        System.out.println("This program shows the number of add and even number from 10 random numbers. The random numbers must be from 0 - 100");
        int num, odd = 0, even = 0;
        Random r = new Random();
        for(int i=1;i<=10;i++){
            num = r.nextInt(101);
            System.out.print(num + " ");
            if(isEven(num)){
                ++odd;
            }
            else{
                ++even;
            }
        }
        System.out.println("\nNumber of odd number: " + odd);
        System.out.println("Number of even number: " + even);

    }

    public static boolean isEven(int a){
        if(a %2 ==0){
            return false;
        }
        else{
            return true;
        }
    }

}
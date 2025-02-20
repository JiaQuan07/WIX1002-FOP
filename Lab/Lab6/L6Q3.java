import java.util.Scanner;

public class Lab6_Q3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num [] = new int [10];
        System.out.print("Enter 10 integer number : ");
        for(int i=0;i<num.length;i++){
            num[i] = scanner.nextInt();
        }
        ReverseArray(num);
    }

    public static void ReverseArray(int num[]){
        int reversed,digit;
        for(int j=0;j<num.length;j++){
            reversed = 0;
            while(num[j] !=0){
                digit = num[j]%10;
                num[j] /=10;
                reversed = reversed*10 + digit;
            }
            num[j] = reversed;
        }

        for(int i=num.length-1;i>=0;i--){
            System.out.print(num[i]+" ");
        }
    }
}
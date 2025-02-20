import java.util.Arrays;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;

public class Lab5Q5 {
    public static void main(String[]args){

        Random r = new Random();
        Integer [] num  = new Integer [20];
        Scanner scanner = new Scanner (System.in);

        System.out.println("A list of 20 random integer within 0 to 100");
        for(int i=0;i<num.length;i++){
            num[i] = r.nextInt(101);
            if(i == num.length-1){
                System.out.print(num[i]);
            }
            else{
                System.out.print(num[i] + ", ");
            }
        }

        Arrays.sort(num,Collections.reverseOrder());

        System.out.println("\nArray in descending order ");
        for(int j=0;j<num.length;j++){
            if(j == num.length-1){
                System.out.print(num[j]);
            }
            else{
                System.out.print(num[j] + ", ");
            }
        }

        System.out.print("\nEnter a number to search: ");
        int number = scanner.nextInt();

        int counter=0;
        boolean flag2=false;
        for(int m=0;m<num.length;m++){
            if(num[m]==number){
                System.out.println(number + " Found");
                flag2=true;
                break;
            }
            else {
                counter++;
            }
        }
        if(flag2){
            System.out.println("Linary Search - " + counter + " loop(s)");
        }
        else{
            System.out.println("Not found");
        }


        int low = 0,high = num.length-1;
        int middle, times=0;
        boolean flag =false;
        while(low<=high){
            middle = (low+high)/2;
            times++;
            if (num[middle] == number) {
                System.out.println(number + " Found");
                flag = true;
                break;
            } else if (num[middle] < number) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        if(flag){
            System.out.println("Binary Search - " + times + " loop(s)");
        }
        else{
            System.out.println("Not found");
        }
    }
}
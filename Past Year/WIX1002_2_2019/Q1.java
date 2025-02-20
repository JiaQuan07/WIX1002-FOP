//Filename: Q1.java
//The purpose of this program is to count and display the total number of even integers in the array.
//Another purpose is to find the biggest integer in the array and display it
//The output based on the given list, should be as below.
//The number of even integer is 3
//The biggest integer is 74
package Q1;

import java.util.Scanner;

public class Q1 {
    public static void main(String[]args){
        int [] num = {66,15,20,27,74,33};
        int cnt = 0;
        for(int k=0;k<num.length;k++){
            if(isEven(k)){
                cnt++;
            }
        }
        System.out.println("The number of even integer is " + cnt);
        System.out.println("The biggest integer is " + findMax(num));

    }

    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static int findMax(int [] a){
        int max = a[0];
        for(int n=0;n<a.length;n++){
            if(a[n]>max){
                max = a[n];
            }
        }
        return max;
    }
}//end class

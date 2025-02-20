import java.util.Scanner;

public class Lab6_Q2 {
    public static void main(String[]args){

        //print the triangle
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter number of size of the triangle : ");
        int n = obj.nextInt();
        for(int i=1;i<=n;i++){
            multiPrint(i,'*');
        }

        //print the diamond
        System.out.print("Enter size of the diamond : ");
        int m = obj.nextInt();
        // Print the top half of the diamond
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            multiPrint(i * 2 - 1, '*');
        }
        // Print the bottom half of the diamond
        for (int i = m - 1; i >= 1; i--) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }
            multiPrint(i * 2 - 1, '*');
        }
    }

    public static void multiPrint(int n, char c){
        for(int i=0;i<n;i++){
            System.out.print(c);
        }
        System.out.println();
    }
}
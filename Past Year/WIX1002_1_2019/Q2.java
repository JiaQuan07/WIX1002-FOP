import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N : ");
        int N = scanner.nextInt();

        int A[][] = generateMatrix(N);
        int B[][] = generateMatrix(N);

        System.out.println("Matrix A");
        displayMatrix(A);
        System.out.println("Matrix B");
        displayMatrix(B);

        System.out.println("Matrix A + B");
        addMatrix(A,B);

        System.out.println("Matrix A X B ");
        multiplyMatrix(A,B);

    }

    public static int[][] generateMatrix(int N){
        Random r = new Random();
        int matrix[][] = new int [N][N];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j] = r.nextInt(10);
            }
        }
        return matrix;
    }

    public static void displayMatrix(int [][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void addMatrix(int [][]A, int [][]B){
        int [][] ans = new int [A.length][A.length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                ans[i][j] = A[i][j] + B[i][j];
                System.out.print(ans [i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiplyMatrix(int [][]A, int [][]B){
        int ans [][] = new int [A.length][B.length];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                for(int k=0;k<ans[i].length;k++){
                    ans [i][j] = ans [i][j] + (A[i][k]*B[k][j]);
                }
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

}
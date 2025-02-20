import java.util.Scanner;

public class Lab5Q6 {
    public static void main(String[]args){
        Scanner scanner =  new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int number = scanner.nextInt();
        System.out.println("The Pascal Triangle with " + number + " row(s)");
        int[][] pascalMatrix = new int[number][number];
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == number) {
                    pascalMatrix[i][j] = 1;
                }
                else {
                    pascalMatrix[i][j] = pascalMatrix[i - 1][j - 1] + pascalMatrix[i - 1][j];
                }
            }
        }

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {

                if (pascalMatrix[i][j] != 0) {
                    System.out.print(pascalMatrix[i][j] + "\t");
                } else {
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }
}
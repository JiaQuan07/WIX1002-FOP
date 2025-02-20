public class Lab5Q4 {
    public static void main(String []args){

        int matrix [][] = {{1,5,7},
                {3,6,9},
                {5,3,8} };

        for(int i=0;i<matrix.length;i++){
            for(int j =i+1;j<matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix [i][j] = matrix[j][i];
                matrix [j][i] = temp;
            }
        }

        for(int k = 0; k < matrix.length; k++) {
            int left = 0;
            int right = matrix[k].length - 1;
            while (left < right) {
                int temp = matrix[k][left];
                matrix[k][left] = matrix[k][right];
                matrix[k][right] = temp;

                left++;
                right--;
            }
        }

        for (int m = 0; m < matrix.length; m++) {
            for (int n = 0; n < matrix[m].length; n++) {
                System.out.print(matrix[m][n] + " ");
            }
            System.out.println();
        }
    }
}
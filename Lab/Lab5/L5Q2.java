import java.util.Random;

public class Lab5Q2 {
    public static void main(String[]args){

        Random r = new Random();
        int num [] = new int [10];

        for (int i = 0; i < 10; i++) {
            boolean isDuplicate;

            do {
                isDuplicate = false;

                num[i] = r.nextInt(21);

                for (int j = 0; j < i; j++) {
                    if (num[j] == num[i]) {
                        isDuplicate = true;
                        break;
                    }
                }

            } while (isDuplicate);
        }

        for(int k =0;k<10;k++){
            System.out.print(num[k] + " ");
        }
    }
}
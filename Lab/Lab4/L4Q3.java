import java.util.*;

public class L4Q3 {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);

        int n=0,sum=0,min=Integer.MAX_VALUE,max=-1,counter=0,square_num=0;

        while(n>=0){
            System.out.print("Enter a score [negative score to quit]:");
            n = obj.nextInt();

            if(n<0){
                break;
            }

            sum += n;
            counter ++;
            square_num +=n*n;
            if(min>n){
                min = n;
            }
            if(max<n){
                max = n;
            }

        }
        double s =Math.sqrt((square_num-((sum*sum)/counter))/(counter-1));
        System.out.println("Minumum Score: " + min);
        System.out.println("Maximum Score: " + max);
        System.out.println("Average Score: " + (double)(sum/counter));
        System.out.printf("Standard Deviation: %.2f\n",s);
    }
}

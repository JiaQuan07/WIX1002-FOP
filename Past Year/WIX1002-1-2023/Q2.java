import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        int numOfStudent =0, numOfSubject=0, mark =0, sum=0,ave =0;

        while(true){
            System.out.print("Enter the number of student : ");
            numOfStudent = scanner.nextInt();
            if(numOfStudent<0||numOfStudent>10){
                System.out.print("Error !!! ");
            }
            else{
                break;
            }
        }

        int [][] average = new int [numOfStudent][];
        int [] realaverage = new int [numOfStudent];
        int temp=1;
        while(true){
            for(int i=1;i<=numOfStudent;i++){
                System.out.print("Enter the number of subject for student " + i + " : ");
                numOfSubject = scanner.nextInt();
                average[i-1] = new int [numOfSubject];
                for(int j=temp;j<=numOfSubject;j++){
                    System.out.print("Student (" + i + ") Enter mark for Subject " + j + " : ");
                    mark = scanner.nextInt();
                    if(mark<0||mark>100){
                        System.out.print("Error !!! ");
                        j=j-1;
                        continue;
                    }
                    average [i-1][j-1] = mark;
                }
            }
            break;
        }

        System.out.println("List of Students (" + numOfStudent + " students)");
        for(int i=1;i<=average.length;i++){
            sum =0;
            System.out.println("Student " + i);
            for(int j=1;j<=average[i-1].length;j++){
                System.out.println(" Subject " + j + " : " + average[i-1][j-1]);
                sum += average[i-1][j-1];
            }
            ave = sum/average[i-1].length;
            realaverage[i-1] = ave;
            System.out.println("Average Marks: " + ave);
        }
        int max =0;
        for(int i=0;i<average.length;i++){
            if(max < realaverage[i]){
                max = realaverage[i];
                temp=i+1;
            }
        }
        System.out.println("Student " + temp + " has the highest average, with " + max + " marks");
    }
}
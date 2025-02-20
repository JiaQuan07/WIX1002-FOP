import java.util.Random;

public class Number {

    Random r = new Random();
    private int num;
    private int range;
    private int number[];

    public Number(){
        this.num = 10;
        this.range = 101;
        this.number = new int [num];
    }

    public Number(int num){
        this.num = num;
        this.number = new int [num];
    }

    public Number(int num, int range){
        this.num = num;
        this.range = range+1;
        this.number = new int [num];
    }

    public void generateNumberArray(){
        int counter=0;
        for(int i=0;i<num;i++){
            number [i] = r.nextInt(0,range);
            if(i<num-1){
                System.out.print(number[i] + ", ");
            }
            else{
                System.out.println(number[i]);
            }
            if(number[i] % 2 == 0){
                counter++;
            }
        }
        System.out.println("The number of even number is : " + counter);
    }

    public void findPrimeNumber(){
        int checkPrime = 0;
        System.out.print("The prime number is : " );
        for(int i=0;i<num;i++){
            boolean flag = true;
            for(int j=2;j<Math.sqrt(number[i]);j++){
                if(num%j == 0)
                    flag = false;
            }
            if(flag){
                System.out.print(number[i] + " ");
                checkPrime +=1;
            }
        }
        if(checkPrime == 0){
            System.out.print("No prime number");
        }
        System.out.println();
    }

    public void MaxAndMin(){
        int max = -1, min =Integer.MAX_VALUE; double sum=0;
        for(int i=0;i<num;i++){
            if(number[i] > max){
                max = number[i];
            }
            if(number [i] < min){
                min = number[i];
            }
            sum +=number[i];

        }
        double average = sum/num;
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
        System.out.println("The average number is " + average);
        boolean flag2=false;
        System.out.print("The square number is : ");
        for(int i=0;i<num;i++){
            if(Math.sqrt(number[i]) == Math.floor(number[i])){
                System.out.print(number[i]);
                flag2 = true;
            }
        }
        if(flag2 == false){
            System.out.println("There is no square number");
        }
    }
}

public class Q1 {
    public static void main(String[]args){
        Number a = new Number();
        Number b = new Number(5);
        Number c = new Number(4, 50);

        a.generateNumberArray();
        a.findPrimeNumber();
        a.MaxAndMin();
    }
}

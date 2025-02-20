public class Lab6_Q4 {
    public static void main(String[]args){
        Euclidean_Algorithm(12,6);
        Euclidean_Algorithm(24,8);
        Euclidean_Algorithm(200,625);
    }

    public static void Euclidean_Algorithm(int a,int b){
        while(b !=0){
            int r=a%b;
            a=b;
            b=r;
        }
        System.out.println("The greatest common divisor of two number is : " + a );
    }
}
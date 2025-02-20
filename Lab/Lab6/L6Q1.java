public class Lab6 {
    public static void main(String[] args) {
        TriangularNumber(20);
    }

    public static void TriangularNumber(int num){
        int triangular = 0;
        for(int i=1;i<=num;i++){
            triangular +=i;
            System.out.println("The triangular number " + i + " is : " + triangular);
        }
    }
}
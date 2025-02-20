public class Lab6_Q6 {
    public static void main(String[]args){
        int counter = 20;
        int[] prime = new int[1000];
        int found = 0;
        int num = 2;

        // Find the first `counter` primes and store them in the array
        while (found < 1000) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                prime[found] = num;
                found++;
            }
            num++;
        }

        //Print Palindromic Prime
        System.out.print("The Palindromic Prime is : ");
        DeterminePalindromicPrime(counter,prime);

        //print emirp
        System.out.print("\nThe emirp is : ");
        DetermineEmirp(counter,prime);
    }
    
    public static void DeterminePalindromicPrime(int count, int PalindromicPrime []){
        int counter = 0;
        for(int m=0;m<Integer.MAX_VALUE;m++){
            int reverse = 0,digit,temp = PalindromicPrime[m],temp2 = PalindromicPrime[m];
            //find the reverse prime
            while(temp2!=0){
                digit = temp2%10;
                temp2 /= 10;
                reverse = reverse*10 + digit;
            }
            //ensure reverse value is same as initial prime
            if(temp == reverse){
                System.out.print( temp + " ");
                counter++;
            }
            //count how many integer found already
            if(counter == count){
                break;
            }
        }
    }

    public static void DetermineEmirp(int count, int Emirp[]){
        int counter=0;
        for(int i=0;i<Emirp.length;i++){

            int digit,reverse=0;
            boolean flag = false;
            int temp = Emirp[i], temp2 = Emirp[i];
            //find the reversed number
            while(temp2!=0){
                digit = temp2%10;
                temp2 /= 10;
                reverse = reverse*10 + digit;
            }
            //ensure the number is not palindromic prime
            if(temp == reverse){
                flag=true;
            }
            //check the reverse number is prime number or not
            for(int j=2;j<Math.sqrt(reverse);j++){
                if(reverse%j==0){
                    flag = true;
                }
            }

            //count the number of prime found
            if(!flag){
                counter++;
                System.out.print(temp + " " );
            }

            if(counter == count){
                break;
            }

        }
    }
}
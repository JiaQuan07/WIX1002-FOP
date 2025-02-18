# Tutorial 6

## 1. Write statements for each of the following

### a. Define a static method that returns the maximum number from 3 integer parameters.
```java
public static int Maximum_Number(int num1, int num2, int num3){
    int max = 0;
    if(num1>num2 && num1>num3){
        max = num1;
    }
    else if(num2>num1 && num2>num3){
        max = num2;
    }
    if(num3>num2 && num3>num1){
        max = num3;
    }
    return max;
}
```

### b. Define a static method that that determine whether the given integer is a square number.
```java
public static void Identify_Square(int Integer){
    int identify = (int)Math.sqrt(Integer);
    if(identify*identify == Integer)
        System.out.println("The integer is a square number");
    else
        System.out.println("The integer is not a square number");
}
```

### c. Define a static method that use to compute combination function C(n,k). C(n,k) gives the number of different k-element subsets that can be found in a given set of n elements. C(n,k) = n! / (k! (n-k)!
```java
public static void C(int n, int k){
    int N=1,K=1,NK=1,answer;
    for(int i=1;i<=n;i++){
        N *=i;
    }
    for(int j=1;j<=k;j++){
        K *=j;
    }
    for(int a=1;a<=n-k;a++){
        NK *=a;
    }
    answer = N/(K*(NK));
    System.out.println("The number of different " + k + " element subset that can be found in a given set of " + n + " elements is : " + answer );
}
```

### d. Define a static method that used to determine whether the parameter is a pentagonal number. A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon. Pn = ½ n(3n -1)
```java
public static void IsPentagonal(int num){
        int n = 1+24*num;
        int squareroot =(int) Math.sqrt(n);
        boolean flag = squareroot*squareroot == n; 
        int m = (1 + squareroot) / 6; 
        boolean flag2 = (m * (3 * m - 1)) / 2 == num; 
        if(flag && flag2){
            System.out.println("It is pentagonal number");
        }
        else{
            System.out.println("It is not pentagonal number");
        }
    }
```

### e. Define a static method that displays the number of letters and the number of digits of a String parameter.
```java
public static void DetermineNumOfLetterAndDigit(String sentences){
        int NumOfLetter=0, NumOfDigit=0;
        for(int j=0;j<sentences.length();j++){
            for(char i='a';i<='z';i++){
                if(sentences.charAt(j) == i){
                    NumOfLetter++;
                }
            }
        }
        for(int m=0;m<sentences.length();m++){
            for(char n='A';n<='Z';n++){
                if(sentences.charAt(m) == n){
                    NumOfLetter++;
                }
            }
        }
        
        for(int k=0;k<sentences.length();k++){
            for(int i=0;i<=9;i++){
                if(sentences.charAt(k) == i){
                    NumOfDigit++;
                }
            }
        }
        System.out.println("The number of letter of the sentences is : " + NumOfLetter);
        System.out.println("The number of digit of the sentences is : " + NumOfDigit);
    }
```

### f. Define a static void method that generates 10 random numbers within 0 to 100 to the method’s parameter. The random numbers can be accessed by the main method.
```java
public static void main(String[]args){
    int num [] = new int[10];
    ArrayOfRandomNum(num);

    System.out.print("The random number is : ");
    for(int j =0;j<10;j++){
        System.out.print(num[j] + " ");
    }
}

public static void ArrayOfRandomNum(int[]num){
    Random r = new Random();
    for(int i =0;i<10;i++){
        num[i] = r.nextInt(0,101);
    }
}
```

### g. Define a static void method that returns the area and the circumference of a circle given the argument is radius. Area = πr2 and Circumference = 2 πr.
```java
public static void AreaAndCircumferencceOfCircle(double radius){
        double Area,Circumference;
        Area = Math.PI*radius*radius;
        Circumference = 2*Math.PI*radius;
        System.out.printf("The area of circle is %.2f\n" , Area);
        System.out.printf("The circumference of circle is %.2f\n" , Circumference);
    }
```

### h. Define a static method that generate random number within 0 – 10. The method will return the first random number that generate twice.
```java
public static void FirstRandomNumGenerateTwice(){
        Random r = new Random();
        HashSet <Integer> num = new HashSet<>();    
        while(true){
            int number = r.nextInt(11);
            System.out.print(number + " ");
            if(num.contains(number)){
                System.out.println("\nThe first number that repeated twice is : " + number);
                break;
            }
            else{
                num.add(number);
            }
        }    
    }
```

## 2. Write a program that consists of a method that can display three numbers in decreasing order.
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Tutorial6_Q9 {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        Integer num[]= new Integer[3];
        for(int i=0;i<3;i++){
            System.out.print("Please enter integer number " + i+1 + " : ");
            num[i] = obj.nextInt();
        }
        ThreeNumberInDescendingOrder(num);
    }
    
    public static void ThreeNumberInDescendingOrder(Integer num[]){
        Arrays.sort(num, Collections.reverseOrder());
        for (Integer num1 : num) {
            System.out.print(num1 + " ");
        }
    }
}
```

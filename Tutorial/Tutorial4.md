# Tutorial 4

## 1. Write statements for each of the following

### a. Find the largest integer n so that n3 is less than 2000.
```java
public class Q1a {
    public static void main(String[] args) {
        int m=0,n=0;
        while(n*n*n<2000){
            m=n;
            n++;
        }
        System.out.println("THe larget integer n so that n^3 is less than 2000 is " + m);
    } 
}
```

### b. Display the square number of the first twelve integers starting from 1.
```java
public class Q1b {
    public static void main(String[]args){
        for(int i = 1; i<=12;i++){
            System.out.println("The square number of " + i + " is " + i*i);
        }
    }
}
```

### c. Display a 4-by-5 matrix using random number within 0 to 100.
```java
import java.util.Scanner;

public class Q1c {
    public static void main(String[]args){
        Random r = new Random();
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                int n = r.nextInt(0,101);
                System.out.print(n + "\t");
            }
            System.out.println();
        }
    }
}
```
### d. Compute the sum of numbers from 1 to a given number.
```java
import java.util.Scanner;

public class Q1d {
    public static void main(String[]args){
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a random integer number : ");
        int n = scanner.nextInt();
        for(int i=0;i<=n;i++){
            sum +=i;
        }
        System.out.println("The sum is " + sum);
    }
}
```

### e. Compute the sum of the series: 1/25+2/24+3/23 ... + 25/1 in two decimal places.
```java
public class Q1e {
    public static void main(String[]args){
        double i=1,j=25;
        double sum=0;
        while(i<=25 && j>=1){
            sum +=(i/j);
            i++;
            j--;    
        }
        System.out.printf("The sum is %.2f\n",sum);
    }
}
```

## 2. Correct the error for the following statements.

### a.
```java
//error
for (x = 10; x > 0; x++)
    sum += x;

//corrected
for (x = 10; x > 0; x--)
    sum += x;
```

### b.
```java
//error 
do
    x += 2;
    y += x;
    System.out.println(x + " and " + y);
while (x < 100)
    
//corrected
do{
    x += 2;
    y += x;
    System.out.println(x + " and " + y);
    }while (x < 100)
```

### c.
```java
//error
for ( x==1, y==20; x < y, x++, y-=2);
    System.out.println(x & " " & y);
    
//corrected
int x,y;
for ( x=1, y=20; x < y; x++, y-=2);
    System.out.println(x + " " + y);
```

### d.
```java
//error 
i =1;
while(i<10) {   
    if (i==10)
        System.out.println("Program End");
}

//corrected
int i = 1;
while(i<10) {
    i++;
    if (i==10)
        System.out.println("Program End");
    }
```
## 3. Write the statements that display the first ten values of the Fibonacci sequence. Given the formula f1 = 1, f2 =1, fn = fn-1 + fn-2.
```java
public class Q3 {
    public static void main(String[]args){
        int x=1,y=1,temp=1;
        System.out.print(temp);
        System.out.print(" " + temp);
        for(int i=0;i<8;i++){
            temp = x+y;
            x=y;
            y=temp;
            System.out.print(" " + temp);
        }
    }
}
```

## 4. Write the statements that display the string in reverse order. (use String.length() to get the length of the string)
```java
import java.util.Scanner;

public class Q4 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
```



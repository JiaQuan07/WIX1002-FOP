# Tutorial 3

## 1. Write statements for each of the following

### a. Determine whether 3x8=27.
```java
public class Test {
    public static void main(String[]args){
        int num = 3*8; boolean status;
        if(num == 27){
            status = false;
        }
        else{
            status = true;
        }
        System.out.println(status);
    }
}
```

### b. Determine whether an input integer is an odd number or even number.
```java
import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        if(num %2 == 0 ){
            System.out.println("The number is an even number");
        }
        else {
            System.out.println("The number is an odd number");
        }
    }
}
```

### c. Determine whether a character is a capital letter.
```java
import java.util.Scanner;

public class Test {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        char character = obj.next().charAt(0);
        if (character >='A' && character<='Z'){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
```
### d. Display two strings in alphabetical order ignoring their case.
```java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first strings");
        String one = obj.nextLine();
        System.out.println("Enter second strings");
        String second = obj.nextLine();

        int compare = one.compareToIgnoreCase(second);
        if (compare>0){
            System.out.println(second + "\n" + one);
        }
        else{
            System.out.println(one + "\n" + second);
        }

    }
}
```

### e. A switch statement that display Sunday, Monday, ..., Saturday if the input is 0, 1, ..., 6.
```java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a number from 0 to 6");
        int num = obj.nextInt();
        
        switch(num){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;
            case 3: 
                System.out.println("Wednesday");
                break;
            case 4: 
                System.out.println("Thursday");
                break;
            case 5: 
                System.out.println("Friday");
                break;
            case 6: 
                System.out.println("Saturday");
                break;
            default: 
                System.out,println("Please enter number within 0 and 6");
        }
    }
}
```

## 2. Correct the error for the following statements.
### a.
```java
//error
if (num1 = num2)
    System.out.println("Number 1 is equal to number 2.");

//corrected
if (num1 == num2)
    System.out.println("Number 1 is equal to number 2.");
```

### b.
```java
//error
if (x > y > z)
    System.out.println("x is the largest number");

//corrected
if (x > y && x > z)
    System.out.println("x is the largest number");
```

### c.
```java
//error
String s1, s2;
if (s1==s2)
    System.out.println("They are equal strings.");
else (s1!=s2)
    System.out.println("They are not equal strings.");

//corrected
String s1, s2;
if (s1.equals(s2))
    System.out.println("They are equal strings.");
else 
    System.out.println("They are not equal strings.");
```

### d.
```java
//error
if x>0 or y>0;
    System.out.println("Either x or y is positive");

//corrected
if (x >0 || y >0);
    System.out.println("Either x or y is positive");
```

## 3. Write the output for the following statements when x=9 and y=10
### a.
```java
if (x < 10)
    if (y > 10)
        System.out.println("*****");
    else
        System.out.println("#####");
    System.out.println("$$$$$");
```
```declarative
#####
$$$$$
```

### b.
```java
if (x < 10) {
    if (y < 10)
        System.out.println("*****");
    else{
        System.out.println("#####");
        System.out.println("$$$$$");
    }
}
```
```declarative
#####
$$$$$
```

### c.
```java
if (x < 10) {
    if (y < 10)
        System.out.println("*****");
    System.out.println("#####");
    }
    else {
        System.out.println("$$$$$");
    }
```
```declarative
#####
```

### d.
```java
if (x > 10) {
    if (y > 10) {
        System.out.println("*****");
        System.out.println("#####"); 
    }
    else
        System.out.println("$$$$$");
    }
```
```declarative
//No output
```

## 4. Write the java statements that used the if statement to find the biggest number among three given integers.
```java
public class T3Q4 {
    public static void main(String[]args){
        int num1 = 1, num2 = 2, num3 = 3;
            if(num1 > num2 && num1 > num3){
                System.out.println("Number 1 is the biggest number");
            }
            else if(num2 > num1 && num2 > num3){
                System.out.println("Number 2 is the largest number");
            }
            else{
                System.out.println("Number 3 is the largest number");
            }
    }
}
```

## 5. Write the java statements that determine whether the Leap year. A Leap year is divisible by 4 but not by 100. However, a Leap year is also divisible by 400.
```java
import java.util.Scanner;

public class T3Q5 {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter a year");
        int year = obj.nextInt();
        
        if( year%4 == 0 && year%100 != 0 || year%400 == 0){
            System.out.println("The year is a leap year");
        }
        else{
            System.out.println("The year is not a leap year");
        }
    }
}
```

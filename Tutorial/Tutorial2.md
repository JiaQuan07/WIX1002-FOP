# Tutorial 2

## 1. Display the sentence Faculty of Computer Science and Information Technology.

### a. In one line using multiple Java statements

```java
System.out.print("Faculty");
System.out.print(" of");
System.out.print(" Computer");
System.out.print(" Science");
System.out.print(" and");
System.out.print(" Information");
System.out.print(" Technology.");
```

### b. In multiple lines using one Java statement

```java
System.out.print("Faculty \nof \nComputer \nScience \nand \nInformation \nTechnology");
```

## 2. Write a Java statement that print "SDN" - Software-defined networking

```java
System.out.print("\"SDN\" - Software-defined networking”);
```

## 3. Correct the error for the following statements.

### a. System.Println("Java Programming");
```java
System.out.println("Java Programming");
```
### b. System.in.println("Introduction to Java!")
```java
System.out.println("Introduction to Java!");
```
### c. System.out.println("\t is the horizontal tab character");
```java
System.out.println("\\t is the horizontal tab character");
```
### d. system.out.println("Java is case sensitive!" );
```java
System.out.println("Java is case sensitive!");
```
## 4. Write statements for each of the following

### a. Declare a variable that used to store the value of a matric number.
```java
String matricNumber;
```

### b. Declare a variable that used to store the value of π.
```java
final double pi = 3.142;
```

### c. Initialize a variable named M with the value set to false.
```java
boolean M = false;
```

### d. Initialize a variable named P with the value set to 8800000000.
```java
long P = 8800000000L;
```

### e. Initialize a variable named letter with the value set to U.
```java
char letter = 'U';
```

### f. Declare a constant variable named PRO. The value of the constant variable is Java.
```java
final String PRO = "Java";
```

## 5. Correct the error for the following statements.
### a.
```java
//error
final double AMOUNT = "32.5";
AMOUNT += 10;
System.out.println("The amount is " + AMOUNT);

//corrected
double AMOUNT = "32.5";
AMOUNT += 10;
System.out.println("The amount is " + AMOUNT);
```

### b.
```java
//error
string chapter = 'Summary';
System.out.println(chapter);

//corrected
string chapter = "Summary";
System.out.println(chapter);
```
### c.
```java
//error
int num;
++num++;
num1 = num;

//corrected
int num = 0;
num++;
int num1 = num;
```

### d.
```java
//error
int num = 3000;
System.out.printf("%4.2f\n", num);

//corrected
int num = 3000;
System.out.printf("%4d\n", num);
```
### e.
```java
//error 
String contact;
Scanner keyboard = new Scanner(System.out);
contact = keyboard.nextLine();

//corrected
String contact;
Scanner keyboard = new Scanner(System.in);
contact = keyboard.nextLine();
```

## 6. Write a java program that print the circumference of a circle. The input of the program is diameter. Display the result in three decimal places. (Note pi = Math.PI)
```java
import java.util.Scanner;
class circle{
  public static void main(String[]args){
    Scanner obj = new Scanner(System.in);	
    System.out.print("Enter diameter: ");
    double d = obj.nextDouble();
    double c = Math.PI * d;
    System.out.printf("The circumference of the circle is : %.3f\n", c);
  }
}
```

## 7. Write a java program that converts inches to meters. (Given 1 inch equals to 2.54 centimeters). Print the output in two decimal places.
```java
import java.util.Scanner;
class Meter{
  public static void main(String[]args){
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter value in inch: ");
    double inch = obj.nextDouble();
    double meter = inch * 2.54 / 100;
    System.out.printf("%.2f inches = %.2f meters ",inch,meter);
  }
}
```
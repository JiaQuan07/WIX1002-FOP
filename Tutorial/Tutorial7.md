# Tutorial 7

## 1. Write statements for each of the following

### a. Store ten random integers within 0 to 1000 to a text file name integer.txt.
```java
import java.util.*;
import Java.io.*;

try{
    PrintWriter text = new PrintWriter(new FileOutputStream("integer.txt"));
    Random r = new Random();
    for(int i=0;i<10;i++){
        int num = r.nextInt(0,1001);
        text.println(num);  
    }
    text.close();
} 
catch(IOException e){
    System.out.println("Error occur");
}
```
### b. Read from the text file generated in a. Display all the integer and the largest integer.
```java
import java.util.*;
import Java.io.*;

int highest = -1;
try{     
    Scanner input = new Scanner(new FileInputStream("integer.txt"));
    while(input.hasNextInt()){
        int number = input.nextInt(); 
        System.out.print(number + " ");
        if(highest < number){
            highest = number;
        }
    }
    input.close();
} 
catch(IOException e){
    System.out.println("Error occur");
} 
System.out.println("\nThe highest number is " + highest); 
```
### c. Store ten random integers within 0 to 1000 to a binary file name integer.dat.
```java
import java.util.*;
import Java.io.*;

try{
    ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("integer.dat")); 
    Random r= new Random();
    for(int i=0;i<10;i++){
        int number = r.nextInt(0,1001);
        output.writeInt(number);
    }
    output.close();
} 
catch(IOException e){  
    System.out.println("Error");
}
```
### d. Read from the binary file generated in a c. Display the all the integer and the average.
```java
import java.util.*;
import Java.io.*;

double sum =0,  count=0;
try{
    ObjectInputStream input = new ObjectInputStream(new FileInputStream("integer.dat"));
    while(true){
        try{
            int number = input.readInt();
            System.out.print(number + " ");
            sum +=number;
            count++;
        }
        catch(EOFException e){
            break;
        }
    }
} 
catch(IOException e){     
    System.out.println("Error twice occur");
} 
double average = sum /count;
System.out.println("\nThe average number of the integer is " + average);
```

## 2. Correct the error for the following statements.

### a. 
```java
//error
PrintWriter out = new PrintWriter(new FileOutputStream("d:\data\matrix.txt"));

//corrected
PrintWriter out = new PrintWriter(new FileOutputStream("d:/data/matrix.txt"));
```

### b.
```java
//error 
try {
    PrintWriter out = new PrintWriter(new FileOutputStream("data.txt"));
    out.close();
} 
catch (FileNotFoundException e) {
    System.out.println("Problem with file output");
}

//corrected
try {
    PrintWriter out = new PrintWriter(new FileOutputStream("data.txt")); out.close();
} 
catch (IOException e) {
    System.out.println("Problem with file output");
}
```

### c.
```java
//error
int num;
Scanner a = new Scanner(new FileInputStream("data.dat"));
num = a.readInt();
a.close();

//corrected
int num;
ObjectInputStream a = new ObjectInputStream(new FileInputStream("data.dat"));
num = a.readInt();
a.close();
```

### d.
```java
//error
ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("data.dat"));
o.print('A');
o.close();

//corrected
ObjectOutputStream o = new ObjectOutputStream (new FileOutputStream("data.dat"));
o.writeChar(‘A’);
o.close();
```

## 3. Write a program that convert a sentence into binary number (ASCII code 8 bit) and store it in a text file named data.txt. Then, read from the text file and display the sentence.
```java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String sentence = "Hello, World!";

        //Convert the sentence into binary and write to a file
        try {
            PrintWriter output = new PrintWriter(new FileOutputStream("data.txt"));
            for (int i = 0; i < sentence.length(); i++) {
                int asciiValue = sentence.charAt(i);
                String binaryString = String.format("%8s", Integer.toBinaryString(asciiValue)).replace(' ', '0');
                output.println(binaryString);
            }
            output.close();

        } catch (IOException e) {
            System.out.println("Error writing to file");
        }

        //Read from the file and convert binary back to the original sentence
        StringBuilder originalSentence = new StringBuilder();
        try {
            Scanner input = new Scanner(new FileInputStream("data.txt"));
            while (input.hasNextLine()) {
                String binaryString = input.nextLine();
                int asciiValue = Integer.parseInt(binaryString,2);
                char character = (char) asciiValue;
                originalSentence.append(character);
            }
            System.out.println("Original sentence: " + originalSentence.toString());
            input.close();

        } catch (IOException e) {
            System.out.println("Error reading from file");
        }
    }
}
```


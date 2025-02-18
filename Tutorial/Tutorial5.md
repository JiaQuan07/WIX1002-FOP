# Tutorial 5

## 1. Write statements for each of the following

### a. Declare an array that used to store 12 floating point numbers.
```java
double [] num = new double[12];
```

### b. Initialize an array that used to store the value of A to E.
```java
char arr [] = {'A', 'B', 'C', 'D', 'E'};
```

### c. Declare an array that used to store 100 students name.
```java
String name [] = new String [100];
```

### d. Declare an array for a table with 6 rows 2 columns that used to store integer value.
```java
int [][] num = new int[6][2];
```

### e. Initialize an array with the following value:
```java
int [][] num = {{6,9},{2,5},{4,6}};
```

### f. After initialize the array, modify the value of the above array to
```java
num [1][1] = 4;
num [2][0] = 3;
num [2][1] = 7;
```

### g. Display all the values of an array name contact in separate lines.
```java
for(int i=0;i<contact.length;i++){
    System.out.println(contact[i]);
}
```

## 2. Correct the error for the following statements.
### a.
```java
//error
String[] code = {'AAA', 'AAB', 'AAC', 'AAD'};

//corrected
String[] code = {"AAA", "AAB", "AAC", "AAD"};
```

### b.
```java
//error
int[] num = new num[10];
for(int k=0; k<=num.length(); k++)
    sum+=num;

//corrected
int[] num = new int[10];
int sum =0;
for(int k=0; k<num.length; k++)
    sum+=num[k];
```

### c.
```java
//error
int [][]t = new int[3][];
t[1][2] = 5;

//corrected
int [][]t = new int[3][];
t[1] = new int [5];
t[1][2] = 5;
```

### d.
```java
//error
int i=4;
int []score = new int[5];
score [1] = 78;
score[++i] = 100;

//corrected
int i=3;
int []score = new int[5];
score [1] = 78;
score[++i] = 100;
```

## 3. Determine the values of each element of array marks. Assume the array was declared as:
```java
int[] marks = new int[5];
int i = 0, j = 1;
marks[i] = 12;
marks[j] = marks[i] + 19;
marks[j-1] = marks[j] * marks [j];
marks[j*3] = marks[i+1];
marks[++j] = marks[i]%5;
marks[2*j] = marks[j-1];
```
```java
mark [] = {961, 31, 1, 31, 31}
```

## 4. Write the statements that display the number of occurrence of the word "the" (case sensitive) in a string array name sentence.
```java
import java.util.Scanner;

public class Tutorial5_Q4 {
    public static void main(String[] args) {
        
        Scanner scanner =  new Scanner (System.in);
        String sentences;
        int counter=0;
        System.out.print("Enter your sentence: ");
        sentences = scanner.nextLine();
        String sentence [] = sentences.split(" ");
        for(String word : sentence){
            if(word.equals("the")){
                counter++;
            }
        }
        System.out.println("The number of occurence of the word \"the\" is : " + counter);
        
    }  
}
```

## 5. Write the statements that display the string array name sentence in reverse order. Each string element must be displayed in reverse order as well.
```java
import java.util.Scanner;

public class Tutorial5_Q5 {
    public static void main(String[]args){
        
        Scanner scanner =  new Scanner (System.in);
        String sentences;
        
        System.out.print("Enter your sentence: ");
        sentences = scanner.nextLine();
        
        String sentence [] = sentences.split(" ");
        int j = sentence.length-1;
        String temp;
        for(int i=0;i<sentence.length/2;i++){
            temp = sentence [i];
            sentence [i] = sentence[j];
            sentence [j] = temp;
            j--;
        }
        
        for (int i = 0; i < sentence.length; i++) {
            char[] word = sentence[i].toCharArray(); 
            int left = 0;
            int right = word.length - 1;
            
            while (left < right) {
                char tempChar = word[left];
                word[left] = word[right];
                word[right] = tempChar;
                left++;
                right--;
            }

            sentence[i] = new String(word);
        }
        
        for(String order:sentence){
            System.out.print(order + " ");
        }

    }
}
```

## 6. Write the statements that generate 1 random integer within 0 – 255. Convert the number to binary and store the bit into an 8 bit array. Then, display the binary number.
```java
import java.util.Random;

public class Tutorial5_Q6 {
    public static void main(String[]args){
        Random r = new Random();
        int integer = r.nextInt(256);
        String binaryString = String.format("%8s", Integer.toBinaryString(integer)).replace(' ', '0');
        
        int[] binaryArray = new int[8];
        for (int i = 0; i < 8; i++) {
            binaryArray[i] = binaryString.charAt(i) - '0';
        }
        
        System.out.println("The random integer: " + integer);
        System.out.print("Binary representation: ");
        for (int j=0;j<binaryArray.length;j++ ) {
            System.out.print(binaryArray[j]);
        }
        
    }
}
```
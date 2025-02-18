# Tutorial 8

## 1. Write statements for each of the following

### a. Define a class Student.
```java
public class Student{
    
}
```
### b. Declare the instance variable that used to store contact number.
```java
private String contactNumber;
```
### c. Create the constructor that initializes the contact number to null.
```java
public Student(){
    contactNumber = null;
}
```
### d. Create another constructor that assign the parameter value to the contact number.
```java
public Student(String n){
    this.contactNumber = n;
}
```
### e. Create an accessor and mutator method for the contact number.
```java
public void setContactNumber(String contact_number){
    this.contactNumber = contact_number;
}
public String getContactNumber (){
    return contactNumber;
}
```
### f. Create a method that used to display the contact number.
```java
public void printNumber(){
    System.out.println(contact_number); 
}
```
### g. Create an object of the class Student.
```java
Student student = new Student();
```
### h. Change the contact number using the mutator method.
```java
student.setcontact_number(“123-234-345”);
```
### i. Create an object of the class Animal.
````java
Animal animal = new Animal();
````
### j. Create an object of the class Animal that used to represent a cat.
```java
Animal cat = new Animal();
```
### k. Create an object of the class Number with the value 20 and 40.
```java
Number number1 = new Number(20);
Number number2= new Number(40);
```

## 2. Write statements for each of the following

### a. Define a class Digit.
```java
public class Digit(){
    
}
```
### b. Declare the instance variable that used to store a number.
```java
private int number;
```
### c. Create a constructor that assign the parameter value to the number.
```java
public Digit(int num){
    this.number = num;
}
```
### d. Create a digitMultiplication method that returns the multiplication of the number. If the number is 1345, the method will return 60.
```java
public int digitMultiplication() {
    int product = 1;
    int num = this.number;
    
    while (num > 0) {
        product *= num % 10;  
        num /= 10;  
    }
    return product;
}
```
### e. Create a method that used to display the digit multiplication of the number.
```java
public void display() {
    System.out.println("Digit multiplication result: " + digitMultiplication());
}
```
### f. Create a tester class that displays the digit multiplication of 4567.
```java
public class Tester {
    public static void main(String[]args){
        Digit digit = new Digit(4567);
        digit.display();
    }
}
```

## 3. Create a class that used to represent the 2 dimension coordinate system. The class consists of constructors, instance variables, accessor and mutator method and an output method that display the x-coordinate and y-coordinate.
```java
public class CoordinateSystem {
    private int x;
    private int y;
    
    public CoordinateSystem(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void display(){
        System.out.println("The x-coordinate is " + x);
        System.out.println("The y-coordinate is " + y);
    }
}
```

## 4. Create a class Payment that accept different type of payment methods such as cash payment, cheque payment and credit card payment. For cash payment, the class accepts the amount in cash; for cheque payment, the class accepts the amount and the cheque number; for credit card payment, the class accepts the amount, card holder name, cardType, expiration date and validation code. Use the same method name for the payment.
```java
//may create multiple class for each payment by using extends 
public class Payment {
    
    public void makePayment(double amount) {
        System.out.println("Cash Payment of $" + amount + " received.");
    }
    
    public void makePayment(double amount, String chequeNumber) {
        System.out.println("Cheque Payment of $" + amount + " received. Cheque Number: " + chequeNumber);
    }
    
    public void makePayment(double amount, String cardHolderName, String cardType, String expirationDate, String validationCode) {
        System.out.println("Credit Card Payment of " + amount + " received.");
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card Type: " + cardType);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Validation Code: " + validationCode);
    }
}
```

## 5. Create a class Connection. The Connection class keeps track of the number of connections to the server. Whenever an object is created, a connection is established. The class has a disconnect method and a display method that display the number of connections to the server.
```java
public class Connection {
    private static int connectionCount = 0;

    public Connection() {
        connectionCount++;  
    }

    public void disconnect() {
        if (connectionCount > 0) {
            connectionCount--;  
        } else {
            System.out.println("No active connections to disconnect.");
        }
    }

    public void display() {
        System.out.println("Current number of active connections: " + connectionCount);
    }
}
```
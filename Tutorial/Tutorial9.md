# Tutorial 9

## 1. Write statements for each of the following
### a. Write a static method compare that return true if two objects parameter (Student s, Teacher t) are belongs to the same class. Otherwise return false.
```java
public class Q1a {
    public static boolean compare(Object s, Object t){
        return s.getClass() == t.getClass();
    }
}
```
### b. Write a static method isClass that return true if the object parameter (Student s) is belong to any descendent class of Person. Otherwise return false.
```java
public static boolean isClass(Object s){
    return s instanceof Person && s.getClass() != Person.class;
}
```

## 2. Define a class Organism. The class contains the initial size of the organism and the growth rate. Create a constructor to initialize the instance variables. Then, define a class Animal. Animal is an organism that has extra instance variable which is the amount of eating need. Create a constructor to initialize the instance variable and a method to display the Animal instance variables.
```java
public class Organism {
    protected double size;
    protected double growthrate;
    
    public Organism(double size, double growthrate){
        this.size = size;
        this.growthrate = growthrate;
    }
}

public class Animal extends Organism {
    private double amount;

    public Animal(double size, double growthrate, double amount){
        super(size,growthrate);
        this.amount = amount;
    }

    public void display(){
        System.out.println("Size: " + size);
        System.out.println("Growth Rate: " + growthrate);
        System.out.println("Eating Need: " + amount);
    }
}
```

## 3. Define a class PaySystem. The class consists of the payrate per hour and the number of hours. The class also contains a method to return the total pay for a given amount of hours and a method to display the total payment. Derive a class RegularPay from PaySystem that has a constructor and did not override any base methods. Derived a class SpecialPay from PaySystem that override the base method and return the total pay plus 30% commission.
```java
public class PaySystem {
    protected double payrate;
    protected double hour;
    
    public PaySystem(double payrate,double hour){
        this.payrate = payrate;
        this.hour = hour;
    }
    
    protected double TotalPay(double hour){
        double total = hour*payrate;
        return total;
    }
    
    protected void display(){
        System.out.println("Total pay: " + TotalPay(hour));
    }
}

public class RegularPay extends PaySystem{
    public RegularPay(double payRate, double hours) {
        super(payRate, hours);
    }
}

public class SpecialPay extends PaySystem {
    public SpecialPay(double payrate, double hour){
        super(payrate,hour);
    }

    @Override
    public double TotalPay(double hour){
        double total = hour*payrate*1.3;
        return total;
    }

    @Override
    public void display(){
        System.out.println("Total pay: " + TotalPay(hour));
    }
}
```

## 4. Define a class PurchaseSystem. The class consists of product code, unit price, quantity and total price. Besides the class consists of a method to compute the total price and a display method. Derived a class SugarPurchase from PurchaseSystem. This new class add a sugar weight attributed and override the method to compute the total price as unit price*quantity*sugar weight.
```java
public class PurchaseSystem {
    protected String productCode;
    protected double unitPrice;
    protected double quantity;
    protected double totalPrice;
    
    protected PurchaseSystem(String productCode, double unitPrice, double quantity) {
        this.productCode = productCode;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalPrice = 0.0; 
    }
    
    protected double Total(){
        totalPrice = unitPrice*quantity;
        return totalPrice;
    }
    
    protected void display(){
        System.out.println(Total());
    }
}

public class SugarPurchase extends PurchaseSystem{
    private double sugarWeight;

    public SugarPurchase(String productCode, double unitPrice, int quantity, double sugarWeight) {
        super(productCode, unitPrice, quantity);
        this.sugarWeight = sugarWeight;
    }

    @Override
    public double Total(){
        totalPrice = unitPrice*quantity*sugarWeight;
        return totalPrice;
    }

    @Override
    public void display(){
        System.out.println(Total());
    }
}
```
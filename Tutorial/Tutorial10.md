# Tutorial 10

## Create an abstract class DiscountPolicy. It has a single abstract method computeDiscount that return the discount for the purchase of a given number of item. The method has two parameters count and itemCost. Derived a class BulkDiscount from DiscountPolicy. It has a constructor that has two parameters minimum and discount rate. It has a method computeDiscount that compute the discount base on discount rate if the number of item more than minimum. Otherwise, no discount given. Derived a class OtherDiscount that compute the discount base on the table below

|                      |       |       |       |      |
|:--------------------:|:-----:|:-----:|:-----:|:----:|
| N ( Number of Item ) | 1 - 2 | 3 - 5 | 6 - 8 | \> 8 |
|       Discount       |   0   |  10%  |  20%  | 30%  |

## Derived a class combineDiscount from DiscountPolicy. It has two parameters of type DiscountPolicy It has a method computeDiscount that return the maximum value returned by the computeDiscount for the two discount policies. Create a Tester class to test the program.
```java
public abstract class DiscountPolicy {
    public abstract double computeDiscount(int count, double itemCost);
}

public class BulkDiscount extends DiscountPolicy{

    private double minimum;
    private double discount_rate;

    public BulkDiscount(double minimum, double discount_rate){
        this.minimum = minimum;
        this.discount_rate = discount_rate;
    }

    @Override
    public double computeDiscount(int count, double itemCost){
        double discount;
        if(count>minimum){
            discount = (itemCost*count)*discount_rate;
        }
        else{
            discount = 0;
        }
        return discount;
    }
}

public class OtherDiscount extends DiscountPolicy{

    @Override
    public double computeDiscount(int count, double itemCost){
        double discount = 0;

        if (count >= 1 && count <= 2) {
            discount = 0; 
        } else if (count >= 3 && count <= 5) {
            discount = 0.10; 
        } else if (count >= 6 && count <= 8) {
            discount = 0.20; 
        } else if (count > 8) {
            discount = 0.30; 
        }

        return count * itemCost * discount;
    }
}

public class combineDiscount extends DiscountPolicy{

    private DiscountPolicy BulkDiscount;
    private DiscountPolicy OtherDiscount;

    public combineDiscount(DiscountPolicy BulkDiscount, DiscountPolicy OtherDiscount){
        this.BulkDiscount = BulkDiscount;
        this.OtherDiscount = OtherDiscount;
    }

    public double computeDiscount(int count, double itemCost) {
        double discount1 = BulkDiscount.computeDiscount(count, itemCost);
        double discount2 = OtherDiscount.computeDiscount(count, itemCost);
        return Math.max(discount1, discount2);

    }
}

public class DiscountTester {
    public static void main(String[] args) {
        BulkDiscount bulkDiscount = new BulkDiscount(5, 0.15); 
        OtherDiscount otherDiscount = new OtherDiscount(); 
        combineDiscount combineDiscount = new combineDiscount(bulkDiscount, otherDiscount);  

        int count = 6; 
        double itemCost = 20.0;

        System.out.println("Bulk Discount: " + bulkDiscount.computeDiscount(count, itemCost));
        System.out.println("Other Discount: " + otherDiscount.computeDiscount(count, itemCost));
        System.out.println("Combined Discount: " + combineDiscount.computeDiscount(count, itemCost));
    }
}
```

## 2. Create an interface Interest that has a single method computeInterest that return the monthly interest based on the balance in the account. Create the SavingAccount that implement the interface, the class has an instance variable called balance. Define the method to compute interest. The interest rate for saving account is 0.5% per year. Create the FixedAccount that implement the interface. The class has an instance variable called balance. Define the method to compute interest. The interest rate for saving account is 3% per year. Create a Tester class to test the program.
```java
public interface Interest {
    double computeInterest(double balance);
}

public class SavingAccount implements Interest{

    private double balance;

    @Override
    public double computeInterest(double balance){
        return balance*0.005/12;
    }
}

public class FixedAccount implements Interest{

    private double balance;

    @Override
    public double computeInterest(double balance){
        return balance*0.03/12;
    }
}

public class InterestTester {
    public static void main(String[]args){
        Interest saving = new SavingAccount();
        Interest fixed = new FixedAccount();

        double balance = 5000;

        System.out.println("The interest for saving account is " + saving.computeInterest(balance));
        System.out.println("The interest for fixed account is " + fixed.computeInterest(balance));

    }
}
```

## 3. Create a class Person that implements the comparable interface. The class has an instance variable name. The class has the constructor that initializes the name. The class also has the accessor method and a display method to display the name. Create an array for multiple Person objects. Sort the person in ascending order. Create a Tester class to test the program.
```java
public class Person implements Comparable<Person>{
    
    private String name;
    
    public Person(String name){
        this.name = name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void display(){
        System.out.println("Name :" + name);
    }
    
    @Override
    public int compareTo(Person other){
        return this.name.compareTo(other.name);
    }
}

import java.util.Arrays;

public class PersonTester {
    public static void main(String[]args){

        Person[] people = {
                new Person("Alice"),
                new Person("Charlie"),
                new Person("Bob"),
                new Person("Dave")
        };

        System.out.println("Original List: ");
        for(Person other : people){
            other.display();
        }

        Arrays.sort(people);
        System.out.println();

        System.out.println("After Arrangement: ");
        for(Person name : people){
            name.display();
        }

    }
}
```

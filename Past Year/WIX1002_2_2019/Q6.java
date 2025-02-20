//Order.java
public class Order {

    private String customerName;
    private String customerID;
    private int quantityOrder;
    private double unitPrice;

    public Order(){

    }

    public Order(String customerName, String customerID, int quantityOrder, double unitPrice){
        this.customerID = customerID;
        this.customerName = customerName;
        this.quantityOrder = quantityOrder;
        this.unitPrice = unitPrice;
    }

    public void setCustomerID(String customerID){
        this.customerID = customerID;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setQuantityOrder(int a){
        this.quantityOrder = a;
    }

    public void setUnitPrice(double a){
        this.unitPrice = a;
    }

    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerID(){
        return customerID;
    }

    public int getQuantityOrder(){
        return quantityOrder;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public double computeTotalPrice(){
        double totalPrice = quantityOrder * unitPrice;
        return totalPrice;
    }

    public String toString(){
        return "Order record\n Customer Name : " + customerName + "\nCustomer ID : " + customerID + "\nQuantity Ordered : " + quantityOrder + "\nUnit price : " + unitPrice + "\nTotal Price : " + computeTotalPrice();
    }
}

//ShippedOrder.java
public class ShippedOrder extends Order{

    public ShippedOrder(String name, String ID ,int quantity, double haha){
        super(name,ID,quantity,haha);
    }

    @Override
    public double computeTotalPrice(){
        double totalPrice = getQuantityOrder() * getUnitPrice() + 4;
        return totalPrice;
    }

    @Override
    public String toString(){
        return "Order record\n Customer Name : " + getCustomerName() + "\nCustomer ID : " + getCustomerID() + "\nQuantity Ordered : " + getQuantityOrder() + "\nUnit price : " + getUnitPrice() + "\nTotal Price : " + computeTotalPrice();
    }
}

//Main class
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name : ");
        String name = scanner.nextLine();
        System.out.print("Enter customer id : " );
        String ID = scanner.nextLine();
        System.out.print("Enter quantity ordered : " );
        int quantity = scanner.nextInt();
        System.out.print("Enter price per unit : ");
        double unitPrice = scanner.nextDouble();
        System.out.println();

        Order a = new Order(name,ID,quantity,unitPrice);
        System.out.println(a.toString());
        System.out.println();

        ShippedOrder b = new ShippedOrder(name,ID,quantity,unitPrice);
        System.out.println(b.toString());
    }
}
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q6 {
    public static void main(String[]args){
        String productID = "ProductID";
        String productName = "ProductName";
        String quantity = "Quantity";
        String pricePerUnit = "PricePerUnit";
        String total = "Total";

        try{
            Scanner outputOrder = new Scanner(new FileInputStream("order.txt"));
            System.out.printf("%-12s %-20s %-10s %-15s %-10s\n", productID, productName, quantity, pricePerUnit, total);
            while(outputOrder.hasNextLine()){
                Scanner outputProduct = new Scanner(new FileInputStream("product.txt"));
                String [] line = outputOrder.nextLine().split(",");
                while(outputProduct.hasNextLine()){
                    String [] line2 = outputProduct.nextLine().split(",");
                    if (line[1].equals(line2[0])){
                        double totalproduct = Double.parseDouble(line2[2])*Double.parseDouble(line[2]);
                        System.out.printf("%-12s %-20s %-10s %-15s %-10.2f\n",line[1],line2[1],line[2],line[2],totalproduct);
                    }
                }
            }
        }
        catch(IOException e){
            System.out.println("Error have been found");
        }
    }
}
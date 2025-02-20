//import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q3 {
    public static void main(String[]args){
        try{
            Scanner scanner = new Scanner(new FileInputStream("order.txt"));
            PrintWriter output = new PrintWriter(new FileOutputStream("reverse.txt"));
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                StringBuilder string = new StringBuilder(line).reverse();
                output.println(string.toString());
            }
            output.close();
            scanner.close();
//            File originalFile = new File("order.txt");
//            originalFile.delete();
//            File tempFile = new File("reverse.txt");
//            tempFile.renameTo(originalFile);
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URLConnection;

public class Q2 {
    public static void main(String[]args){

        try {
            URL u = new URL("https://fsktm.um.edu.my/");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);

            PrintWriter output = new PrintWriter(new FileOutputStream("index.htm"));
            while(in.hasNextLine()){
                String line = in.nextLine();
                output.println(line);
            }
            output.close();
            in.close();
        }
        catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }

    }
}
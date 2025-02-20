import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Q1 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a course code: ");
        String coursename = scanner.nextLine();

        try{
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("coursename.dat"));
            output.writeUTF("WXES1116 Programming I");
            output.writeUTF("WXES1115 Data Structure");
            output.writeUTF("WXES1110 Operating System");
            output.writeUTF("WXES1112 Computing Mathematics I");
            output.close();
        }
        catch(IOException e){
            System.out.println("Error in finding file");
        }

        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("coursename.dat"));
            while(true){
                try{
                    String [] course = input.readUTF().split(" ");
                    if(course[0].equals(coursename)){
                        System.out.print("The course name is ");
                        for(int i=1;i<course.length;i++){
                            System.out.print(course[i] + " ");
                        }
                    }
                }
                catch(EOFException e){
                    break;
                }
            }
        }
        catch(IOException e){
            System.out.println("Errorrrrrrrr");
        }
    }
}
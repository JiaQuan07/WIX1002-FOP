import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q4 {
    public static void main(String []args){
        int line=0,character=0,word=0;
        try{
            Scanner input = new Scanner(new FileInputStream("Q4.txt"));
            while(input.hasNextLine()){
                String sentence = input.nextLine();
                String [] sentences = sentence.split(" ");
                line++;
                word = word + sentences.length;
                for(int i=0;i<sentence.length();i++){
                    if(sentence.charAt(i) != ' '){
                        character ++;
                    }
                }
            }
            System.out.println("The number of line is " + line);
            System.out.println("The number of word is " + word);
            System.out.println("The number of character is " + character);
        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
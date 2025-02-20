import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String []args) throws FileNotFoundException{

        Scanner input = new Scanner(new FileInputStream("myAmbition.txt"));
        int noSentence = 0, noWord = 1, noLetter[]=new int [26];

        while(input.hasNextLine()){

            String sentences = input.nextLine();
            sentences = sentences.toUpperCase();

            for(int i=0;i<sentences.length();i++){
                char ch = sentences.charAt(i);
                if(ch == ' '){
                    noWord++;
                }
                if(ch == '.'){
                    noSentence++;
                }
                int num = ch - 'A';
                if(num>=0 && num<=25){
                    noLetter[num]++;
                }
            }
        }

        System.out.println("Number of sentences : " + noSentence);
        System.out.println("Number of words : " + ++noWord);
        for(int i=0;i<26;i++){
            System.out.println((char)('A'+i) + " : " + noLetter[i]);
        }

    }
}
//MessageEncoder.java
public interface MessageEncoder {

    public String encode(String plainText);

    public String decode(String cipherText);

}

//SubstitutionCipher.java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SubstitutionCipher implements MessageEncoder{

    protected String inputName;
    protected String outputName;
    protected int shift;

    public SubstitutionCipher(String inputName, String outputName, int shift){
        this.inputName = inputName;
        this.outputName = outputName;
        this.shift = shift;
    }

    public String encode(String plainText){
        char [] cipherText = new char [plainText.length()];

        for(int i=0;i<plainText.length();i++){
            char c = plainText.charAt(i);

            if(Character.isLetter(c)){
                char shifted = (char)(c + shift); //shift by positive value

                if(Character.isLowerCase(c) && shifted > 'z'){
                    shifted -=26; //check whether the shifting have existing the range of alphabet or not if yes, drag it back by minus 26
                }
                else if(Character.isUpperCase(c) && shifted > 'Z'){
                    shifted -=26;
                }

                cipherText[i] = shifted;
            }
            else{
                cipherText[i]=c;
            }
        }
        return new String (cipherText);
    }

    public String decode(String cipherText){
        char [] PlainText = new char [cipherText.length()];

        for(int j=0;j<cipherText.length();j++){
            char d = cipherText.charAt(j);

            if(Character.isLetter(d)){
                char shifted = (char)(d-shift);

                if(Character.isLowerCase(d) && shifted<'a'){
                    shifted +=26;
                }
                else if(Character.isUpperCase(d) && shifted<'A'){
                    shifted +=26;
                }
                PlainText [j] = shifted;
            }
            else{
                PlainText[j] = d;
            }

        }

        return new String (PlainText);
    }

    public void readEncode() throws IOException{
        Scanner input = new Scanner(new FileInputStream(inputName));
        String PlainText = "";
        while(input.hasNextLine()){
            PlainText += input.nextLine() + "\n";
        }
        input.close();

        String CipherText = encode(PlainText);
        PrintWriter output = new PrintWriter(new FileOutputStream(outputName));
        output.print(CipherText);
        output.close();
    }

    public void readDecode() throws IOException{
        Scanner input = new Scanner(new FileInputStream(outputName));
        String PlainText = "";
        while(input.hasNextLine()){
            PlainText += input.nextLine() + "\n";
        }
        input.close();

        String CipherText = decode(PlainText);
        PrintWriter output = new PrintWriter(new FileOutputStream(inputName));
        output.print(CipherText);
        output.close();
    }
}

//TestExcode_Decode.java
import java.io.IOException;

public class TestEncode_Decode {
    public static void main(String[]args){
        SubstitutionCipher cipher = new SubstitutionCipher("plain.txt", "cipher.txt", 3);

        try {
            cipher.readEncode();
            System.out.println("Encoding complete. Cipher text written to cipher.txt.");

            cipher.readDecode();
            System.out.println("Decoding complete. Plain text written to plain.txt.");
        }
        catch (IOException e) {
            System.out.println("Error");
        }

    }
}
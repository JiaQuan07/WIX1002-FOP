//MessageEncoder.java
public interface MessageEncoder {

    public String encode(String plainText);

    public String decode(String cipherText);

}

//ShuffleCipher.java
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ShuffleCipher implements MessageEncoder{

    private String inputName;
    private String outputName;
    private int N;

    public ShuffleCipher(String inputName, String outputName, int N){
        this.inputName = inputName;
        this.outputName = outputName;
        this.N = N;
    }

    public String encode(String PlainText){
        String cipherText = PlainText;
        for(int i=0;i<N;i++){
            cipherText = shuffle(cipherText);
        }
        return cipherText;
    }

    public String decode(String CipherText){
        String plainText = CipherText;
        for(int j=0;j<N;j++){
            plainText = reverse(plainText);
        }
        return plainText;
    }

    public String shuffle(String PlainText){

        int firstSize = PlainText.length()/2;
        int secondSize = PlainText.length()-firstSize;
        StringBuilder shuffled = new StringBuilder();

        String firstHalf = PlainText.substring(0, firstSize);
        String secondHalf = PlainText.substring(firstSize);

        for(int k=0;k<firstSize;k++){
            shuffled.append(firstHalf.charAt(k));
            if(secondHalf.length() > k){
                shuffled.append(secondHalf.charAt(k));
            }
        }

        if(secondHalf.length() > firstSize){
            shuffled.append(firstSize);
        }

        return shuffled.toString();
    }


    public String reverse(String cipherText) {
        int mid = cipherText.length() / 2;
        int firstHalfSize = (cipherText.length() + 1) / 2;
        StringBuilder reversed = new StringBuilder();

        char[] firstHalf = new char[firstHalfSize];
        char[] secondHalf = new char[cipherText.length() - firstHalfSize];

        int i = 0;
        for (int j = 0; j < cipherText.length(); j++) {
            if (j % 2 == 0) {
                firstHalf[i++] = cipherText.charAt(j);
            } else {
                secondHalf[j / 2] = cipherText.charAt(j);
            }
        }

        reversed.append(new String(firstHalf));
        reversed.append(new String(secondHalf));

        return reversed.toString();
    }

    public void readEncode() throws IOException{
        Scanner input = new Scanner(new FileInputStream(inputName));
        String PlainText = "";
        while(input.hasNextLine()){
            PlainText += input.nextLine() + "\n";
        }
        input.close();

        String CipherText = shuffle(PlainText);
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

        String CipherText = reverse(PlainText);
        PrintWriter output = new PrintWriter(new FileOutputStream(inputName));
        output.print(CipherText);
        output.close();
    }
}

//TestShuffle.java
public class TestShuffle {
    public static void main(String[]args){
        ShuffleCipher cipher = new ShuffleCipher("plain.txt", "cipher.txt", 3);

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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckPairing {
    public static void main(String[]args) throws FileNotFoundException{
        String [][]info = new String [4][4];
        try{
            Scanner input = new Scanner(new FileInputStream("participants.txt"));
            int i= 0;
            while(input.hasNextLine()){
                String information[] = input.nextLine().split(",");
                info[i][0] = information[0];
                info[i][1] = information[1];
                info[i][2] = information[2];
                info[i][3] = information[3].trim().replace(" ", "");
                i++ ;
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }


        for(int i=0;i<info.length;i++){
            System.out.printf("%s\t%s\t%s\t%s",info[i][0],info[i][1],info[i][2],info[i][3]);
            System.out.println();
        }

        int counter = 0;
        int indicatorFirstPair = 0;
        int indicatorSecondPair = 0;
        for(int i=0;i<info.length;i++){
            for(int j=0;j<info.length;j++){
                if(i == j | indicatorFirstPair == i | indicatorSecondPair == j){
                    continue;
                }
                if(info[i][3].equalsIgnoreCase(info[j][3]) && !(info[i][1].equalsIgnoreCase(info[j][1]))){
                    indicatorFirstPair = i;
                    indicatorSecondPair = j;
                    counter ++ ;
                }
            }
        }
        boolean pair = false;
        if(counter == 2){
            System.out.println("Participants are in pairs");
            pair = true;
        }
        else{
            System.out.println("Participants are not in pairs, cannot proceed");
        }

        char seat [] = {'A','B','C','D'};
        int k=0;
        ArrayList<String> infor = new ArrayList <>();
        if(pair == true){
            for(int i=0;i<info.length;i++){
                for(int j=0;j<info.length;j++){
                    if(i == j || indicatorFirstPair == i || indicatorSecondPair == j || indicatorFirstPair == j || indicatorSecondPair == i){
                        continue;
                    }
                    if(info[i][3].equalsIgnoreCase(info[j][3]) && !(info[i][1].equalsIgnoreCase(info[j][1]))){
                        indicatorFirstPair = i;
                        indicatorSecondPair = j;
                        //use arraylist to differentiate the seat for each person which is ac and bd position
                        String firstName = info[i][0];
                        String firstAge = info[i][2];
                        String SecondName = info[j][2];
                        String SecondAge = info[j][2];
                        infor.add(firstName + ", " + firstAge + " years old");
                        infor.add(info[j][0] + ", " + info[j][2] + " years old");

                    }
                }
            }

        }

        PrintWriter output = new PrintWriter(new FileOutputStream("group.txt"));
        output.println("Seat " + seat[k] + " : " + infor.get(0));
        output.println("Seat " + seat[k+1] + " : " + infor.get(2));
        output.println("Seat " + seat[k+2] + " : " + infor.get(1));
        output.println("Seat " + seat[k+3] + " : " + infor.get(3));
        output.close();
    }
}
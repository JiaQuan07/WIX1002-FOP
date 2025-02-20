import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
//import java.util.HashSet;

public class Main {
    public static void main(String[]args){

        int totalRecord = 0;

        try{
            BufferedReader input = new BufferedReader(new FileReader("sampleLog.txt"));
            String line;
            while((line = input.readLine())!=null){
                totalRecord++;
            }
            input.close();

            //read the input
            System.out.println("Reading from log file...");
            System.out.println("************************************************");
            System.out.println("Record read from log file");
            input = new BufferedReader(new FileReader("sampleLog.txt"));
            String [][] record = new String [totalRecord][22];
            for(int i=0;i<totalRecord;i++){
                String [] lines = input.readLine().split(" ");
                for(int j=0;j<lines.length;j++){
                    record[i][j] = lines[j];
                }
            }
            input.close();

            //print record
            for(int j=0;j<record.length;j++){
                System.out.println("Record " + (j+1) + ":");
                for(int i=0;i<record[j].length;i++){
                    if(record[j][i] == null){
                        continue;
                    }
                    System.out.println("\t" + record[j][i]);
                }
                System.out.println();
            }

            System.out.println("total records reaed: " + totalRecord);
            System.out.println();
            System.out.println("*********************************");
            System.out.println("Print user submission stat");

            String user = "User", job = "Jobs Submitted";
            System.out.printf("%-8s%-2s\n",user,job);
            System.out.println("----\t--------------");

            HashMap <String,Integer> userlist = new HashMap<>();
            for(int j=0;j<record.length;j++){
                String [] rec = record[j][1].split(";");
                if(rec[1].contains("S")){
                    String users = "";
                    for (String part : rec) {
                        if (part.startsWith("user=")) {
                            users = part.substring(5); // Remove "user=" and extract the username
                            break;
                        }
                    }
                    if(!userlist.containsKey(users)){
                        userlist.put(users,1);
                    }
                    else{
                        int currentValue = userlist.get(users);
                        userlist.put(users, currentValue + 1);
                    }

                }
            }

            for(String i: userlist.keySet()){
                System.out.printf("%-10s\t%-2d\n",i,userlist.get(i));
            }

            System.out.println();
            System.out.println("****************************");
            System.out.println("Print jobs status");
            System.out.println();
            System.out.printf("%-12s%-20s%-25s%-20s\n","Job ID","Submitted (queue)","Started (start time)","Exited (end time/error)");
            System.out.printf("%-12s%-20s%-25s%-20s\n","------","-----------------","--------------------","-----------------------");
            for (int i = 0; i < record.length; i++) {
                if(record[i][1].charAt(9) == 'S'){
                    String jobID = record[i][1].substring(11,16);
                    String queue = record[i][4].substring(6);
                    String startTime = record[i][8].substring(6);
                    String exited = toString(record, i, jobID);

                    System.out.printf("%-12s%-20s%-25s%-20s\n",jobID,"Y (" + queue + ")","Y (" + startTime + ")",exited);
                }
            }

        }
        catch(IOException e){
            System.out.println("Error in reading the file");
        }



    }

    private static String toString(String[][] records, int i, String jobID) {
        String exit = null;
        for (int j = 0; j < records.length; j++) {
            if(records[j][1].charAt(9) == 'E' && records[j][1].substring(11,16).equals(jobID)){
                if(Arrays.toString(records[j]).contains("Exit_status")){
                    exit = "Error: Exit Status " + records[j][17].substring(12);
                } else{
                    exit = records[j][16].substring(4);
                }
            }
        }
        return exit;
    }
}
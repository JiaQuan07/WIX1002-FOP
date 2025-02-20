import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OIARecord {

    public OIARecord(){

    }

    private String doi;
    private String title;
    private String subject;
    private String author1;
    private String author2;
    private String author3;
    private String author4;
    private String author5;
    private String author6;
    private String author7;
    private String author8;
    private String keyword;
    private String status;

    public OIARecord(String doi, String title, String subject, String author1, String author2, String author3, String author4, String author5, String author6, String author7, String author8, String keyword, String status){
        this.doi = doi;
        this.title = title;
        this.subject = subject;
        this.author1 = author1;
        this.author2 = author2;
        this.author3 = author3;
        this.author4 = author4;
        this.author5 = author5;
        this.author6 = author6;
        this.author7 = author7;
        this.author8 = author8;
        this.keyword = keyword;
        this.status = status;
    }

    public static void loadRecord(String filename, OIARecord[] object) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(filename));
        String line;
        int i = 0;

        while ((line = input.readLine()) != null) {
            String[] record = line.split(",");

            if (record.length == 13) {
                object[i] = new OIARecord(record[0], record[1], record[2], record[3], record[4], record[5], record[6],
                        record[7], record[8], record[9], record[10], record[11], record[12]);
                i++;

            }
        }
        input.close();
    }


    public static ArrayList <OIARecord> cleanRecord(OIARecord[]object){
        ArrayList <OIARecord> record = new ArrayList<>();
        for(int i=0;i<object.length;i++){
            OIARecord getRecord = object[i];
            if(!(getRecord.status.equalsIgnoreCase("deleted"))){
                record.add(getRecord);
            }
        }
        return record;
    }

    public static void printRecord(ArrayList<OIARecord> object) {
        if (object == null || object.isEmpty()) {
            System.out.println("No records to display.");
            return;
        }

        int i=0;
        for (OIARecord record : object) {
            i = i+1;
            System.out.print("Record " + i + " ");
            System.out.println(record.doi + " " + record.title + " " + record.subject + " " + record.author1 + " " + record.author2
                    + " " + record.author3 + " " + record.author4 + " " + record.author5 + " " + record.author6 + " " + record.author7 + " " + record.author8
                    + " " + record.keyword + " " + record.status);
        }
    }

    public static void reportData(ArrayList<OIARecord> object){
        Map<String, Integer> authorCountMap = new HashMap<>();

        for (OIARecord record : object) {
            addAuthorToMap(authorCountMap, record.author1);
            addAuthorToMap(authorCountMap, record.author2);
            addAuthorToMap(authorCountMap, record.author3);
            addAuthorToMap(authorCountMap, record.author4);
            addAuthorToMap(authorCountMap, record.author5);
            addAuthorToMap(authorCountMap, record.author6);
            addAuthorToMap(authorCountMap, record.author7);
            addAuthorToMap(authorCountMap, record.author8);
        }

        ascending(authorCountMap);
    }

    private static void addAuthorToMap(Map<String, Integer> map, String author) {
        if (author != null && !author.trim().isEmpty()) {
            map.put(author, map.getOrDefault(author, 0) + 1);
        }
    }

    public static void ascending(Map<String,Integer>map){
        List<Map.Entry<String, Integer>> authorList = new ArrayList<>(map.entrySet());
        Collections.sort(authorList, (entry1, entry2) -> entry1.getKey().compareTo(entry2.getKey()));
        System.out.println("Authors in ascending order:");
        for (Map.Entry<String, Integer> entry : authorList) {
            System.out.println("Author: " + entry.getKey() + " - Occurrences: " + entry.getValue());
        }
    }
}

//Main class
import java.io.IOException;

public class Report extends OIARecord{
    public static void main (String[]args) throws IOException{
        String inputFile = "oaiset.csv";
        OIARecord [] data = new OIARecord[50];
        System.out.println("Loading Dataset...");
        loadRecord(inputFile,data);
        System.out.println("The curated record is as follow:");
        printRecord(cleanRecord(data));
        System.out.println("\nThe summary report is as follow:");
        reportData(cleanRecord(data));
    }
}
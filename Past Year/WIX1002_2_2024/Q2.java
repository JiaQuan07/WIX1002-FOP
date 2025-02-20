//Job.java
public class Job {

    private String jobName;
    private String partition;
    private String memory;
    private String qos;

    public Job(String jobName, String partition, String memory, String qos){
        this.jobName = jobName;
        this.partition = partition;
        this.memory = memory;
        this.qos = qos;
    }

    public String getJobName(){
        return jobName;
    }

    public String getPartition(){
        return partition;
    }

    public String getMemory(){
        return memory;
    }

    public String getQos(){
        return qos;
    }
}

//Main class
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class JobReader {

    public static void main(String []args) throws FileNotFoundException{
        Job[] jobs = readJobsFromDirectory("C:\\Users\\ASUS\\OneDrive - Universiti Malaya\\Desktop\\Sem 1\\WIX1002 Fundamental of Programming\\PastYear2024_Sem2\\Job");
        //Change "directory_path" to your directory path

        listAllJobs(jobs);
        generateStatistics(jobs);
    }

    public static Job[] readJobsFromDirectory(String directoryPath) throws FileNotFoundException{
        File directory = new File(directoryPath);
        File [] files = directory.listFiles();
        Job [] job = new Job [files.length];

        //checking is the String given is a path directory or not
        if(directory.isDirectory()){
            int i=0;
            for(File file : files){
                Scanner input = new Scanner(new FileInputStream(file.getAbsolutePath()));
                String [] jobName = input.nextLine().split(":");
                String [] partition = input.nextLine().split(":");
                String [] memory = input.nextLine().split(":");
                String [] qos = input.nextLine().split(":");
                job[i] = new Job(jobName[1].trim(),partition[1].trim(),memory[1].trim(),qos[1].trim());
                i++;
                input.close();
            }
        }
        return job;
    }

    public static void listAllJobs(Job[]object){
        System.out.println("List of all jobs: ");
        for(int i=0;i<object.length;i++){
            System.out.println("Job Name: " + object[i].getJobName() + ", Partition: " + object[i].getPartition() + ", Memory: " + object[i].getMemory() + ", Qos: " + object[i].getQos());
        }
    }

    public static void generateStatistics(Job[]object){
        Set<String> partition = new HashSet<>();
        Set<String> qos = new HashSet<>();
        for(int i=0;i<object.length;i++){
            partition.add(object[i].getPartition());
            qos.add(object[i].getQos());
        }

        System.out.println();
        System.out.println("Partition Statistics: ");
        for(String partitions : partition){
            int counter =0;
            for(int k=0;k<object.length;k++){
                if(partitions.equals(object[k].getPartition())){
                    counter++;
                }
            }
            System.out.println(partitions + ": " + counter + " jobs");
        }

        System.out.println();
        System.out.println("Qos Statistics:");
        for(String Qos : qos){
            int counters =0;
            for(int n=0;n<object.length;n++){
                if(Qos.equals(object[n].getQos())){
                    counters++;
                }
            }
            System.out.println(Qos + ": " + counters + " jobs");
        }
    }

}
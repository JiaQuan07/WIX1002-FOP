import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        try{
            Scanner input = new Scanner(new FileInputStream("nodelist.txt"));
            String NodeName = null, CPUTot = null, CPUAlloc = null, RealMemory = null, AllocMem = null, Partitions = null;
            boolean flag = false;
            double ratio;
            System.out.println("+-----------------------------------------------------------------+");
            System.out.printf("|%-6s%-14s%-15s%-20s%-10s|","Node","Partitions","CPU","MEMORY","RATIO");
            System.out.print("\n+-----------------------------------------------------------------+");
            while(input.hasNextLine()){
                String info = input.nextLine();
                if(!input.hasNextLine()){
                    flag = true;
                }
                if(info.isBlank() || flag){
                    double freeCPU = Double.parseDouble(CPUTot) - Double.parseDouble(CPUAlloc);
                    double freeRam = Double.parseDouble(RealMemory) - Double.parseDouble(AllocMem);
                    int freeeRam = (int)freeRam/1000;
                    ratio = (freeCPU/Double.parseDouble(CPUTot))-(freeeRam/(Double.parseDouble(RealMemory)/1000));
                    ratio = Math.abs(ratio);
                    System.out.printf("\n|%-6s%-14s%-15s%-20s%-10.3f|",NodeName,Partitions,(int)freeCPU+" / "+CPUTot,(int)freeeRam+"G"+" / " +RealMemory,ratio);
                }
                else{
                    String [] information = info.split(" ");
                    for(int i=0;i<information.length;i++){
                        if(information[i].contains("NodeName")){
                            NodeName = information[i].substring(information[i].indexOf("=")+1);
                        }
                        else if(information [i].contains("CPUTot")){
                            CPUTot = information[i].substring(information[i].indexOf("=")+1);
                        }
                        else if(information[i].contains("CPUAlloc")){
                            CPUAlloc = information[i].substring(information[i].indexOf("=")+1);
                        }
                        else if(information[i].contains("RealMemory")){
                            RealMemory = information[i].substring(information[i].indexOf("=")+1);
                        }
                        else if(information[i].contains("AllocMem")){
                            AllocMem = information[i].substring(information[i].indexOf("=")+1);
                        }
                        else if(information[i].contains("Partitions")){
                            Partitions = information[i].substring(information[i].indexOf("=")+1);
                        }
                    }
                }
            }
            System.out.print("\n+-----------------------------------------------------------------+");

        }
        catch(IOException e){
            System.out.println("File not found");
        }

    }
}
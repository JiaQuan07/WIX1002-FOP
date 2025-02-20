import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        while(true){

            String extractGene;
            boolean flag = false;
            int split = 1;

            System.out.print("Enter genome string [quit to stop] : ");
            String genome = scanner.nextLine();

            String gene[] = genome.split("ATG");
            if(genome.contains("ATG")){
                split = 0;
            }

            if(genome.equalsIgnoreCase("quit")){
                break;
            }

            for(;split<gene.length;split++){
                if(gene[split].contains("TAG")){
                    extractGene = gene[split].substring(0,gene[split].indexOf("TAG"));
                    if(extractGene.length() %3 == 0 && !extractGene.isEmpty()){
                        if(!(extractGene.contains("ATG")||extractGene.contains("TAG")||extractGene.contains("TAA")||extractGene.contains("TGA"))){
                            System.out.println(extractGene);
                            flag = true;
                        }
                    }
                }
                if(gene[split].contains("TAA")){
                    extractGene = gene[split].substring(0,gene[split].indexOf("TAA"));
                    if(extractGene.length() %3 == 0 && !extractGene.isEmpty()){
                        if(!(extractGene.contains("ATG")||extractGene.contains("TAG")||extractGene.contains("TAA")||extractGene.contains("TGA"))){
                            System.out.println(extractGene);
                            flag = true;
                        }
                    }
                }
                if(gene[split].contains("TGA")){
                    extractGene = gene[split].substring(0,gene[split].indexOf("TGA"));
                    if(extractGene.length() %3 == 0 && !extractGene.isEmpty()){
                        if(!(extractGene.contains("ATG")||extractGene.contains("TAG")||extractGene.contains("TAA")||extractGene.contains("TGA"))){
                            System.out.println(extractGene);
                            flag = true;
                        }
                    }
                }
            }

            if(!flag){
                System.out.println("No gene is found");
            }
        }
    }
}
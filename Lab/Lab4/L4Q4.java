import java.util.*;

public class L4Q4v2 {
    public static void main(String[]args){

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = obj.nextInt();
        System.out.print("Enter first day of the year: ");
        int firstday = obj.nextInt();

        int Day_May,Day_Aug;int daymatterMay = 1,daymatterAug = 1;
        boolean F = (year%4==0&&year%100!=0)||year%400==0;

        if(F==true){
            Day_May = 121%7;
            Day_Aug = 213%7;
        }
        else {
            Day_May = 120%7;
            Day_Aug = 212%7;
        }

        int firstDayMay = (firstday +Day_May)%7 ;
        int firstDayAug = (firstday + Day_Aug)%7;
        int spacer_May = firstDayMay;
        int spacer_Aug = firstDayAug;

        //May
        System.out.println();
        System.out.println("May");
        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n","Sun" ,"Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for(int k=firstDayMay;k>0;k--){
            System.out.printf("%-5s","");
        }
        for(int i=0;i<5;i++){
            if(i>0){
                System.out.print("\n");}
            while(true){
                if(daymatterMay>31){
                    break;
                }

                if(spacer_May%7==0){
                    System.out.println();
                }
                System.out.printf("%-5d",daymatterMay);
                daymatterMay++;
                spacer_May++;
            }
        }

        //August
        System.out.println("August");
        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n","Sun" ,"Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
        for(int k=firstDayAug;k>0;k--){
            System.out.printf("%-5s","");
        }
        for(int i=0;i<5;i++){
            if(i>0){
                System.out.print("\n");}
            while(true){
                if(daymatterAug>31){
                    break;
                }

                if(spacer_Aug%7==0){
                    System.out.println();
                }
                System.out.printf("%-5d",daymatterAug);
                daymatterAug++;
                spacer_Aug++;
            }
        }
    }
}
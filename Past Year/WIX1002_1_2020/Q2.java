import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        String type = "";

        //location 1
        System.out.println("Enter Location 1");
        //latitude
        System.out.print("Enter Direction: [N, S, E, W]: ");
        String direction1 = scanner.nextLine();
        System.out.print("Enter Degree, Minute and Second : ");
        int degree1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int second1 = scanner.nextInt();
        scanner.nextLine();

        //longtitude
        System.out.print("Enter Direction: [N, S, E, W]: ");
        String direction2 = scanner.nextLine();
        System.out.print("Enter Degree, Minute and Second : ");
        int degree2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int second2 = scanner.nextInt();
        scanner.nextLine();


        //location 2
        System.out.println("Enter Location 2");
        //latitude
        System.out.print("Enter Direction: [N, S, E, W]: ");
        String direction3 = scanner.nextLine();
        System.out.print("Enter Degree, Minute and Second : ");
        int degree3 = scanner.nextInt();
        int minutes3 = scanner.nextInt();
        int second3 = scanner.nextInt();
        scanner.nextLine();

        //longtitude
        System.out.print("Enter Direction: [N, S, E, W]: ");
        String direction4 = scanner.nextLine();
        System.out.print("Enter Degree, Minute and Second : ");
        int degree4 = scanner.nextInt();
        int minutes4 = scanner.nextInt();
        int second4 = scanner.nextInt();
        scanner.nextLine();

        //calculation of the latitude and longitude
        if(direction1.equals("S") || direction1.equals("W")){
            degree1 = degree1*-1;
            if(direction1.equals("N") || direction1.equals("S")){
                type = "Latitude";
            }
            else if(direction1.equals("E") || direction1.equals("W")){
                type = "Longitude";
            }
        }
        double latitude1 = degree1 + (double)(minutes1*60 + second1)/3600;
        System.out.print("Location 1 : " + latitude1 + " " + type);

        if(direction2.equals("S") || direction2.equals("W")){
            degree2 = degree2*-1;
            if(direction2.equals("N") || direction2.equals("S")){
                type = "Latitude";
            }
            else if(direction2.equals("E") || direction2.equals("W")){
                type = "Longitude";
            }
        }
        double longitude1 = degree2 + (double)(minutes2*60 + second2)/3600;
        System.out.println(" , " + longitude1 + " " + type);

        if(direction3.equals("S") || direction3.equals("W")){
            degree3 = degree3*-1;
            if(direction3.equals("N") || direction3.equals("S")){
                type = "Latitude";
            }
            else if(direction3.equals("E") || direction3.equals("W")){
                type = "Longitude";
            }
        }
        double latitude2 = degree3 + (double)(minutes3*60 + second3)/3600;
        System.out.print("Location 2 : " + latitude2 + " " + type);

        if(direction4.equals("S") || direction4.equals("W")){
            degree4 = degree4*-1;
            if(direction4.equals("N") || direction4.equals("S")){
                type = "Latitude";
            }
            else if(direction4.equals("E") || direction4.equals("W")){
                type = "Longitude";
            }
        }
        double longitude2 = degree4 + (double)(minutes4*60 + second4)/3600;
        System.out.println(" , " + longitude2 + " " + type);

        double deltaLatitude = Math.toRadians(Math.abs(latitude1-latitude2));
        double deltaLongitude = Math.toRadians(Math.abs(longitude1-longitude2));
        double a = Math.pow(Math.sin(deltaLatitude/2),2) +
                Math.cos(Math.toRadians(latitude1)) * Math.cos(Math.toRadians(latitude2)) *
                        Math.pow(Math.sin(deltaLongitude/2),2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double d = 6371 * c;

        System.out.println("Distance : " + d + " KM");
    }

}
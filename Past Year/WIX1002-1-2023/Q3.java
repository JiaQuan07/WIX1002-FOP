import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class OceanData {
    public static void main(String[]args) throws IOException{
        String inputFile = "ocean_data.csv";
        DataBouy[] data = new DataBouy[25];
        float avg_water_temp;

        loadData(inputFile,data);
        show(data);

        avg_water_temp = calculateAvgWaterTemp(data);
        System.out.printf("\nAverage water temperature is %.2f",avg_water_temp);
        System.out.println();

        printMap(data, avg_water_temp);
    }

    public static void show(DataBouy[]data){
        System.out.println("Data read from bouy:");
        System.out.printf("%-14s%-4s%-4s%-8s%-8s","bouy_id","lat","long","air_t","water_t");
        for(DataBouy d:data){
            d.print();
        }
    }

    public static void loadData(String inputFile, DataBouy []data) throws IOException{
        Scanner inputed = new Scanner(new FileInputStream(inputFile));
        for(int i=0;i<data.length;i++){
            String [] info = inputed.nextLine().split(",");
            DataBouy info1 = new DataBouy(info[0],Integer.parseInt(info[1]),Integer.parseInt(info[2]), Double.parseDouble(info[3]),Double.parseDouble(info[4]));
            data[i] = info1;
        }
        inputed.close();
    }

    public static float calculateAvgWaterTemp(DataBouy[] data) {
        float sum=0,ave;
        for(DataBouy d:data){
            sum +=d.waterTemperature;
        }
        ave = sum/25;
        return ave;
    }

    public static void printMap(DataBouy[] data, float avg_water_temp) {
        String [][] map = new String [21][21];
        for(int i=0;i<map.length;i++){
            for(int j=0;j<map.length;j++){
                map[i][j] = "~";
            }
        }
        map [10][10] = "N";
        for(DataBouy d : data){
            if((float)d.waterTemperature > avg_water_temp){
                map[20-(d.latitude+10)][(20-(d.longitude+10))] = "H";
            }
            else if((float)d.waterTemperature < avg_water_temp){
                map[20-(d.latitude+10)][20-(d.longitude+10)] = "C";
            }
            else if((float)d.waterTemperature == avg_water_temp){
                map[20-(d.latitude+10)][20-(d.longitude+10)] = "A";
            }
        }
        for(int i=0;i<map.length;i++){
            System.out.println();
            for(int j=0;j<map.length;j++){
                System.out.print(map[i][j]);
            }
        }
    }

}

class DataBouy {

    public String buoyID;
    public int latitude;
    public int longitude;
    public double airTemperature;
    public double waterTemperature;

    public DataBouy(){

    }

    public DataBouy(String buoyID, int latitude, int longitude, double airTemperature, double waterTemperature){
        this.buoyID = buoyID;
        this.latitude = latitude;
        this.longitude = longitude;
        this.airTemperature = airTemperature;
        this.waterTemperature = waterTemperature;
    }

    public void print(){
        System.out.printf("\n%-14s%-4d%-4d%-8.2f%-8.2f",buoyID,latitude,longitude,airTemperature,waterTemperature);
    }

}
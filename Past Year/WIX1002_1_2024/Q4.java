//DynamicClassroomSeatingPlanAnalyzer
public class DynamicClassroomSeatingPlanAnalyzer {

    public static int[][] initializeSeatingPlan(){
        Random r = new Random();
        //declare the seat space
        int [][] seatPlan = new int [5][5];
        //initialize the seat space with randomly generate number 0 and 1 using nested for loop
        for (int i=0; i<seatPlan.length; i++){
            for (int j = 0; j < seatPlan[i].length; j++) {
                seatPlan[i][j] = r.nextInt(0,2);
            }
        }

        return seatPlan;
    }

    public static void analyzeSeating(int seatPlan[][]){
        //declare and initialize the max value, counter and flag
        int counter=0;
        int max = 0;
        int flag = 0;
        //identify the occupied seat for each row
        for (int i=0; i<seatPlan.length; i++){
            counter = 0;
            //identify the occupied seat for each column and calculate the total
            for (int j = 0; j < seatPlan[i].length; j++) {
                if(seatPlan[i][j] == 1){
                    counter++;
                }
            }
            //identify the row with the most occupied seat
            if(max < counter){
                max = counter;
                flag = i+1; //plus one to obtain the actual row
            }
        }
        System.out.println("Total Occupied Seats: " + counter);
        System.out.println("Row with Most Occupied Seats: Row " + flag);
        System.out.print("Seating Plan: ");

        //print out the entire seating plan
        for (int i=0; i<seatPlan.length; i++){
            System.out.println();
            for (int j = 0; j < seatPlan[i].length; j++) {
                System.out.print(seatPlan[i][j] + " ");
            }
        }

    }
}

//Main class
public class Main extends DynamicClassroomSeatingPLanAnalyzer{
    public static void main(String[]args){
        int [][] seatPlan = initializeSeatingPlan();
        analyzeSeating(seatPlan);
    }
}
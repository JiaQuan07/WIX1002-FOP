import java.util.*;

public class L3Q6 {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter radius of a circle: ");
        int r = obj.nextInt();
        System.out.println("Enter a coordinate point x and y");
        int x = obj.nextInt();
        int y = obj.nextInt();

        double distancesquare = x*x + y*y;
        double distanceradius = r*r;

        if(distancesquare > distanceradius){
            System.out.println("The coordinate is outside the circle.");
        }
        else if (distancesquare == distanceradius){
            System.out.println("The coordinate is on the circle.");
        }
        else if(distancesquare < distanceradius){
            System.out.println("The coordinate is inside the circle");
        }
    }
}
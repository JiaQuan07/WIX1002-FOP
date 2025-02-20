import java.util.*;
public class L2Q4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of seconds : ");
        int s = obj.nextInt();
        double h = s/3600;
        int hour = (int)h;
        double min = (s/60)-(hour*60);
        int minute = (int)min;
        int second = s - (hour*60*60) - (minute*60);
        System.out.println(s + " seconds is " + hour +" hours, " + minute + " minutes and " + second + " seconds");
    }
}
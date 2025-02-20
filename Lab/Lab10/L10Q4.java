//Searchable.java
public interface Searchable {

    public boolean search(int dateStarttime,int dateEndtime);

}

//Appointment.java
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Appointment {

    private int day;
    private int month;
    private int year;
    private int startTime;
    private int endTime;

    public Appointment(int day,int month, int year,int startTime,int endTime){
        this.day = day;
        this.month = month;
        this.year = year;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public boolean search(int searchStartTime, int searchEndTime) {
        if (searchStartTime >= this.startTime && searchStartTime < this.endTime) {
            return false;
        }
        if (searchEndTime > this.startTime && searchEndTime <= this.endTime) {
            return false;
        }
        return true;
    }

    public void saveAppointment(String fileName) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
            writer.println(this.day + "/" + this.month + "/" + this.year + " " + this.startTime + "-" + this.endTime);
        }
    }
}

//TesterAppointment.java
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TesterAppointment {
    public static void main(String[] args) throws IOException {
        List<Appointment> appointments = new ArrayList<>();

        Appointment appointment1 = new Appointment(25, 12, 2024, 9, 11);
        Appointment appointment2 = new Appointment(25, 12, 2024, 14, 16);
        Appointment appointment3 = new Appointment(26, 12, 2024, 10, 12);

        appointments.add(appointment1);
        appointments.add(appointment2);
        appointments.add(appointment3);

        for (Appointment appointment : appointments) {
            appointment.saveAppointment("appointments.txt");
        }

        int searchStartTime = 13;
        int searchEndTime = 15;

        boolean isAvailable = true;
        for (Appointment appointment : appointments) {
            if (!appointment.search(searchStartTime, searchEndTime)) {
                isAvailable = false;
                break;
            }
        }

        if (isAvailable) {
            System.out.println("The time slot from " + searchStartTime + " to " + searchEndTime + " is available.");
            Appointment newAppointment = new Appointment(25, 12, 2024, searchStartTime, searchEndTime);
            newAppointment.saveAppointment("appointments.txt");
        } else {
            System.out.println("The time slot from " + searchStartTime + " to " + searchEndTime + " is already taken.");
        }
    }
}
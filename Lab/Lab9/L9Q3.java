//PersonProfile.java
public class PersonProfile {
    private String name;
    private char gender;
    private String DateOfBirth;

    protected PersonProfile(String name,char gender,String DateOfBirth){
        this.name = name;
        this.gender = gender;
        this.DateOfBirth = DateOfBirth;
    }

    protected void display(){
        System.out.println("Name : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Date of Birth : " + DateOfBirth);
    }
}

//Lecturer.java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lecturer extends PersonProfile{

    private String filename;
    private List<String>courseName;
    private List<String>courseCode;
    private List<Integer>Session;
    private List<Integer>Semester;
    private List<Integer>CreditHour;
    private List<Integer>NumOfStudent;

    public Lecturer(String name, char gender, String DateOfBirth,String filename) {
        super(name, gender, DateOfBirth);
        this.filename = filename;
        courseName = new ArrayList<>();
        courseCode = new ArrayList<>();
        Session = new ArrayList<>();
        Semester = new ArrayList<>();
        CreditHour = new ArrayList<>();
        NumOfStudent = new ArrayList<>();
        loadCourseDetails(filename);
    }

    private void loadCourseDetails(String filename) {
        try {
            Scanner scanner = new Scanner(new FileInputStream(filename));
            while (scanner.hasNextLine()) {
                try {
                    String courseCodes = scanner.nextLine();
                    String courseNames = scanner.nextLine();
                    int sessions = Integer.parseInt(scanner.nextLine());
                    int semesters = Integer.parseInt(scanner.nextLine());
                    int creditHour = Integer.parseInt(scanner.nextLine());
                    int numberofstudent = Integer.parseInt(scanner.nextLine());

                    courseName.add(courseNames);
                    courseCode.add(courseCodes);
                    Session.add(sessions);
                    Semester.add(semesters);
                    CreditHour.add(creditHour);
                    NumOfStudent.add(numberofstudent);

                } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    System.out.println("Invalid data format in file. Skipping entry.");
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    public double getCreditHour(int number){
        if(number >=150){
            return 3;
        }
        else if(number >=100){
            return 2;
        }
        else if(number>=50){
            return 1.5;
        }
        else{
            return 1;
        }
    }

    @Override
    public void display(){
        super.display();
        System.out.println("\nCourse details: ");
        for(int i=0;i<courseName.size();i++){
            System.out.printf("Course Name: %s\nCourse Code: %s\nSemester: %d\nSession: %d\nCredit Hour: %s\nNumber of student: %s\n\n",
                    courseName.get(i), courseCode.get(i), Session.get(i), Semester.get(i), CreditHour.get(i)*getCreditHour(NumOfStudent.get(i)), NumOfStudent.get(i));
        }
    }
}

//Testlecturer.java
public class TestLecturer {
    public static void main(String[]args){
        Lecturer lecturer = new Lecturer("Teacher",'M',"11/2/1990","lecturer.txt");
        lecturer.display();
    }
}
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

//Student.java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends PersonProfile{
    private String filename;
    private List<String> courseNames;
    private List<String> courseCodes;
    private List<Integer> marks;
    private List <Integer>Semester;
    private List <Integer>session;

    public Student(String name, char gender, String DateOfBirth, String filename){
        super(name,gender,DateOfBirth);
        courseNames = new ArrayList<>();
        courseCodes = new ArrayList<>();
        marks = new ArrayList<>();
        Semester = new ArrayList<>();
        session = new ArrayList<>();
        loadCourseDetails(filename);
    }

    private void loadCourseDetails(String filename) {
        try {
            Scanner scanner = new Scanner(new FileInputStream(filename));
            while (scanner.hasNextLine()) {
                try {
                    String courseCode = scanner.nextLine();
                    String courseName = scanner.nextLine();
                    int sessions = Integer.parseInt(scanner.nextLine());
                    int semesters = Integer.parseInt(scanner.nextLine());
                    int mark = Integer.parseInt(scanner.nextLine());

                    courseNames.add(courseName);
                    courseCodes.add(courseCode);
                    session.add(sessions);
                    Semester.add(semesters);
                    marks.add(mark);
                } catch (NumberFormatException | IndexOutOfBoundsException e) {
                    System.out.println("Invalid data format in file. Skipping entry.");
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    public String getGrade(int mark) {
        if (mark >= 85) return "A";
        else if (mark >= 75) return "A-";
        else if (mark >= 70) return "B+";
        else if (mark >= 65) return "B";
        else if (mark >= 60) return "B-";
        else if (mark >= 55) return "C+";
        else if (mark >= 50) return "C";
        else if (mark >= 45) return "D";
        else if (mark >= 35) return "E";
        else return "F";
    }

    @Override
    public void display() {
        super.display();
        System.out.println("\nCourse Details:");
        for (int i = 0; i < courseNames.size(); i++) {
            System.out.printf("Course Name: %s\nCourse Code: %s\nSemester: %d\nSession: %d\nMark: %s\nGrade: %s\n\n",
                    courseNames.get(i), courseCodes.get(i), session.get(i), Semester.get(i), marks.get(i), getGrade(marks.get(i)));
        }
    }

}

//TesterStudent.java
import java.io.FileNotFoundException;

public class TesterStudent {
    public static void main(String[]args) throws FileNotFoundException{
        Student student = new Student("Peter",'M',"11-11-2005", "course.txt");
        student.display();
    }
}
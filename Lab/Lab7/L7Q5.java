import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NameList{
    String name;
    int age;
    char gender;

    public NameList(String name,int age,char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String nameDetails(){
        return this.name + ", " + this.age + ", " + this.gender;
    }
}

public class Q5 {
    public static void main(String[]args){

        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("person.dat"));
            int number = input.readInt();
            System.out.println("The number of record is " + number);

            ArrayList <NameList> namelist = new ArrayList<>();
            for(int i=0;i<number;i++){
                String name = input.readUTF();
                int age = input.readInt();
                char gender = input.readChar();
//              System.out.println(name + ", " + age + ", " + gender);
                NameList listname = new NameList(name,age,gender);
                namelist.add(listname);
            }
            Collections.sort(namelist, Comparator.comparing(nameList -> nameList.name));
            for(NameList listing : namelist){
                System.out.println(listing.nameDetails());
            }

        }
        catch(IOException e){
            System.out.println("Error");
        }
    }
}
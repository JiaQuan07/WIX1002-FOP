//Question 2(a)
//Book.java
public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getYearPublished(){
        return yearPublished;
    }
}

// Main class
public class Q2a{
    public static void main(String[]args){
        Book book1 = new Book("Goblin", "little", 2014);
        Book book2 = new Book("The small seven", "little", 2023);
        Book book3 = new Book("Little Prince", "little", 2020);

        System.out.println("The title of the book: " + book1.getTitle());
        System.out.println("The author of the book: " + book1.getAuthor());
        System.out.println("The year published of the book: " + book1.getYearPublished());
        System.out.println();
        System.out.println("The title of the book: " + book2.getTitle());
        System.out.println("The author of the book: " + book2.getAuthor());
        System.out.println("The year published of the book: " + book2.getYearPublished());
        System.out.println();
        System.out.println("The title of the book: " + book3.getTitle());
        System.out.println("The author of the book: " + book3.getAuthor());
        System.out.println("The year published of the book: " + book3.getYearPublished());
        System.out.println();

    }
}

//Question 2(b)
import java.util.Scanner;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class Q2b {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Please enter your age: ");
            int age = scanner.nextInt();
            checkAge(age);
        }
        catch(InvalidAgeException e){
            System.out.println("Exception Caught : " + e.getMessage());
        }
    }

    public static void checkAge(int age) throws InvalidAgeException{
        if(age>18){
            System.out.println("Age is valid");
        }
        else{
            throw new InvalidAgeException("Your age is below 18 years old!");
        }
    }
}

//Question 2(c)

//Playable.java
public interface Playable {
    public void play();
}

//Guitar.java
public class Guitar implements Playable{
    @Override
    public void play(){
        System.out.println("Playing guitar!");
    }
}

//Piano.java
public class Piano implements Playable{
    @Override
    public void play(){
        System.out.println("Playing piano!");
    }
}

//Main class
public class Q2c {
    public static void main(String[]args){
        Playable [] instruments = new Playable[2];
        instruments[0] = new Guitar();
        instruments[1] = new Piano();
        for(Playable play:instruments){
            play.play();
        }
    }
}


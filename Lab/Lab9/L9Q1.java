//Shape.java
public class Shape {
    protected String name;
    protected double perimeter;
    protected double area;
    protected double volume;

    public Shape(String name){
        this.name = name;
    }

    public void setPerimeter(double perimeter){
        this.perimeter = perimeter;
    }

    public void setArea(double Area){
        this.area = Area;
    }

    public double getPerimeter(){
        return perimeter;
    }

    public double setArea(){
        return area;
    }

    public String display(){
        return String.format ("The name of the shape is %s\nThe perimeter of the shape is %.2f\nThe area of the shape is %.2f\n", name, perimeter, area);
    }

    public String displayCyclinder(){
        return String.format ("The name of the shape is %s\nThe volume of the shape is %.2f\nThe area of the shape is %.2f\n", name, volume, area);
    }
}

//Rectangle.java
import java.util.Scanner;

public class Rectangle extends Shape{
    Scanner scanner = new Scanner(System.in);
    private double length;
    private double width;

    public Rectangle(String name){
        super(name);
    }

    public void input(){
        System.out.print("Enter the length of the rectangle : ");
        length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle : ");
        width = scanner.nextDouble();
    }

    public void Perimeter(){
        perimeter = length*2 + width*2;
    }

    public void Area(){
        area = length*width;
    }
}

//Square.java
import java.util.Scanner;

public class Square extends Shape{
    Scanner scanner = new Scanner(System.in);
    private double length;

    public Square(String name){
        super(name);
    }

    public void input(){
        System.out.print("Enter the length of the square : ");
        length = scanner.nextDouble();
    }

    public void Perimeter(){
        perimeter = length*4;
    }

    public void Area(){
        area = length*length;
    }
}

//Circle.java
import java.util.Scanner;

public class Circle extends Shape{
    private double diameter;
    Scanner scanner = new Scanner(System.in);

    public Circle(String name){
        super(name);
    }

    public void input(){
        System.out.print("Enter the diameter of the circle : ");
        diameter = scanner.nextDouble();
    }

    public void Perimeter(){
        perimeter = 2*Math.PI*(diameter/2);
    }

    public void Area(){
        area = Math.PI*(diameter/2)*(diameter/2);
    }
}

//TesterShape.java
public class TesterShape {
    public static void main(String []args){
        Rectangle rec = new Rectangle("Rectangle");
        rec.input();
        rec.Area();
        rec.Perimeter();
        System.out.println(rec.display());

        Square sqr = new Square("Square");
        sqr.input();
        sqr.Area();
        sqr.Perimeter();
        System.out.println(sqr.display());

        Circle cir = new Circle("Circle");
        cir.input();
        cir.Area();
        cir.Perimeter();
        System.out.println(cir.display());

        Cyclinder cyclinder = new Cyclinder("Cyclinder");
        cyclinder.input();
        cyclinder.Area();
        cyclinder.Volume();
        System.out.println(cyclinder.displayCyclinder());
    }
}
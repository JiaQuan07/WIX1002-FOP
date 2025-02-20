//Fruit.java
public abstract class Fruit {

    private String name;
    private String type;

    public Fruit(){

    }

    public Fruit(String name, String type){
        this.name = name;
        this.type = type;
    }

    public abstract double totalPrice();

    public String toString(){
        return "Name : " + name + "\nType : " + type;
    }

    public String getType(){
        return type;
    }
}

//Apple.java
public class Apple extends Fruit {

    private int numOfApple;

    public Apple(String name, String type, int num){
        super(name,type);
        this.numOfApple = num;
    }

    @Override
    public double totalPrice(){
        if(getType().equalsIgnoreCase("Green")){
            return 1.2*numOfApple;
        }
        else if(getType().equalsIgnoreCase("Red")){
            return 1.8*numOfApple;
        }
        return 0;
    }

    @Override
    public String toString(){
        return super.toString() + "\nQuantity : " + numOfApple + "\nTotal Price : " + totalPrice();
    }
}

//Watermelon.java
public class Watermelon extends Fruit {

    private double weight;

    public Watermelon(String name, String type, double num){
        super(name,type);
        this.weight = num;
    }

    @Override
    public double totalPrice(){
        if(getType().equalsIgnoreCase("Local")){
            if(weight<2){
                return weight*2.25;
            }
            else if(weight<=5){
                return weight*1.95;
            }
            else if(weight>5){
                return weight*1.65;
            }
        }
        else if(getType().equalsIgnoreCase("Imported")){
            if(weight<2){
                return weight*3.75;
            }
            else if(weight<=5){
                return weight*3.45;
            }
            else if(weight>5){
                return weight*3.15;
            }
        }
        return 0;
    }

    @Override
    public String toString(){
        return super.toString() + "\nWeight : " + weight + "\nTotal Price : " + totalPrice();
    }
}

//Main class
public class Main {
    public static void main(String[] args) {
        Apple a = new Apple("Aplpe","Red", 8);
        Apple b = new Apple("Apple", "Green", 11);
        Watermelon c = new Watermelon("Watermelon","Local", 7.6);
        Watermelon d = new Watermelon("Watermelon","Imported", 4.0);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());

        System.out.println("The cheapest item is");
        if(a.totalPrice()<b.totalPrice() && a.totalPrice()<c.totalPrice() &&
                a.totalPrice()<d.totalPrice())
            System.out.println(a.toString());
        else if(b.totalPrice()<c.totalPrice() && b.totalPrice()<d.totalPrice())
            System.out.println(b.toString());
        else if(c.totalPrice()<d.totalPrice())
            System.out.println(c.toString());
        else
            System.out.println(d.toString());
    }
}
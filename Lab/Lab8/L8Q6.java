public class Burger {

    private String BurgerID;
    private int Number;
    private static int total;

    public Burger(String BurgerID){
        this.BurgerID = BurgerID;
        this.Number = 0;
    }

    public void sold(int burgersold){
        Number = burgersold;
        total += burgersold;
    }

    public void display(){
        System.out.println("The burger sell by " + BurgerID + " is " + Number);
    }

    public void displayTotal(){
        System.out.println("The total burger sold is " + total);
    }
}

public class Q6 {
    public static void main(String[]args){
        Burger a = new Burger("2400");
        Burger b = new Burger("2401");
        Burger c = new Burger("2402");

        a.sold(80);
        b.sold(400);
        c.sold(250);

        a.display();
        b.display();
        c.display();

        a.displayTotal();
    }
}
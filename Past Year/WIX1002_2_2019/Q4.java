//Pizza.java
public class Pizza {

    private String size;
    private int numOfCheeseTopping, numOfBeefTopping, numOfChickenTopping;

    public Pizza(){
    }

    public Pizza(String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping){
        this.size = size;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }

    public String getSize(){
        return size;
    }

    public int getNumOfCheeseTopping(){
        return numOfCheeseTopping;
    }

    public int getNumOfChickenTopping(){
        return numOfChickenTopping;
    }

    public int getNumOfBeefTopping(){
        return numOfBeefTopping;
    }

    public void setSize(String size){
        this.size = size;
    }

    public void setNumOfCheeseTopping(int numOfCheeseTopping){
        this.numOfCheeseTopping = numOfCheeseTopping;
    }

    public void setNumOfChickenTopping(int numOfChickenTopping){
        this.numOfChickenTopping = numOfChickenTopping;
    }

    public void setNumOfBeefTopping(int numOfBeefTopping){
        this.numOfBeefTopping = numOfBeefTopping;
    }

    public double computeCost(){
        int numOfTopping = numOfCheeseTopping + numOfChickenTopping + numOfBeefTopping;
        if(size.equalsIgnoreCase("small")){
            return 10 + 2*numOfTopping;
        }
        else if(size.equalsIgnoreCase("medium")){
            return 12 + 2*numOfTopping;
        }
        else if(size.equalsIgnoreCase("large")){
            return 14 + 2*numOfTopping;
        }
        return 0;
    }

    public void display(){
        System.out.println("The size of pizza : " + size);
        System.out.println("The number of cheese topping : " + numOfCheeseTopping);
        System.out.println("The number of chicken topping : " + numOfChickenTopping);
        System.out.println("The number of beef topping : " +  numOfBeefTopping);
        System.out.println("The total cost of the pizza : $" + computeCost());
    }
}

//Main class
public class Main {
    public static void main(String[]args){
        Pizza a = new Pizza("Large",1,1,1);
        a.display();
    }
}
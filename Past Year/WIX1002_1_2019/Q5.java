//Delivery.java
public class Delivery {

    private String sender;
    private String recipient;
    private double weight;

    public Delivery(){

    }

    public Delivery(String sender, String recipient, double weight){
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    public void setReceipt(String recipient){
        this.recipient = recipient;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public String getSender(){
        return sender;
    }

    public String getRecipient(){
        return recipient;
    }

    public double getWeight(){
        return weight;
    }

    public double totalCost(){
        double total = 0;
        if(weight<=5){
            total = weight*2.8;
        }
        else if(weight<=20){
            total = (weight-5)*5.2 + 14;
        }
        else if(weight<=50){
            total = (weight-20)*7 + 92;
        }
        else if(weight>50){
            total = 302 + (weight-50)*8.60;
        }
        return total;
    }

    public String toString() {
        return  "From : " + sender +  " " +
                "To: " + recipient + '\n' +
                "Weight of Package : " + String.format("%.1f", weight) + " kg\n" +
                "Shipping Cost : RM" + String.format("%.2f", totalCost());
    }
}

//SpecialDelivery.java
public class SpecialDelivery extends Delivery{

    private boolean weekendDelivery;
    private boolean nightTimeDelivery;

    public SpecialDelivery(){

    }

    public SpecialDelivery(String a,String b,double c,boolean d,boolean e){
        super(a,b,c);
        this.weekendDelivery = d;
        this.nightTimeDelivery = e;
    }

    @Override
    public double totalCost(){
        double total = super.totalCost();
        if(weekendDelivery == true){
            total += 50;
        }
        if(nightTimeDelivery == true){
            total += total*0.2;
        }
        return total;
    }

    public String toString(){
        String output = super.toString() + '\n';

        if(weekendDelivery)
            output += "Weekend Delivery\n";
        if(nightTimeDelivery)
            output += "Night Time Delivery\n";
        return output;
    }

}

//Main class
public class Main {
    public static void main(String[] args) {
        SpecialDelivery a = new SpecialDelivery("Ali","Ahmad",4.4,false,false);
        SpecialDelivery b = new SpecialDelivery("Ah Chong","Fatimah",63.1,false,false);
        SpecialDelivery c = new SpecialDelivery("FSKTM, UM","FK, UM",32.5,true,false);
        SpecialDelivery d = new SpecialDelivery("Ang","Liew",19.0,true,true);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());

        double totalCost = a.totalCost() + b.totalCost() + c.totalCost() + d.totalCost();
        System.out.printf("The total shipping cost is RM %.2f%n",totalCost);
    }
}
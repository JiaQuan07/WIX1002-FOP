//Employee.java
public abstract class Employee {

    protected String name;
    protected String type;
    protected double totalSalary;

    public abstract double calSalary();

    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Type : " + type);
        System.out.println("Total Salary : " + calSalary());
        System.out.println();
    }
}

//PermanentEmployee.java
public class PermanentEmployee extends Employee{

    private String category;

    public PermanentEmployee(String name, String category){
        this.name = name;
        this.category = category;
        this.type = "Permanent Employee";
    }

    @Override
    public double calSalary(){
        return switch (category) {
            case "A" -> 4000;
            case "B" -> 3000;
            case "C" -> 2000;
            default -> 0;
        };
    }
}

//TemporaryStaff.java
public class TemporaryStaff extends Employee{

    private int workHour;

    public TemporaryStaff(String name, int workHour){
        this.name = name;
        this.workHour= workHour;
        this.type = "Temporary Staff";
    }

    @Override
    public double calSalary(){
        double total = 15*workHour;
        return total;
    }
}

//ContractEmployee.java
public class ContractEmployee extends Employee{

    private double sales;

    public ContractEmployee(String name, double sales){
        this.name = name;
        this.sales = sales;
        this.type = "Contract Employee";
    }

    @Override
    public double calSalary(){
        double total = 500 + sales*0.5;
        return total;
    }
}

//EmployeeTester.java
public class EmployeeTester {
    public static void main(String []args){

        Employee permanent = new PermanentEmployee("Adam","A");
        Employee contract = new ContractEmployee("Adam",5000.0);
        Employee temporary = new TemporaryStaff("Adam",300);

        permanent.display();
        contract.display();
        temporary.display();

    }
}
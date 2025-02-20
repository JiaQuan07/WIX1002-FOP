public class Bank {
    private String name;
    private int IC_or_Passport;
    private double balance;

    public Bank(String name, int IC_or_Passport, double deposit){
        this.name  = name;
        this.IC_or_Passport = IC_or_Passport;
        this.balance = deposit;
    }

    public void deposit(double deposit){
        System.out.println("You have deposit : " + deposit);
        balance = balance + deposit;
    }

    public void withdraw(double withdraw){
        System.out.println("You have withdraw : " + withdraw);
        balance = balance - withdraw;
    }

    public void checkBalance(){
        System.out.println("Your current balance : " + balance);
    }
}

import java.util.Scanner;
public class Q2 {
    public static void main(String []args){
        Bank bank = null;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("What do you want to do?");
            System.out.println("1. Open an account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("choice : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your IC or Passport Number: ");
                    int IC = scanner.nextInt();
                    System.out.print("Enter your deposit amount: ");
                    double deposit = scanner.nextInt();
                    bank = new Bank(name,IC,deposit);
                    break;

                case 2:
                    if (bank == null) {
                        System.out.println("You need to open an account first.");
                        break;
                    }
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAmount);
                    break;

                case 3:
                    if (bank == null) {
                        System.out.println("You need to open an account first.");
                        break;
                    }
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAmount);  // Withdraw the amount
                    break;

                case 4:
                    if (bank == null) {
                        System.out.println("You need to open an account first.");
                        break;
                    }
                    bank.checkBalance();
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
            System.out.println();
        }
    }
}
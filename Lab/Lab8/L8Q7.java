public class Money {
    private double amount;

    public double roundAmount(double amount) {
        int cents = (int) (amount * 100);

        if(cents % 10 == 1 || cents % 10 == 2){
            cents = (cents/10) *10;
        }
        else if(cents % 10 == 3 || cents % 10 == 4 || cents % 10 == 6 || cents % 10 == 7){
            cents = (cents/10) *10 + 5;
        }
        else if(cents % 10 == 8 || cents % 10 == 9){
            cents = (cents/10)*10 + 10;
        }

        return cents / 100.0;
    }

    public Money(double amount){
        this.amount = roundAmount(amount);
    }

    public void calculateNotesAndCoins() {
        int remainingAmount = (int) (this.amount * 100);
        System.out.println("Amount: RM" + this.amount);

        int[] notesAndCoins = {10000, 5000, 1000, 500, 100, 50, 20, 10, 5};  // In cents
        String[] denominations = {"RM100", "RM50", "RM10", "RM5", "RM1", "50c", "20c", "10c", "5c"};

        for (int i = 0; i < notesAndCoins.length; i++) {
            int count = remainingAmount / notesAndCoins[i];
            remainingAmount = remainingAmount % notesAndCoins[i];
            if (count > 0) {
                System.out.println(denominations[i] + ": " + count);
            }
        }
    }

    public Money add(Money other) {
        return new Money(this.amount + other.amount);
    }

    public Money subtract(Money other) {
        return new Money(this.amount - other.amount);
    }

    public void displayAmount() {
        System.out.println("Amount: RM" + this.amount);
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first amount: ");
        double amount1 = scanner.nextDouble();
        Money money1 = new Money(amount1);

        System.out.print("Enter the second amount: ");
        double amount2 = scanner.nextDouble();
        Money money2 = new Money(amount2);

        System.out.println("\nMoney 1: ");
        money1.calculateNotesAndCoins();

        System.out.println("\nMoney 2: ");
        money2.calculateNotesAndCoins();

        Money sum = money1.add(money2);
        System.out.println("\nSum of Money 1 and Money 2 (After Rounding):");
        sum.calculateNotesAndCoins();

        Money difference = money1.subtract(money2);
        System.out.println("\nDifference between Money 1 and Money 2 (After Rounding):");
        difference.calculateNotesAndCoins();
    }
}
import java.util.Scanner;

class Account {
    String name;
    int accNo;
    String accType;
    double balance;

    Account(String name, int accNo, String accType, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.accType = accType;
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println("Amount deposited successfully");
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavAcct extends Account {
    double rate = 0.05;

    SavAcct(String name, int accNo, double balance) {
        super(name, accNo, "Savings", balance);
    }

    void computeInterest() {
        double interest = balance * rate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurAcct extends Account {
    double minBalance = 1000;
    double serviceCharge = 100;

    CurAcct(String name, int accNo, double balance) {
        super(name, accNo, "Current", balance);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            if (balance < minBalance) {
                balance -= serviceCharge;
                System.out.println("Minimum balance not maintained");
                System.out.println("Service charge imposed: " + serviceCharge);
            }
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String name = sc.nextLine();

        System.out.println("Enter account number:");
        int accNo = sc.nextInt();

        System.out.println("Enter initial balance:");
        double balance = sc.nextDouble();

        System.out.println("Select account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int choice = sc.nextInt();

        if (choice == 1) {
            SavAcct s = new SavAcct(name, accNo, balance);
            s.deposit(2000);
            s.computeInterest();
            s.withdraw(1500);
            s.displayBalance();
        } else {
            CurAcct c = new CurAcct(name, accNo, balance);
            c.deposit(3000);
            c.withdraw(4500);
            c.displayBalance();
        }
    }
}

import java.util.Scanner;

class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    void display() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}

class Sav_acct extends Account {

    void deposit(Scanner sc) {
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        balance += amount;
    }

    void withdraw(Scanner sc) {
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
        }
    }

    void computeInterest(Scanner sc) {
        System.out.print("Enter rate of interest: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time period (years): ");
        int time = sc.nextInt();

        double interest = balance * Math.pow((1 + rate / 100), time) - balance;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

class Cur_acct extends Account {
    final double minBalance = 500;
    final double serviceCharge = 100;

    void deposit(Scanner sc) {
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        balance += amount;
    }

    void withdraw(Scanner sc) {
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            checkMinBalance();
        }
    }

    void checkMinBalance() {
        if (balance < minBalance) {
            balance -= serviceCharge;
            System.out.println("Balance below minimum. Service charge imposed: " + serviceCharge);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sav_acct sav = new Sav_acct();
        Cur_acct cur = new Cur_acct();

        System.out.println("Enter Savings Account Details");
        System.out.print("Customer Name: ");
        sav.customerName = sc.next();
        System.out.print("Account Number: ");
        sav.accountNumber = sc.nextInt();
        sav.accountType = "Savings";
        sav.balance = 0;

        System.out.println("\nEnter Current Account Details");
        System.out.print("Customer Name: ");
        cur.customerName = sc.next();
        System.out.print("Account Number: ");
        cur.accountNumber = sc.nextInt();
        cur.accountType = "Current";
        cur.balance = 0;

        int choice;
        do {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Compute Interest (Savings)");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account type (savings/current): ");
                    String type = sc.next();
                    if (type.equalsIgnoreCase("savings"))
                        sav.deposit(sc);
                    else
                        cur.deposit(sc);
                    break;

                case 2:
                    System.out.print("Enter account type (savings/current): ");
                    type = sc.next();
                    if (type.equalsIgnoreCase("savings"))
                        sav.withdraw(sc);
                    else
                        cur.withdraw(sc);
                    break;

                case 3:
                    sav.computeInterest(sc);
                    break;

                case 4:
                    System.out.print("Enter account type (savings/current): ");
                    type = sc.next();
                    if (type.equalsIgnoreCase("savings"))
                        sav.display();
                    else
                        cur.display();
                    break;

                case 5:
                    System.out.println("Thank you");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }
}

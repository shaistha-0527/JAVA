import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class Father {
    int fatherAge;

    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father's age cannot be negative");
        }
        fatherAge = age;
    }
}

class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);

        if (sonAge < 0) {
            throw new WrongAge("Son's age cannot be negative");
        }

        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age must be less than father's age");
        }

        this.sonAge = sonAge;
    }
}

public class sonfather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter father's age: ");
        int fAge = sc.nextInt();

        System.out.print("Enter son's age: ");
        int sAge = sc.nextInt();

        try {
            Son obj = new Son(fAge, sAge);
            System.out.println("Son's age is: " + obj.sonAge);
            System.out.println("Father's age is: " + obj.fatherAge);
        } catch (WrongAge e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

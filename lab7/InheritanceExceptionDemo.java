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

        if (sonAge < 0 || sonAge >= fatherAge) {
            throw new WrongAge("Invalid son's age");
        }
        this.sonAge = sonAge;
    }
}

public class InheritanceExceptionDemo {
    public static void main(String[] args) {
        try {
            Son s = new Son(45, 20);
            System.out.println("Father Age: " + s.fatherAge);
            System.out.println("Son Age: " + s.sonAge);
        } catch (WrongAge e) {
            System.out.println(e.getMessage());
        }
    }
}

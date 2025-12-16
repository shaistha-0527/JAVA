import java.util.Scanner;
import CIE.*;
import SEE.*;

public class FinalMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Semester: ");
            int sem = sc.nextInt();

            Internals in = new Internals();
            External ex = new External(usn, name, sem);

            in.getInternalMarks();
            ex.getExternalMarks();

            System.out.println("\nFinal Marks:");
            System.out.println("USN: " + ex.usn);
            System.out.println("Name: " + ex.name);
            System.out.println("Semester: " + ex.sem);

            for (int j = 0; j < 5; j++) {
                int finalMarks = in.internalMarks[j] + ex.externalMarks[j];
                System.out.println("Subject " + (j + 1) + ": " + finalMarks);
            }
        }
    }
}

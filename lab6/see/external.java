package SEE;

import java.util.Scanner;
import CIE.Personal;

public class external extends Personal {
    public int[] externalMarks = new int[5];

    public external(String usn, String name, int sem) {
        super(usn, name, sem);
    }

    public void getExternalMarks() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SEE marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            externalMarks[i] = sc.nextInt();
        }
    }
}

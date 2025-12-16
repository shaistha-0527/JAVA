import java.util.*;

public class student
{
    Scanner sc = new Scanner(System.in);
    String usn;
    String name;
    int count;

    void getStudentDetails()
    {
        System.out.println("Enter name");
        name = sc.nextLine();

        System.out.println("Enter USN");
        usn = sc.next();

        count++;
        getMarks();
    }

    void getMarks()
    {
        System.out.println("Enter number of subjects");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int credit[] = new int[n];
        int grade[] = new int[n];

        System.out.println("Enter marks and credits");

        for (int i = 0; i < n; i++)
        {
            System.out.println("Subject " + (i + 1));
            System.out.println("Enter marks");
            arr[i] = sc.nextInt();

            System.out.println("Enter credit");
            credit[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++)
        {
            grade[i] = (arr[i] / 10) + 1;

            if (grade[i] == 11)
                grade[i] = 10;

            if (grade[i] <= 4)
                grade[i] = 0;
        }

        computeSGPA(grade, credit, n);
    }

    void computeSGPA(int[] grades, int[] credits, int n)
    {
        int score = 0, total = 0;

        for (int i = 0; i < n; i++)
        {
            score += grades[i] * credits[i];
            total += credits[i];
        }

        double sgpa = (double) score / total;

        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("SGPA: " + sgpa);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args)
    {
        student s1 = new student();
        student s2 = new student();

        System.out.println("Calculating for Student 1");
        s1.getStudentDetails();

        System.out.println("Calculating for Student 2");
        s2.getStudentDetails();
    }
}

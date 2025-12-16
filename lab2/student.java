import java.util.*;
public class Student
{    Scanner sc=new Scanner(System.in);
    String sub;
    int credits;
    String usn;
    int grade;
    String name;
    double sgpa;int count;
    void getStudentDetails()
    {
        System.out.println("Enter name");
        this.name=sc.nextLine();
        System.out.println("Enter usn");
        usn=sc.next();
        count++;
        getmarks();
 

    }
    void getmarks()
     {  int arr[]=new int[8];
        int credit[]=new int[8];
        System.out.println("Enter marks and credit for 8 subjects");
        for(int i=0;i<8;i++)
        { System.out.println("Subject "+(i+1)+":");
        System.out.println("Enter marks");
        arr[i]=sc.nextInt();
         System.out.println("Enter credit");
        credit[i]=sc.nextInt();
        }
        int grade[]=new int[8];
         for(int i=0;i<8;i++)
         {
            grade[i]=(arr[i]/10)+1;
            if(grade[i]==11)
            grade[i]=10;
            if(grade[i]<=4)
            grade[i]=0;
         }
         computesgpa(grade,credit);
     }
     void computesgpa(int[] grades,int[] credits)
     {   int score=0;int total=0;
         for(int i=0;i<8;i++)
         {
            score=score+(grades[i]*credits[i]);
            total=total+credits[i];
         }
         double ans=(double)score/(double)total;
         System.out.println("For student "+count+":");
         System.out.println("Name is:"+name);
         System.out.println("USN: "+usn);
         System.out.println("sgpa: "+ans);

     }
    public static void main(String[] args) 
    {  
        
        Student student1=new Student();
        Student student2=new Student();
        System.out.println("Calculating for student 1");
        student1.getStudentDetails();
        System.out.println("Calculating for Student 2");
        student2.getStudentDetails();
        
        
    }

    
}

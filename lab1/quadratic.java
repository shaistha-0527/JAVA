import java.util.*;
public class quadratic 
{
    
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int a,b,c;
        float r1=0;
        float r2=0;
        System.out.println("Enter value of a");
        a=sc.nextInt();
        System.out.println("Enter the value of b");
        b=sc.nextInt();
        System.out.println("Enter the value of c");
        c=sc.nextInt();
        if(a==0)
        System.out.println("Not Quadratic Equation");
        else
        {
        float d=b*b-4*a*c;
        if(d==0)
        {
            r1=(-b)/(2*a);
            System.out.println("Roots are real and equal");
            System.out.println("Root 1 and Root 2: "+r1);
        }
        else if(d>0)
        {
            r1=((-b)+((float)Math.sqrt(d)))/(2*a);
            r2=((-b)-((float)Math.sqrt(d)))/(2*a);
            System.out.println("Roots are real and unequal");
            System.out.println("First root is: "+r1);
            System.out.println("Second root is: "+r2);
        }
        else 
        {
            r1=(-b)/(2*a);
            r2=(float)Math.sqrt(-d)/(2*a);
            System.out.println("Roots are imaginary");
            System.out.println("The first root is: "+r1+"+"+r2+"i");
            System.out.println("The second root is: "+r1+"-"+r2+"i");
        }

        }
        
        
    }
}

import java.util.*;
public class Q1
{
 public static void main(String []args)
    {
        int s=0,n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+i;
        }
        System.out.println("Sum of natural numbers is="+s);

    }
    
}

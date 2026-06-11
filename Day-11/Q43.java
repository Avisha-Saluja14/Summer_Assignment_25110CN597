import java.util.*;
public class Q43 
{
    public static void main(String[]args)
    {
       Scanner sc=new Scanner(System.in);
       int n;
       boolean b;
       System.out.println("Enter the number");
       n=sc.nextInt();
       b=isprime(n);
       if(b==true)
        System.out.println("It is prime");
       else
        System.out.println("It is not prime");
    }
    static boolean isprime(int m)
    {
        int i,c=0;
        for(i=1;i<=m;i++)
        {
            if(m%i==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }
    
}

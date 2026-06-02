import java.util.*;
public class Q5 
{
    public static void main(String []args)
    {
        int n,r,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        System.out.println("Sum of digits is "+s);


    }
}

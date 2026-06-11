import java.util.*;
public class Q41 
{
    public static void main(String[]args)
    {
        int a,b,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        s=sum(a,b);
        System.out.println("Sum of these two numbers is "+ s);
    }
    static int sum(int n,int m)
    {
        int s;
        s=n+m;
        return s;
    }
}

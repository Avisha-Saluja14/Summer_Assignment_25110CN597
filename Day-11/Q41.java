import java.util.*;
public class Q41 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,s;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        s=sum(a,b);
        System.out.println("Sum is "+s);
    }
    static int sum(int n, int m)
    {
        int s;
        s=m+n;
        return s;
    }
    
}

import java.util.*;
public class Q42 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,l;
        System.out.println("Enter first number");
        a=sc.nextInt();
        System.out.println("Enter second number");
        b=sc.nextInt();
        l=max(a,b);
        System.out.println("Maximum number is "+l);
    }
    static int max(int n,int m)
    {
      int l;
      if(n>m)
        l=n;
    else
        l=m;
    return l;
    }
    
}

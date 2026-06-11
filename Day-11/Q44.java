import java.util.*;
public class Q44
{
    public static void main(String[]args)
{
    Scanner sc = new Scanner(System.in);
    int n,f;
    System.out.println("Enter the number");
    n=sc.nextInt();
    f=fac(n);
    System.out.println("Factorial of the number is "+f);
}
static int fac(int m)
{
    int i,f=1;
    for(i=1;i<=m;i++)
    {
      f=f*i;
    }
    return f;
}
}

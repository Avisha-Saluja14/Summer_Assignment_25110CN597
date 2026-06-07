import java.util.*;
public class Q25 {
    public static void main(String[]args)
{
    int n,f;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    n=sc.nextInt();
    f=fact(n);
    System.out.println("Factorial is "+f);
}    
static int fact(int m)
{
    if(m==0)
    {
        return 1;
    }
    else
    {
        return (m*fact(m-1));
    }
}
}

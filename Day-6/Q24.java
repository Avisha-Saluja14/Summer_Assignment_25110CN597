import java.util.*;
public class Q24 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int x,n,i,p=1;
        System.out.println("Enter base number(x)");
        x=sc.nextInt();
        System.out.println("Enter the exponent or power number(n)");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            p=p*x;
        }
        System.out.println("x^n is equals to \n"+p);
    }
    
}

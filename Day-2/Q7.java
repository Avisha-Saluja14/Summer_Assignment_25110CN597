import java.util.*;
public class Q7 {
    public static void main(String[] args)
    {
        int n,r,p=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        while(n!=0)
        {
            r=n%10;
            p=p*r;
            n=n/10;
        }
        System.out.println("Product of digits is "+p);

    }
    
}

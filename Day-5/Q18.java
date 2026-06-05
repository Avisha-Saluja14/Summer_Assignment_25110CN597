import java.util.*;
public class Q18 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,f=1,sum=0,i,n1,r;
        System.out.println("Enter the number");
        n=sc.nextInt();
        n1=n;
        while(n1!=0)
        {
            r=n1%10;
            f=1;
            for(i=1;i<=r;i++)
            {
                f=f*i;
            }
            sum=sum+f;
            n1=n1/10;
        }
        if(sum==n)
            System.out.println("It is a strong number");
        else
            System.out.println("It is not a strong number");
    }
    
}

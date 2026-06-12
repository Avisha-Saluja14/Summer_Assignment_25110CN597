import java.util.*;
public class Q48 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        int n,n1;
        System.out.println("Enter the number");
        n=sc.nextInt();
        n1=perfect(n);
        if(n1==n)
            System.out.println("It is a perfect number");
        else
            System.out.println("It is not a perfect number");
    }
    static int perfect(int n)
    {
    int i,sum=0;
    for(i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
    }
     return sum;
    }

}

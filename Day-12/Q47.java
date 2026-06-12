import java.util.*;
public class Q47 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter number of terms for fibonacci series");
        n=sc.nextInt();
        fibo(n);
    }
    static void fibo(int n)
    {
        int a=0,b=1,sum,i;
        System.out.println("Fibonacci series is");
        System.out.print(a+",");
        System.out.print(b+",");
        sum=a+b;
        for(i=3;i<=n;i++)
        {
            if(i!=n)
           System.out.print(sum+",");
            else
                System.out.print(sum);
           a=b;
           b=sum;
           sum=a+b;
        }
    }
    
}

import java.util.*;
public class Q13 {
public static void main(String[]args)  
{
    int a,b,sum,n,i;
    a=0;
    b=1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number till you want fibonacci series to be generated");
    n=sc.nextInt();
    System.out.println("Fibonacci series till this number is");
    System.out.print(a+",");
    System.out.print(b+",");
    sum=a+b;
    for(i=3;i<=n;i++)
    {
        if(i!=n)
        System.out.print(sum+",");
        if(i==n)
        System.out.print(sum);
        a=b;
        b=sum;
        sum=a+b;
    }
}  
}

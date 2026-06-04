import java.util.*;
public class Q16 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,m,i,num1,num2,c,r;
        double sum;
        System.out.println("Enter lower range");
        n=sc.nextInt();
        System.out.println("Enter upper range");
        m=sc.nextInt();
        System.out.println("Armstrong numbers in this range are");
        for(i=n;i<=m;i++)
        {   
        sum=0.0;
        c=0;
        num1=i;
        num2=i;
        while(num1!=0)
        {
            num1=num1/10;
            c++;
        }
        while(num2!=0)
        {
            r=num2%10;
            sum=sum+ Math.pow(r,c);
            num2=num2/10;
        }
        if(sum==i)
        {
            System.out.println(i);
        }
    }
    }
    
}

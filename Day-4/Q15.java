import java.util.*;
public class Q15 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,num1,num2,c=0,r;
        double sum=0.0;
        System.out.println("Enter the number");
        n=sc.nextInt();
        num1=n;
        num2=n;
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
        if(sum==n)
        {
            System.out.println("It is a armstrong number");
        }
        else{
            System.out.println("It is not an armstrong number");
        }
    }
    
}

import java.util.*;
public class Q27 
{
    public static void main(String[]args)
    {
        int n,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        sum = sumDigit(n);
        System.out.println("Sum of digits is "+sum);
    }
    static int sumDigit(int m)
    {
      if(m==0)
        return 0;
    else
    {
        int d=m%10;
        return d + sumDigit(m/10);
    }  
    }
}

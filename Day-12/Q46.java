import java.util.*;
public class Q46 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        int n1;
        System.out.println("Enter the number");
        n=sc.nextInt();
        n1=armstrong(n);
        if(n1==n)
            System.out.println("It is an armstrong number");
        else
            System.out.println("It is not an armstrong number");
    }
    static int armstrong(int n)
    {
      int m,c=0,r;
      m=n;
      int s=0;
      while(m!=0)
      {
        m=m/10;
        c++;
      }
      while(n!=0)
      {
        r=n%10;
        s=s+(int)Math.pow(r,c);
        n=n/10;
      }
      return s;
    }
    
}

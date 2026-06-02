import java.util.*;
public class Q8
{
    public static void main(String[]args)
    {
        int n,rev=0,r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();
        int num=n;
        while(n!=0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==num)
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");
     

    }
}

import java.util.*;
public class Q28
{
    public static void main(String[]args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        rev(n);
    }
    static void rev(int m)
    {
        if(m==0)
            return;
        else
        {
        int d=m%10;
        System.out.print(d);
        rev(m/10);
        }
    }
}
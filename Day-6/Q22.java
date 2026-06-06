import java.util.*;
public class Q22
{
    public static void main(String[]args)
    {
    Scanner sc = new Scanner(System.in);
    int n,r,c=0;
    double sum=0.0;
    System.out.println("Enter the number in binary");
    n=sc.nextInt();
    while(n!=0)
    {
        r=n%10;
        sum = sum + (r*Math.pow(2,c));
        n=n/10;
        c++;
    }
    System.out.println("Decimal form of the number entered is\n"+(int)sum);
    }
}

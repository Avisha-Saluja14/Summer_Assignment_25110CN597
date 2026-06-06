import java.util.*;
public class Q21 {
    public static void main(String[]args)
    {
      Scanner sc = new Scanner(System.in);
      int n,r;
      String b="";
      System.out.println("Enter number in decimal form");
      n=sc.nextInt();
      while(n!=0)
      {
        r=n%2;
        b = r+b;
        n=n/2;
      }
      System.out.println("Binary form of the entered number is"+b);
    }
}

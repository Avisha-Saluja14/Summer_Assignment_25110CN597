import java.util.*;
public class Q23 {
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
         int n,r,c=0,i;
      String b="";
      char m;
      System.out.println("Enter number in decimal form");
      n=sc.nextInt();
      while(n!=0)
      {
        r=n%2;
        b = r+b;
        n=n/2;
      }
      for(i=0;i<b.length();i++)
      {
        m=b.charAt(i);
        if(m=='1')
            c++;
      }
      System.out.println("Number of set bits in this number is: "+c);
    }
    
}

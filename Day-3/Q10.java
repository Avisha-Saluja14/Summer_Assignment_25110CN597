import java.util.*;
public class Q10 {
    public static void main(String[]args)
    {
int n,c,i,j,m;
Scanner sc = new Scanner(System.in);
System.out.println("Enter lower range");
n=sc.nextInt();
System.out.println("Enter upper range");
m=sc.nextInt();
System.out.println("Prime numbers in this range are given below");
for(i=n;i<=m;i++)
    {
        c=0;
for(j=1;j<=i;j++)
{
    if(i%j==0)
        c++;
}
if(c==2)
{
    System.out.println(i);
}
    }
}
}


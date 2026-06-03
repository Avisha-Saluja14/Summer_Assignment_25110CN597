import java.util.*;
public class Q9 {
    public static void main(String[]args)
{
int n,c=0,i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter number");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
    if(n%i==0)
        c++;
}
if(c==2)
{
    System.out.println("It is a prime number");
}
else{
    System.out.println("It is not a prime number");
}
}
    
}

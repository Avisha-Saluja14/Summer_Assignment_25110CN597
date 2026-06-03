import java.util.*;
public class Q11 {
    public static void main(String[]args)
    {
Scanner sc = new Scanner(System.in);
int A,B,R;
System.out.println("Enter first number");
A=sc.nextInt();
System.out.println("Enter Second number");
B=sc.nextInt();
while(B%A!=0)
{
    R=B%A;
    B=A;
    A=R;
}
System.out.println("HCF is"+A);
    }
    
}



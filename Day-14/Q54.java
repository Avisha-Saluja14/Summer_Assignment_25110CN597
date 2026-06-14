import java.util.*;
public class Q54
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,a,c=0;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter the element");
        a=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(A[i]==a)
            {
                c++;
            }
        }
         System.out.println("Frequency of "+a+" is "+c+ " in the array");
    }
}
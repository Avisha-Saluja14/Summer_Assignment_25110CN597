import java.util.*;
public class Q53
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,flag=0,a;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        System.out.println("Enter number to be searched");
        a=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(A[i]==a)
            {
                System.out.println("Element found at "+(i+1)+" position");
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("Element not found");
        }
    }
}
import java.util.*;
public class Q60
{
    public static void main(String[]args)
    {
        int n,i,j,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
       {
        for(j=0;j<n-1;j++)
       {
        if(A[j]==0)
        {
            temp=A[j];
            A[j]=A[j+1];
            A[j+1]=temp;
        }
       }
       }
       System.out.println("Desired output is");
       for(i=0;i<n;i++)
       {
        System.out.println(A[i]);
       }
    }
}
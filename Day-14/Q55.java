import java.util.*;
public class Q55
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,j,temp;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(i=0;i<(n-1);i++)
        {
            for(j=0;j<(n-1-i);j++)
            {
                if(A[j]>A[j+1])
                {
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
        System.out.println("Second largest element of array is "+A[n-2]);
    }
}
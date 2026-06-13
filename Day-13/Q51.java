import java.util.*;
public class Q51
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,max,min;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        max=A[0];
        min=A[0];
        for(i=0;i<n;i++)
        {
         if(A[i]>max)
            max=A[i];
        if(A[i]<min)
            min=A[i];
        }
        System.out.println("Largest element is "+max);
        System.out.println("Smallest element is "+min);
    }
}
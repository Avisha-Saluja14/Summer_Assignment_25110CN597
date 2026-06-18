import java.util.*;
public class Q70
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
        System.out.println("Sorted array by selection sort is");
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(A[i]>A[j])
                {
                    temp=A[i];
                    A[i]=A[j];
                    A[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(A[i]);
        }
    }
}
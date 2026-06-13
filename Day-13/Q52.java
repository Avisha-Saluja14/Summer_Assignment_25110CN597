import java.util.*;
public class Q52
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i,even=0,odd=0;
        System.out.println("Enter the size of array");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter the array elements");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(A[i]%2==0)
                even++;
            else
                odd++;
        }
        System.out.println("Number of even elements is "+even+"\nNumber of odd elements is "+odd);
    }
}
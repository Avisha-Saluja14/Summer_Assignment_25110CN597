import java.util.*;
public class Q62
{
    public static void main(String[]args)
    {
        int n,i,j,c=0,max,maxf=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter array elements ");
        for(i=0;i<n;i++)
        {
            A[i]=sc.nextInt();
        }
        max=0;
       for(i=0;i<n;i++)
       {
        c=0;
        for(j=0;j<n;j++)
        {
            if(A[i]==A[j])
            {
                if(i==j)
                    continue;
                else
                    c++;
            }
        }
        if(c>max)
        {
            max=c;
            maxf=A[i];
        }
       }
       System.out.println("Element of maximum frequency is "+ maxf);
    }
}
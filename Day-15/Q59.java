import java.util.*;
public class Q59
{
    public static void main(String[] args) {
        
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        } 

        int last = arr[n-1];

        for( i = n-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
     System.out.println("Array shifted towards right by one position is");
        for(i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

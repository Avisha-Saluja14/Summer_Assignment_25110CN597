import java.util.*;
public class Q88
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s,s1="";
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        char ch;
        int i;
        for(i=0;i<(s.length());i++)
        {
            ch=s.charAt(i);
            if(ch==' ')
            {
                continue;
            }
            else
            {
                s1=s1+ch;
            }
        }
        System.out.println("New sentence with removed spaces is");
        System.out.println(s1);
}
}

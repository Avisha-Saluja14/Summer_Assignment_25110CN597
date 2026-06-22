import java.util.*;
public class Q86
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String s;
        int i,c=0;
        char ch;
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        for(i=0;i<(s.length());i++)
        {
            ch=s.charAt(i);
            if(Character.isWhitespace(ch))
                c++;
        }
        System.out.println("Number of words is a sentence is "+ (c+1));
    }
}

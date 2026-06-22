import java.util.*;

public class Q87 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String s = sc.nextLine();

        int i, j, c;

        for(i = 0; i < s.length(); i++) {
            c = 0;

            // Check if character already counted
            for(j = 0; j < i; j++) {
                if(s.charAt(i) == s.charAt(j))
                    break;
            }

            if(j != i)
                continue;

            for(j = 0; j < s.length(); j++) {
                if(s.charAt(i) == s.charAt(j))
                    c++;
            }

            System.out.println(s.charAt(i) + " = " + c);
        }
    }
}
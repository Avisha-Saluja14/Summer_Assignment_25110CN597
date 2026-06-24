import java.util.Scanner;

public class Q95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String word = "";
        String longest = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word = word + ch;
            } else {
                if (word.length() > longest.length()) {
                    longest = word;
                }
                word = "";
            }
        }

        // Check last word
        if (word.length() > longest.length()) {
            longest = word;
        }

        System.out.println("Longest Word: " + longest);
    }
}
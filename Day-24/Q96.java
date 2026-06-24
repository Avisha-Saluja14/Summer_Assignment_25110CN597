import java.util.Scanner;

public class Q96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
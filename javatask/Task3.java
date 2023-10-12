import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase();

        boolean[] ap = new boolean[26];

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                ap[c - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (boolean alphabet : ap) {
            if (!alphabet) {
                isPangram = false;
                break;
            }
        }

        if(isPangram)
            System.out.println("The input is a pangram.");
        else
        System.out.println("The input is not a pangram.");

        scanner.close();
    }
}

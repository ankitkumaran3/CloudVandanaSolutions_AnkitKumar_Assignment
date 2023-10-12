import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        char[] rn = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] values = {1, 5, 10, 50, 100, 500, 1000};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String inputrn = scanner.nextLine().toUpperCase(); 

        int result = 0;
        int prevValue = 0;

        for (int i = inputrn.length() - 1; i >= 0; i--) {
            char currentChar = inputrn.charAt(i);
            int index = 0;

            for (int j = 0; j < rn.length; j++) {
                if (rn[j] == currentChar) {
                    index = j;
                    break;
                }
            }

            int cv = values[index];

            if (cv < prevValue) {
                result -= cv;
            } else {
                result += cv;
            }

            prevValue = cv;
        }

        System.out.println("Integer value of Roman numeral " + inputrn + " is: " + result);

        scanner.close();
    }
}

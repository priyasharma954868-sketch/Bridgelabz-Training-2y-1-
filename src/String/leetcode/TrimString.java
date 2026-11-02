package String.Level2;

import java.util.Scanner;

public class TrimString {

    public static int[] findStartEnd(String text) {

        int start = 0;
        int end = 0;

                while (true) {
            try {
                if (text.charAt(start) != ' ') {
                    break;
                }
                start++;
            } catch (RuntimeException e) {
                break;
            }
        }

        end = start;

        while (true) {
            try {
                text.charAt(end);
                end++;
            } catch (RuntimeException e) {
                break;
            }
        }

        end = end - 1;

        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {

        int count = 0;

        try {
            while (true) {
                str1.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {

        }

        int count2 = 0;

        try {
            while (true) {
                str2.charAt(count2);
                count2++;
            }
        } catch (RuntimeException e) {
            // End of string
        }

        if (count != count2) {
            return false;
        }

        for (int i = 0; i < count; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        int[] startEnd = findStartEnd(text);

        String userTrimmed = createSubstring(
                text, startEnd[0], startEnd[1]);

        String builtInTrimmed = text.trim();

        boolean result = compareStrings(
                userTrimmed, builtInTrimmed);

        System.out.println("\nOriginal String: [" + text + "]");
        System.out.println("User-defined Trim: [" + userTrimmed + "]");
        System.out.println("Built-in Trim: [" + builtInTrimmed + "]");
        System.out.println("Both results are same: " + result);

        sc.close();
    }
}

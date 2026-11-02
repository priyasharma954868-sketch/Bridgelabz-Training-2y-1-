package String.Level2;

import java.util.Scanner;

public class SplitWords {

    public static String[] splitWords(String text) {

        int wordCount = 1;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);

                if (ch == ' ') {
                    wordCount++;
                }

            } catch (RuntimeException e) {
                break;
            }
        }

        String[] words = new String[wordCount];

        String word = "";
        int index = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);

                if (ch == ' ') {
                    words[index] = word;
                    index++;
                    word = "";
                } else {
                    word = word + ch;
                }

            } catch (RuntimeException e) {
                words[index] = word;
                break;
            }
        }

        return words;
    }

    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {

        }

        return count;
    }

    public static String[][] create2DArray(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {

            result[i][0] = words[i];

            int wordLength = findLength(words[i]);

            result[i][1] = String.valueOf(wordLength);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);

        String[][] result = create2DArray(words);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");

        for (int i = 0; i < result.length; i++) {

            // Convert String length to Integer
            int length = Integer.parseInt(result[i][1]);

            System.out.println(result[i][0] + "\t" + length);
        }

        sc.close();
    }
}
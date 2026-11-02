package String.Level3;

import java.util.Scanner;

public class CharacterFrequencyUnique {

        public static char[] uniqueCharacters(String text) {

        char[] unique = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            boolean found = false;

            for (int j = 0; j < index; j++) {
                if (unique[j] == ch) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[index] = ch;
                index++;
            }
        }

        char[] result = new char[index];

        for (int i = 0; i < index; i++) {
            result[i] = unique[i];
        }

        return result;
    }

    public static String[][] findFrequency(String text) {

        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

        char[] unique = uniqueCharacters(text);

        String[][] result = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(frequency[unique[i]]);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }

        sc.close();
    }
}

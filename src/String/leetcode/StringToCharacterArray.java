package String.Level1;

    import java.util.Scanner;

public class StringToCharacterArray {

        public static char[] getCharacters(String str) {

            char[] characters = new char[str.length()];

            for (int i = 0; i < str.length(); i++) {
                characters[i] = str.charAt(i);
            }

            return characters;
        }

        public static boolean compareArrays(char[] arr1, char[] arr2) {

            if (arr1.length != arr2.length) {
                return false;
            }

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = sc.next();

            char[] userDefinedArray = getCharacters(str);

            char[] builtInArray = str.toCharArray();


            boolean result = compareArrays(userDefinedArray, builtInArray);


            System.out.println("User-defined character array:");

            for (int i = 0; i < userDefinedArray.length; i++) {
                System.out.print(userDefinedArray[i] + " ");
            }

            System.out.println("\nBuilt-in character array:");

            for (int i = 0; i < builtInArray.length; i++) {
                System.out.print(builtInArray[i] + " ");
            }

            System.out.println("\n\nBoth arrays are equal: " + result);

            sc.close();
        }
    }


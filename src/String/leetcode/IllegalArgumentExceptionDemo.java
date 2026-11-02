package String.Level1;

import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

        public static void generateException(String text) {

               String result = text.substring(5, 2);

        System.out.println(result);
    }


    public static void handleException(String text) {

        try {
            // Start index is greater than end index
            String result = text.substring(5, 2);

            System.out.println(result);

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled.");
            System.out.println("Message: " + e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled.");
            System.out.println("Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                System.out.print("Enter a string: ");
        String text = sc.nextLine();

        handleException(text);

        sc.close();
    }
}

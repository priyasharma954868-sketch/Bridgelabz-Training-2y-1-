package Arrays;

import java.util.Scanner;

import java.util.Scanner;

public class StudentVotingAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] age = new int[10];

        // Take input for 10 students
        for (int i = 0; i < age.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            age[i] = sc.nextInt();
        }

        // Check voting eligibility
        for (int i = 0; i < age.length; i++) {

            if (age[i] < 0) {
                System.out.println("Invalid age: " + age[i]);
            }
            else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote.");
            }
            else {
                System.out.println("The student with the age " + age[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}
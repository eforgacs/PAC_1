package TextbookExamples;

import java.util.Scanner;

public class ReverseDisplay {

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int value = input.nextInt();
        // Display value reversely
        reverseDisplay(value);
    }

    public static void reverseDisplay(int value) {

        if (value < 10) {
            System.out.println(value);
        } else {
            System.out.println(value % 10);
            reverseDisplay(value / 10);
        }

    }
}

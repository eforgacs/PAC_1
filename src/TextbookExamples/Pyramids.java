package TextbookExamples;

import java.util.Scanner;

public class Pyramids {

    // Question 5.17

    public static void main(String[] args) {

        int i, j, num=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int input = s.nextInt();
        for (i = 0; i < input; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }

    }
}

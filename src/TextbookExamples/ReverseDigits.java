package TextbookExamples;

import java.util.Scanner;
import java.lang.*;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four digit number?");
        int fourDigitNumber = input.nextInt();

        System.out.print("Put those digits together and you get ");
        System.out.print(Integer.reverse(fourDigitNumber));
    }
}

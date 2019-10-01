package Labs;

import java.util.Scanner;

class Calculator {
    private static String message = "2nd input: ";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double buffer = getNumFromUser(input, "1st input: ");
        boolean clearBuffer = false;
        double num2 = 0.0;
        while (true) {
            char operator = getOperatorFromUser(input);
            if (operator != 'c' && operator != 'x') {
                num2 = getNumFromUser(input, message);
            }
            message = "more input: ";
            switch (operator) {
                case '+':
                    buffer = add(buffer, num2);
                    break;
                case '-':
                    buffer = subtract(buffer, num2);
                    break;
                case '*':
                    buffer = multiply(buffer, num2);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: division by zero");
                    } else {
                        buffer = divide(buffer, num2);
                    }
                    break;
                case 'c':
                    clearBuffer = true;
                    buffer = 0.0;
                    break;
                case 'x':
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error: Unknown operator " + operator);
                    break;
            }
            System.out.println("ans: " + buffer);
            if (clearBuffer) {
                clearBuffer = false;
            }
        }
    }

    private static double getNumFromUser(Scanner input, String s) {
        System.out.print(s);
        return input.nextDouble();
    }

    private static char getOperatorFromUser(Scanner input) {
        System.out.print("op: ");
        return input.next().charAt(0);
    }

    static double add(double left, double right) {
        return left + right;
    }

    static double subtract(double left, double right) {
        return left - right;
    }

    static double multiply(double left, double right) {
        return left * right;
    }

    static double divide(double left, double right) {
        return left / right;
    }
}

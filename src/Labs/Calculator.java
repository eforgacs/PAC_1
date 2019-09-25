package Labs;

import java.util.Scanner;

class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double num1 = getNum(input, "1st input: ");
        char operator = getOperator(input);
        double buffer = 0;
        switch (operator) {
            case '+':
                buffer = addCase2ndInput(input, num1);
                break;
            case '-':
                buffer = subtractCase2ndInput(input, num1);
                break;
            case '*':
                buffer = multiplyCase2ndInput(input, num1);
                break;
            case '/':
                buffer = divideCase2ndInput(input, num1, buffer);
                break;
            case 'c':
                buffer = 0.0;
                System.out.println("ans: " + buffer);
                break;
            case 'x':
                System.exit(0);
                break;
            default:
                buffer = num1;
                double num2 = getNum(input, "2nd input: ");
                System.out.println("Error: Unknown operator " + operator);
                break;
        }

        while (true) {
            char operator2 = getOperator(input);
            switch (operator2) {
                case '+':
                    buffer = addCase(input, buffer);
                    break;
                case '-':
                    buffer = subtractCase(input, buffer);
                    break;
                case '*':
                    buffer = multiplyCase(input, buffer);
                    break;
                case '/':
                    buffer = divideCase(input, buffer);
                    break;
                case 'c':
                    buffer = 0.0;
                    System.out.println("ans: " + buffer);
                    break;
                case 'x':
                    System.exit(0);
                    break;
                default:
                    buffer = num1;
                    double num2 = getNum(input, "more input: ");
                    System.out.println("Error: Unknown operator " + operator);
            }
        }
    }

    private static double divideCase2ndInput(Scanner input, double num1, double buffer) {
        double divideNum2 = getNum(input, "2nd input: ");
        if (divideNum2 == 0) {
            System.out.println("Error: division by zero");
            return buffer;
        } else {
            buffer = Calculator.divide(num1, divideNum2);
            System.out.println("ans: " + buffer);
            return buffer;
        }
    }

    private static double multiplyCase2ndInput(Scanner input, double num1) {
        double buffer;
        double multiplyNum2 = getNum(input, "2nd input: ");
        buffer = Calculator.multiply(num1, multiplyNum2);
        System.out.println("ans: " + buffer);
        return buffer;
    }

    private static double subtractCase2ndInput(Scanner input, double num1) {
        double buffer;
        double subtractNum2 = getNum(input, "2nd input: ");
        buffer = Calculator.subtract(num1, subtractNum2);
        System.out.println("ans: " + buffer);
        return buffer;
    }

    private static double addCase2ndInput(Scanner input, double num1) {
        double buffer;
        double addNum2 = getNum(input, "2nd input: ");
        buffer = Calculator.add(num1, addNum2);
        System.out.println("ans: " + buffer);
        return buffer;
    }

    private static double addCase(Scanner input, double buffer) {
        double addNum2 = getNum(input, "more input: ");
        buffer += addNum2;
        System.out.println("ans: " + buffer);
        return buffer;
    }

    private static double subtractCase(Scanner input, double buffer) {
        double subtractNum2 = getNum(input, "more input: ");
        buffer -= subtractNum2;
        System.out.println("ans: " + buffer);
        return buffer;
    }

    private static double multiplyCase(Scanner input, double buffer) {
        double multiplyNum2 = getNum(input, "more input: ");
        buffer *= multiplyNum2;
        System.out.println("ans: " + buffer);
        return buffer;
    }

    private static double divideCase(Scanner input, double buffer) {
        double divideNum2 = getNum(input, "more input: ");
        if (divideNum2 == 0) {
            System.out.println("Error: division by zero");
            return buffer;
        } else {
            buffer /= divideNum2;
            System.out.println("ans: " + buffer);
            return buffer;
        }
    }

    private static double getNum(Scanner input, String s) {
        System.out.print(s);
        return input.nextDouble();
    }

    private static char getOperator(Scanner input) {
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

    static boolean isUnknown(char operator) {
        switch (operator) {
            case '+':
            case '-':
            case '*':
            case '/':
            case 'c':
            case 'x':
                return false;
            default:
                return true;
        }
    }
}

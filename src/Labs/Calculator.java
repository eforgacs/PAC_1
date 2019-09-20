package Labs;

import java.util.Scanner;

class Calculator {


    int add(int left, int right) {
        return left + right;
    }

    int subtract(int left, int right) {
        return left - right;
    }

    int multiply(int left, int right) {
        return left * right;
    }

    int divide(int left, int right) {
        return left / right;
    }

    boolean isUnknown(char operator) {
        switch (operator) {
            case '+':
            case '-':
            case '*':
            case '/':
                return false;
            default:
                return true;
        }
    }
}

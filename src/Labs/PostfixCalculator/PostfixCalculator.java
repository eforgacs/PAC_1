package Labs.PostfixCalculator;

import java.util.Scanner;


import java.util.List;
import java.util.ArrayList;


public class PostfixCalculator {

    public static void main(String[] args) {

        Converter converter;
        String postfixExp;
        double answer;

        Scanner scanner = new Scanner(System.in);

        System.out.println("type your infix expression:");

        String infixExpression = scanner.next();

        converter = new Converter(infixExpression);


        postfixExp = converter.toPostFix();

        System.out.println("converted to postfix: " + postfixExp);


        answer = calculatePostfix(postfixExp);
        System.out.println("answer is: " + answer);

        scanner.close();

    }

    private static double calculatePostfix(String postfixExp) {

        double answer = 0.0;
        List<String> tokens;
        Stack stack = new ArrayStack();
        char[] postfixAsChar = postfixExp.toCharArray();

        tokens = new ArrayList<>(ParserHelper.parse(postfixAsChar));

        for (String token : tokens) {

            if (Converter.isOperator(token)) {
                if (!stack.isEmpty()) {
                    double operand1 = Double.parseDouble((String) stack.pop());
                    double operand2 = Double.parseDouble((String) stack.pop());

                    switch (token) {
                        case "+":

                            answer = operand1 + operand2;
                            stack.push(answer + "");
                            break;

                        case "-":
                            answer = operand2 - operand1;
                            stack.push(answer + "");
                            break;

                        case "*":
                            answer = operand1 * operand2;
                            stack.push(answer + "");
                            break;

                        case "/":
                            answer = operand2 / operand1;
                            stack.push(answer + "");
                            break;

                        case "^":
                            answer = Math.pow(operand2, operand1);
                            stack.push(answer + "");
                            break;

                        default:
                            break;
                    }
                }

            } else {
                stack.push(token);
            }
        }
        return answer;
    }


}
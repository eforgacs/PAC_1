package Labs.PostfixCalculator;

import java.util.List;
import java.util.ArrayList;

class Converter {

    private String infixExpression;

    Converter(String infixExpression) {
        setInfixExpression(infixExpression);
    }

    private void setInfixExpression(String infixExpression) {
        this.infixExpression = infixExpression;
    }

    String toPostFix() {

        List<String> tokens;
        Stack stack = new ArrayStack();
        char[] infixAsChar = infixExpression.toCharArray();

        tokens = new ArrayList<>(ParserHelper.parse(infixAsChar));


        StringBuilder outputString = new StringBuilder();

        for (String token : tokens) {
            if (isOperator(token)) {


                while (!stack.isEmpty() && precedence((String) stack.top()) >= precedence(token)) {
                    outputString.append(stack.pop()).append(" ");
                }

                stack.push(token);
            } else {

                switch (token) {
                    case "(":
                        stack.push(token);
                        break;
                    case ")":
                        while (!stack.isEmpty() && !stack.top().equals("(")) {
                            outputString.append(stack.pop()).append(" ");
                        }
                        stack.pop();
                        break;
                    default:
                        outputString.append(token).append(" ");
                        break;
                }
            }

        }


        while (!stack.isEmpty()) {
            outputString.append(stack.pop()).append(" ");
        }

        return outputString.toString();

    }

    static boolean isOperator(String token) {
        String operators = "+-/*^";

        StringBuilder operator = new StringBuilder();
        for (int i = 0; i < operators.length(); i++) {

            operator.append(operators.charAt(i));
            if (token.equals(operator.toString()))
                return true;

            operator = new StringBuilder();
        }

        return false;
    }

    private int precedence(String token) {

        switch (token) {
            case "+":

            case "-":
                return 1;

            case "*":

            case "/":
                return 2;

            case "^":
                return 3;

            default:
                return 0;
        }

    }

}
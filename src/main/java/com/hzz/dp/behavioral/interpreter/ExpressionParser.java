package com.hzz.dp.behavioral.interpreter;

import java.util.Stack;

public class ExpressionParser {
    public static Expression parse(String input) {
        String[] tokens = input.replace(" ", "").split("");
        Stack<Expression> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        int i = 0;
        while (i < tokens.length) {
            char c = tokens[i].charAt(0);
            if (Character.isDigit(c)) {
                int num = 0;
                while (i < tokens.length && Character.isDigit(tokens[i].charAt(0))) {
                    num = num * 10 + (tokens[i].charAt(0) - '0');
                    i++;
                }
                values.push(new NumberExpression(num));
                continue;
            } else if (c == '(') {
                operators.push(c);
            } else if (c == ')') {
                while (operators.peek() != '(') {
                    values.push(applyOp(operators.pop(), values.pop(), values.pop()));
                }
                operators.pop();
            } else if (c == '+' || c == '*') {
                while (!operators.isEmpty() && precedence(c) <= precedence(operators.peek())) {
                    values.push(applyOp(operators.pop(), values.pop(), values.pop()));
                }
                operators.push(c);
            }
            i++;
        }

        while (!operators.isEmpty()) {
            values.push(applyOp(operators.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    private static int precedence(char op) {
        return switch (op) {
            case '*' -> 2;
            case '+' -> 1;
            default -> -1;
        };
    }

    private static Expression applyOp(char op, Expression right, Expression left) {
        return switch (op) {
            case '+' -> new AddExpression(left, right);
            case '*' -> new MultiplyExpression(left, right);
            default -> throw new IllegalArgumentException("未知运算符: " + op);
        };
    }
}

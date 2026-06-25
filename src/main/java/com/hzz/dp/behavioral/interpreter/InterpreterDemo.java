package com.hzz.dp.behavioral.interpreter;

public class InterpreterDemo {
    public static void main(String[] args) {
        String[] expressions = {
            "1 + 2",
            "3 * 4",
            "1 + 2 * 3",
            "(1 + 2) * 3",
            "10 + 20 * 5"
        };

        for (String expr : expressions) {
            Expression parsed = ExpressionParser.parse(expr);
            int result = parsed.interpret();
            System.out.println(expr + " = " + result);
        }
    }
}

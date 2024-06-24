package stack;

import java.util.*;

public class PostfixEvaluation {

    public static void main(String[] args) {
        String exp = "6 2 3 + - 3 8 2 / + * 2 $ 3 +";
        Scanner sc = new Scanner(exp);
        java.util.Stack<Integer> opndstk = new java.util.Stack();
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                opndstk.push(sc.nextInt());

            } else {
                int op2 = opndstk.pop();
                int op1 = opndstk.pop();
                String operator = sc.next();
                switch (operator) {
                    case "+":
                        int value = op1 + op2;
                        opndstk.push(value);
                        break;
                    case "-":
                        value = op1 - op2;
                        opndstk.push(value);
                        break;
                    case "*":
                        value = op1 * op2;
                        opndstk.push(value);
                        break;
                    case "/":
                        value = op1 / op2;
                        opndstk.push(value);
                        break;

                    case "$":
                        value = (int) Math.pow(op1, op2);
                        opndstk.push(value);
                }
            }
        }
        System.out.println("Result=" + opndstk.pop());
    }

}

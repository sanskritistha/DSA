package stack;

import java.util.*;

public class PrefixEvaluation {

    public static void main(String[] args) {
        String exp = "- + 6 5 / * 3 2 5";
        StringBuilder r_exp = new StringBuilder(exp);
        r_exp.reverse();
        Scanner sc = new Scanner(r_exp.toString());
        java.util.Stack<Integer> opndstk = new java.util.Stack();
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                opndstk.push(sc.nextInt());

            } else {
                int op1 = opndstk.pop();
                int op2 = opndstk.pop();
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

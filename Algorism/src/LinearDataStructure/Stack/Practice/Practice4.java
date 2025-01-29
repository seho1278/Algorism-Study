package LinearDataStructure.Stack.Practice;

/*
괄호 짝 검사

입출력 예시
입력 : "("
출력 : Fail

입력 : ")"
출력 : Fail

입력 : "()"
출력 : Pass
 */

import java.util.Stack;

public class Practice4 {

    public static void checkParenthesis(String str) {
        Stack stack = new Stack();
        boolean checkFlag = true;

        for (String s: str.split("")) {
            if (s.equals("(")) {
                stack.push(s);
            } else {
                if (stack.isEmpty()) {
                    checkFlag = false;
                    break;
                } else {
                    stack.pop();
                }
            }
        }

        if (checkFlag && stack.isEmpty()) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        // Test code
        checkParenthesis("("); // Fail
        checkParenthesis(")"); // Fail
        checkParenthesis("()"); // Pass
        checkParenthesis("()()()"); // Pass
        checkParenthesis("(())()"); // Pass
        checkParenthesis("(((()))"); // Fail
    }
}

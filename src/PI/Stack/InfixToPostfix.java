package PI.Stack;

import java.util.Stack;

public class InfixToPostfix {

//    check if string is operand or not
    public static boolean isOperand(char ch){
        return (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' );
    }
// get precedence of operator

    static int getPrecedence(char ch ){
        switch (ch){
            case '-':
            case '+':
                return 1 ;
            case '*':
            case '/':
                return 2;
            case '^' :
                return 3;
        }
        return -1;
    }

    static void convertInfixToPrefix(String expression){
        Stack <Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder(new String(""));
        for(int i = 0 ; i<expression.length(); i++){
//            check character at index i is operand or not
            if(isOperand(expression.charAt(i)))
                result.append(expression.charAt(i));

//            if ( then push to stack
            else if(expression.charAt(i) == '(')
                stack.push(expression.charAt(i));

//           Here, if we scan character is an ‘)’, we need to pop and print from the stack
//            // do this until an ‘(‘ is encountered in the stack.
                else if (expression.charAt(i) == ')'){
                    while (! stack.isEmpty() && stack.peek() != '('){
                        result.append(stack.peek());
                        stack.pop();
                    }
                        if (!stack.empty() && stack.peek() != '(')
                        return; // invalid expression
                    else
                        stack.pop();
                }
                else { // if an operator
                    while ( ! stack.isEmpty() && getPrecedence(expression.charAt(i)) <= getPrecedence(stack.peek())){
                        result.append(stack.peek());
                        stack.pop();
                    }
                    stack.push(expression.charAt(i));
                }
        }
        // Once all initial expression characters are traversed
        // adding all left elements from stack to exp
        while (!stack.empty()) {
            result.append(stack.peek());
            stack.pop();
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String expression = "a+b*(c^d-e)^(f+g*h)-i";
        convertInfixToPrefix(expression);
    }
}

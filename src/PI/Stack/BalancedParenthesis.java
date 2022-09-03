package PI.Stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class BalancedParenthesis {
    static boolean isBalanced(String expr) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0 ; i < expr.length() ; i++){
            char ch = expr.charAt(i);
            if( ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
                continue;
            }
//          not opening then must be closing hence stack cant be empty
            if(stack.isEmpty())
                return false;
            char check ;
            switch (ch){
                case ')' :
                    check = stack.pop();
                    if (check == ']' || check == '}')
                        return false;
                    break;
                case '}' :
                    check = stack.pop();
                    if (check == ']' || check == ')')
                        return false;
                    break;
                case ']' :
                    check = stack.pop();
                    if (check == ')' || check == '}')
                        return false;
                    break;
            }
        }
            return stack.isEmpty();
    }

    public static void main(String[] args) {
        if(isBalanced("{}{}{"))
            System.out.println("Balance");
        else
            System.out.println("Not balanced");
    }
}

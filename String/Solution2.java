import java.util.Stack;
//parenthesis checker

class Solution1 {
    
    // Function to check if the expression is balanced
    public static boolean isBalanced(String x) {
        Stack<Character> stack = new Stack<>();
        
        // Traverse each character in the string
        for (int i = 0; i < x.length(); i++) {
            char current = x.charAt(i);
            
            // Push opening brackets onto the stack
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            }
            // If it's a closing bracket, check for balance
            else if (current == ')' || current == ']' || current == '}') {
                // If the stack is empty, there's no opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                
                // Check if the popped element is the matching opening bracket
                if ((current == ')' && top != '(') ||
                    (current == ']' && top != '[') ||
                    (current == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        // If the stack is empty, it means all brackets are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Test cases
        String expression1 = "[()]{}{[()()]()}";
        String expression2 = "[(])";
        String expression3 = "{([])}";
        String expression4 = "([]";
        
        System.out.println(isBalanced(expression1) ? "balanced" : "not balanced"); // Output: balanced
        System.out.println(isBalanced(expression2) ? "balanced" : "not balanced"); // Output: not balanced
        System.out.println(isBalanced(expression3) ? "balanced" : "not balanced"); // Output: balanced
        System.out.println(isBalanced(expression4) ? "balanced" : "not balanced"); // Output: not balanced
    }
}
// todo: To Check if the Entered Sequence of Brackets is a Balanced Sequence or Not... A Balanced Sequence must give empty Stack at the end of the String traversal...
import java.util.Scanner;
import java.util.Stack;
public class Balanced
{
    public void Balance(String st, Stack<Character> stack1)
    {
        char ch = '\u0000';
        for (int j = 0; j < st.length(); j++)
        {
            stack1.push(st.charAt(j));
            System.out.println(stack1.peek());
            ch = stack1.peek();
            if (ch == ']' || ch == ')' || ch == '}')
            {
                stack1.pop();
                if (stack1.peek() == '(' || stack1.peek() == '{' || stack1.peek() == '[')
                    stack1.pop();
                else
                    stack1.push(ch);
            }
        }
        if(stack1.isEmpty())
            System.out.println("The Sequence of Brackets is Balanced !!");
        return;
    }
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);
        Stack<Character> stack = new Stack<Character>();
        String str;
        System.out.print("Enter a Sequence of brackets : ");
        str =  scanner.next();
        Balanced balanced = new Balanced();
        for(int i = 0; i < str.length(); i++)
        {
            stack.push(str.charAt(i));
        }
        balanced.Balance(str, stack);
        scanner.close();
    }
}
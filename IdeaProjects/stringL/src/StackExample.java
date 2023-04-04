import java.util.Scanner;
import java.util.Stack;

public class StackExample {
    public void printSorted()
    {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        int l=str.length();
        Stack<Character> stack = new Stack<Character>();
        Stack<Character> tempstack  = new Stack<Character>();
        stack.push(str.charAt(0));
        for(int i = 1; i < l; i++)
        {
            int a = str.charAt(i);
            int b = (int)((char)stack.peek());
            if ((a - b) >= 1 || (a == b))
            {
                stack.push(str.charAt(i));
            }
            else if ((b - a) >= 1)
            {
                while ((b - a) >= 1)
                {
                    tempstack.push(stack.peek());
                    stack.pop();
                    if (stack.size() > 0)
                    {
                        b = (int)((char)stack.peek());
                    }
                    else
                    {
                        break;
                    }
                }
                stack.push(str.charAt(i));
                while (tempstack.size() > 0)
                {
                    stack.push(tempstack.peek());
                    tempstack.pop();
                }
            }
        }
        String answer = "";
        while (stack.size() > 0)
        {
            answer = stack.peek()+answer;
            stack.pop();
        }
        System.out.println(answer);
    }
    public static void main(String[] args) {
        StackExample s=new StackExample();
        s.printSorted();
    }
}

package LeetCodeEasyProblems;

import java.util.Stack;

public class Q682
{
    public static void main(String[] args) {
        String[] operations = {"5","2","C","D","+"};
        int sum = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<operations.length;++i)
        {
            if(operations[i]=="C")
                stack.pop();
            else if(operations[i]=="D")
                stack.push(2*stack.peek());
            else if(operations[i]=="+")
                stack.push(stack.peek()+stack.elementAt(stack.size()-2));
            else
                stack.push((Integer.parseInt(operations[i])));
        }
        for(int i:stack)
            sum += i;
        System.out.println(sum);;
    }
}

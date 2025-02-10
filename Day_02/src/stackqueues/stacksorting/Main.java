package stackqueues.stacksorting;

import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        StackSort s1 = new StackSort();
        Stack <Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(4);
        stack.push(15);
        stack.push(3);

        s1.sortStack(stack);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}

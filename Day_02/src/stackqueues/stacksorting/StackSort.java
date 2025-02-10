package stackqueues.stacksorting;

import java.util.Stack;
public class StackSort {
    public void sortStack(Stack<Integer> stack){
        // Check if the stack is empty
        if(stack.isEmpty()) {
            return;
            }
        // Pop the element
         int element = stack.pop();
        // Sort the remaining stack recursively
        sortStack(stack);
        correctIndex(element,stack);
        }

        // Function to sort the stack
    public void correctIndex(int element, Stack<Integer> stack){
        if(stack.isEmpty() || stack.peek() <= element){
                stack.push(element);
                return;
        }
        int temp = stack.pop();
        correctIndex(element,stack);

        stack.push(temp);
     }
    }


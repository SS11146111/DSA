package Stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(30);
        stack.push(5);
        stack.push(15);
        stack.push(6);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.size());

    }


}

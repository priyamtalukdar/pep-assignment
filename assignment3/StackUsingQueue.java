import java.util.*;
class StackUsingQueue {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int top;
    public StackUsingQueue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public void push(int x) {
        q1.add(x);
        top = x;
    }

    public int pop() {
        while (q1.size() > 1) {
            top = q1.remove();
            q2.add(top);
        }
        int pop = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return pop;
    }

    public int top() {
        return top;
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueue stack = new StackUsingQueue();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.top()); 
        System.out.println(stack.pop()); 
    }
}

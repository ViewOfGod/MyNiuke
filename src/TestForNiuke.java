import java.util.Stack;

public class TestForNiuke {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {

        stack1.push(node);
    }

    public int pop() {
        while(!stack1.empty()) {
            int n = stack1.pop();
            stack2.push(n);
        }
        int resp=stack2.pop();
        while (!stack2.empty()){
            int n=stack2.pop();
            stack1.push(n);
        }
        return resp;
    }
}

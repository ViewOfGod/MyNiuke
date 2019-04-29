import java.util.ArrayList;
import java.util.Stack;

/**
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */
public class TestForNiuke19 {

    public static void main(String[] args) {
        String s="[\"PSH3\",\"MIN\",\"PSH4\",\"MIN\",\"PSH2\",\"MIN\",\"PSH3\",\"MIN\",\"POP\",\"MIN\",\"POP\",\"MIN\",\"POP\",\"MIN\",\"PSH0\",\"MIN\"]";
        push(3);
        System.out.println(min());
        push(4);
        System.out.println(min());
        push(2);
        System.out.println(min());
        push(3);
        System.out.println(min());
        pop();
        System.out.println(min());
        pop();
        System.out.println(min());
        pop();
        System.out.println(min());
        push(0);
//        System.out.println(min());
    }

    static Stack<Integer> s = new Stack<>();
    static ArrayList<Integer> list = new ArrayList<>();//辅助list，用于存储有序的结果
    public static void push(int node) {
        list.add(node);
        int i = list.size() - 1;
        while (i>0&&node>list.get(i-1)){
            i--;
            list.set(i+1,list.get(i));
        }
        list.set(i,node);
        s.push(node);
    }

    public static void pop() {
        int i = 0;
        while (s.peek() != list.get(i)) {
            i++;
        }
        list.remove(i);
        s.pop();
    }

    public static int top() {
        return s.peek();
    }

    public static int min() {
        return list.get(list.size() - 1);
    }
}

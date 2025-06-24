import java.util.ArrayList;
import java.util.List;

public class StackUsingArrayList {
    List<Integer> li;

    public StackUsingArrayList() {
        li = new ArrayList<>();
    }

    public static void main(String[] args) {
        StackUsingArrayList obj1 = new StackUsingArrayList();
        obj1.push(10);
        obj1.push(20);
        obj1.pop();
        obj1.peek();
        obj1.isEmpty();
    }

    private int push(int val) {
        li.add(val);
        System.out.println("Value pushed: " + val);
        return val;
    }

    private int pop() {
        if (li.isEmpty()) {
            System.out.println("Stack Empty");
            return 0;
        } else {
            int poppedElement = li.get(li.size() - 1);
            li.remove(li.size() - 1);
            System.out.println("Element popped: " + poppedElement);
            return poppedElement;
        }
    }

    private int peek() {
        if (li.isEmpty()) {
            System.out.println("Stack is Empty");
            return 0;
        } else {
            System.out.println(li.get(li.size() - 1));
            return li.get(li.size() - 1);
        }
    }

    private boolean isEmpty() {
        System.out.println("Is Stack Empty: " + li.isEmpty());
        return li.isEmpty();
    }

}

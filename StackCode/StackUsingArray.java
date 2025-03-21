
/* this is the implementation of stack that ive done based on my understanding of stack concept  */
import java.util.Scanner;

public class StackUsingArray {
    static int stackSize;
    /*
     * need to get size from user. cant get the size directly from main method. so
     * we are only initializing an array without declaring a size.
     */
    static int stackArr[];
    /*
     * cant use -1 as index as we are going to store it in an array.
     */
    static int pointer = 0;

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int stackSize = s.nextInt();
        /*
         * getting size and initializing it to our stackArr
         */
        stackArr = new int[stackSize];
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.peek();
        s.close();
    }

    public void push(int value) {
        if (pointer >= stackArr.length) {
            System.out.println("Stack Full");
            return;
            /*
             * added return just to end it. no need to use it (used it based on my
             * understanding)
             */
        } else {
            pointer += 1;
            stackArr[pointer - 1] = value;
            return;
        }
    }

    public int pop() {
        if (pointer == 0) {
            System.out.println("Stack is already empty");
            return -1;
        } else {
            /*
             * pointer will be at 1, but the storing should be from * 0 since array indexing
             * starts from 0.
             * thats why we use stackArr[pointer - 1];
             * this will make sure that
             */
            int poppedElement = stackArr[pointer - 1];
            stackArr[pointer - 1] = 0;
            pointer -= 1;
            System.out.println(poppedElement);
            return poppedElement;
        }
    }

    public void peek() {
        if (pointer == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(stackArr[pointer - 1]);
        }
    }

    public boolean isEmpty() {
        if (pointer == 0) {
            return true;
        } else {
            return false;
        }
    }
}

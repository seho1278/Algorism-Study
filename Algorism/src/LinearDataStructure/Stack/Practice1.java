package LinearDataStructure.Stack;

/*
ArrayList를 사용한 스택 구현
 */

import java.util.ArrayList;

class MyStack1 {
    ArrayList list;

    MyStack1() {
        this.list = new ArrayList();
    }

    public boolean isEmpty() {
        if (this.list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int data) {
        this.list.add(data);
    }

    public Integer pop() {
        // 비어있을 경우
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        int data = (int) this.list.get(this.list.size() - 1);
        this.list.remove(this.list.size() - 1);
        return data;
    }

    public Integer peek() {
        // 비어있을 경우
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }

        int data = (int) this.list.get(this.list.size() - 1);
        return data;
    }

    public void printStack() {
        System.out.println(this.list);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        // Test code
        MyStack1 stack = new MyStack1();
        System.out.println(stack.isEmpty()); // true
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack(); // [1, 2, 3, 4, 5]

        System.out.println(stack.peek()); // 5
        stack.printStack(); // [1, 2, 3, 4, 5]

        System.out.println(stack.pop()); // 5
        System.out.println(stack.pop()); // 4
        stack.printStack(); // [1, 2, 3]

        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 1
        stack.printStack(); // []
    }
}

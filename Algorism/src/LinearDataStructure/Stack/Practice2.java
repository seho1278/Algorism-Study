package LinearDataStructure.Stack;

/*
배열을 이용한 기본 스택 직접 구현
 */

class MyStack2 {
    int[] arr;
    int top = -1;

    MyStack2(int size) {
        arr = new int[size];
    }

    public boolean isEmpty() {
        if (this.top == -1) {
            return true;
        }

        return false;
    }

    // 배열의 경우 사이즈가 고정되어있으니 체크가 필요
    public boolean isFull() {
        if (this.top == this.arr.length -1) {
            return true;
        }

        return false;
    }

    public void push(int data) {
        if (this.isFull()) {
            System.out.println("Stack is full!");
            return;
        }

        this.top += 1;
        this.arr[this.top] = data;
    }

    public Integer pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }

        int data = this.arr[this.top];
        this.top -= 1;
        return data;
    }

    public Integer peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        }

        int data = this.arr[this.top];
        return data;
    }

    public void printStack() {
        for (int i = 0; i < this.top + 1; i++) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }
}

public class Practice2 {
    public static void main(String[] args) {
        // Test code
        MyStack2 stack = new MyStack2(5);
        System.out.println(stack.isEmpty()); // true
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6); // Stack is full!
        stack.printStack(); // 1 2 3 4 5

        System.out.println(stack.peek()); // 5
        stack.printStack(); // 1 2 3 4 5

        System.out.println(stack.pop()); // 5
        System.out.println(stack.pop()); // 4
        stack.printStack(); // 1 2 3

        System.out.println(stack.pop()); // 3
        System.out.println(stack.pop()); // 2
        System.out.println(stack.pop()); // 1
        stack.printStack();
    }
}

package LinearDataStructure.Queue;

/*
ArrayList로 Queue 구현
 */

import java.util.ArrayList;

class MyQueue1 {
    ArrayList list;

    MyQueue1() {
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
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        int data = (int) this.list.get(0);
        this.list.remove(0);
        return data;
    }

    public Integer peek() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }


        return (int) this.list.get(0);
    }

    public void printQueue() {
        System.out.println(this.list);
    }


}

public class Practice1 {
    public static void main(String[] args) {
        // Test code
        MyQueue1 queue = new MyQueue1();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);

        queue.printQueue(); // [1, 2, 3, 4, 5]

        System.out.println(queue.peek()); // 1
        queue.printQueue(); // [1, 2, 3, 4, 5]

        System.out.println(queue.pop()); // 1
        queue.printQueue(); // [2, 3, 4, 5]

        System.out.println(queue.pop()); // 2
        queue.printQueue(); // [3, 4, 5]

        System.out.println(queue.pop()); // 3
        System.out.println(queue.pop()); // 4
        System.out.println(queue.pop()); // 5
        queue.printQueue(); // []
    }
}

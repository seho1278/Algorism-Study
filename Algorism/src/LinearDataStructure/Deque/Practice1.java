package LinearDataStructure.Deque;

/*
ArrayList를 이용한 데크 구현
 */

import java.util.ArrayList;

class MyDeque1 {
    ArrayList list;

    MyDeque1() {
        this.list = new ArrayList();
    }

    public boolean isEmpty() {
        if (this.list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void addFirst(int data) {
        this.list.add(0, data);
    }

    public void addLast(int data) {
        this.list.add(data);
    }

    public Integer removeFirst() {
        if (this.isEmpty()) {
            System.out.println("Deque is empty");
            return null;
        }

        int data = (int) this.list.get(0);
        this.list.remove(0);
        return data;
    }

    public Integer removeLast() {
        if (this.isEmpty()) {
            System.out.println("Deque is empty");
            return null;
        }

        int data = (int) this.list.get(this.list.size() - 1);
        this.list.remove(this.list.size() - 1);
        return data;
    }

    public void printDeque() {
        System.out.println(this.list);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        // Test code
        MyDeque1 deque = new MyDeque1();
        // Front 입력
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.printDeque(); // [3, 2, 1]

        // Rear 입력
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);
        deque.printDeque(); // [3, 2, 1, 10, 20, 30]

        // Front 출력
        System.out.println(deque.removeFirst()); // 3
        deque.printDeque(); // [2, 1, 10, 20, 30]

        // Rear 출력
        System.out.println(deque.removeLast()); // 30
        deque.printDeque(); // [2, 1, 10, 20]

        System.out.println(deque.removeLast()); // 20
        System.out.println(deque.removeLast()); // 10
        System.out.println(deque.removeLast()); // 2
        System.out.println(deque.removeLast()); // 1
        deque.printDeque(); // []
    }
}

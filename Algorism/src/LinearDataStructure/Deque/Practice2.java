package LinearDataStructure.Deque;

/*
배열을 이용한 기본 데크 직접 구현
 */

class MyDeque2 {
    int[] arr;
    int front = 0;
    int rear = 0;

    MyDeque2(int size) {
        this.arr = new int[size + 1];
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public boolean isFull() {
        return (this.rear + 1) % this.arr.length == this.front;
    }

    public void addFirst(int data) {
        if (this.isFull()) {
            System.out.println("Deque is full");
            return;
        }

        this.arr[this.front] = data;
        // front 가 0일경우를 생각해 배열의 길이만큼 +
        this.front = (this.front - 1 + this.arr.length) % this.arr.length;
    }

    public void addLast(int data) {
        if (this.isFull()) {
            System.out.println("Deque is full");
            return;
        }

        this.rear = (this.rear + 1) % this.arr.length;
        this.arr[this.rear] = data;
    }

    public Integer removeFirst() {
        if (this.isEmpty()) {
            System.out.println("Deque is empty");
            return null;
        }

        this.front = (this.front + 1) % this.arr.length;
        return this.arr[this.front];
    }

    public Integer removeLast() {
        if (this.isEmpty()) {
            System.out.println("Deque is empty");
            return null;
        }

        int data = this.arr[this.rear];
        this.rear = (this.rear - 1 + this.arr.length) % this.arr.length;
        return data;
    }

    public void printDeque() {
        int start = (this.front + 1) % this.arr.length;
        int end = (this.rear + 1) % this.arr.length;

        for (int i = start; i != end; i = (i + 1) % this.arr.length) {
            System.out.print(this.arr[i] + " ");
        }
        System.out.println();
    }

}

public class Practice2 {
    public static void main(String[] args) {
        // Test code
        MyDeque2 deque = new MyDeque2(5);
        // Front 입력
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.printDeque(); // 3 2 1

        // Rear 입력
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30); // Deque is full
        deque.printDeque(); // 3 2 1 10 20

        // Front 출력
        System.out.println(deque.removeFirst()); // 3
        deque.printDeque(); // 2 1 10 20

        // Rear 출력
        System.out.println(deque.removeLast()); // 20
        deque.printDeque(); // 2 1 10

        System.out.println(deque.removeLast()); // 10
        System.out.println(deque.removeLast()); // 1
        System.out.println(deque.removeLast()); // 2
        System.out.println(deque.removeLast()); // Deque is empty

    }
}

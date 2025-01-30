package LinearDataStructure.Queue;

/*
배열을 이용한 기본 큐 구현 (원형 큐 형태)
 */

class MyQueue2 {
    int[] arr;
    int front = 0;
    int rear = 0;

    MyQueue2(int size) {
        arr = new int[size + 1];
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public boolean isFull() {
        return (this.rear + 1) % this.arr.length == this.front;
    }

    public void enqueue(int data) {
        if (this.isFull()) {
            System.out.println("Queue is full");
            return;
        }

        this.rear = (this.rear + 1) % this.arr.length;
        this.arr[this.rear] = data;
    }

    public Integer dequeue() {
        if (this.isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }

        front = (front + 1) % this.arr.length;
        return this.arr[front];
    }

    public void printQueue() {
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
        MyQueue2 queue = new MyQueue2(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6); // Queue is full

        queue.printQueue(); // 1 2 3 4 5

        System.out.println(queue.dequeue()); // 1
        queue.printQueue(); // 2 3 4 5

        System.out.println(queue.dequeue()); // 2
        queue.printQueue(); // 3 4 5

        queue.enqueue(6);
        queue.enqueue(7);
        queue.printQueue(); // 3 4 5 6 7

        System.out.println(queue.dequeue()); // 3
        System.out.println(queue.dequeue()); // 4
        System.out.println(queue.dequeue()); // 5
        queue.printQueue(); // 6 7
        System.out.println(queue.dequeue()); // 6
        System.out.println(queue.dequeue()); // 7
        queue.printQueue(); // Queue is Empty
    }
}

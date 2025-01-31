package LinearDataStructure.Deque.Practice;

/*
데크 리사이즈
기본 데크 구조에서 데크 공간이 full 일 때 데이터를 추가하는 경우,
데크 공간을 2배 씩 늘려주는 코드 작성
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

    public void increaseSize() {
        int[] arrTmp = this.arr.clone();
        this.arr = new int[this.arr.length * 2];

        int start = (this.front + 1) % arrTmp.length;
        int end = (this.rear + 1) % arrTmp.length;

        int idx = 1;
        for (int i = start; i != end; i = (i + 1) % arrTmp.length) {
            this.arr[idx++] = arrTmp[i];
        }

        this.front = 0;
        this.rear = idx - 1;
    }

    public void addFirst(int data) {
        if (this.isFull()) {
            increaseSize();
        }

        this.arr[this.front] = data;
        // front 가 0일경우를 생각해 배열의 길이만큼 +
        this.front = (this.front - 1 + this.arr.length) % this.arr.length;
    }

    public void addLast(int data) {
        if (this.isFull()) {
            increaseSize();
        }

        this.rear = (this.rear + 1) % this.arr.length;
        this.arr[this.rear] = data;
    }

    public void addMiddle(int data) {
        if (this.isFull()) {
            System.out.println("Deque is full");
            return;
        }

        int elements = this.rear - this.front;
        if (elements < 0) {
            elements = this.arr.length + elements;
        }

        int mid = (this.rear - elements / 2 + this.arr.length) % this.arr.length + 1;

        int start = (this.rear + 1) % this.arr.length;
        int end = (this.rear - elements / 2 + this.arr.length) % this.arr.length;

        for (int i = start; i != end; i = (i - 1 + this.arr.length) % this.arr.length) {
            this.arr[i] = this.arr[(i - 1 + this.arr.length) % this.arr.length];
        }

        this.arr[mid] = data;
        this.rear = (this.rear + 1) % this.arr.length;
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

public class Practice6 {
    public static void main(String[] args) {
        MyDeque2 deque = new MyDeque2(5);
        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        deque.printDeque(); // 1 2 3 4 5

        deque.addLast(6);
        deque.addLast(7);
        deque.addLast(8);
        deque.addLast(9);
        deque.addLast(10);
        deque.printDeque(); // 1 2 3 4 5 6 7 8 9 10

        deque.removeLast();
        deque.removeLast();
        deque.addFirst(100);
        deque.addFirst(200); // 200 100 1 2 3 4 5 6 7 8
        deque.printDeque();

        deque.addFirst(300);
        deque.addFirst(400);
        deque.addFirst(500);
        deque.printDeque(); // 500 400 300 200 100 1 2 3 4 5 6 7 8


    }
}

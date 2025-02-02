package LinearDataStructure.LinkedList.Practice;

/*
단방향 연결리스트 복습하기
 */

class Node {
    int data;
    Node next;

    Node() {}
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    Node head;

    LinkedList() {}
    LinkedList(Node head) {
        this.head = head;
    }


    // 빈 배열 확인
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    // 연결 리스트의 맨 뒤에 데이터 추가
    public void addData(int data) {
        if (this.head == null) {
            this.head = new Node(data, null);
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }
    }

    // 연결 리스트의 맨 뒤의 데이터 삭제
    public void removeData() {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        Node prev = cur;
        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }

        if (cur == this.head) {
            this.head = null;
        } else {
            prev.next = null;
        }

    }

    // 연결 리스트에서 데이터 찾기
    public void findData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Node cur = this.head;

        while (cur.next != null) {
            if (cur.data == data) {
                System.out.println("exist");
            }
            cur = cur.next;
        }
        System.out.println("not found");
    }

    // 연결 리스트의 모든 데이터 출력
    public void showData() {
        if (this.isEmpty()) {
            System.out.println("List is empty");
        }

        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

}

public class Main {
    public static void main(String[] args) {
        // Test code
        LinkedList list = new LinkedList(new Node(1, null));
        list.showData(); // 1

        list.addData(2);
        list.addData(3);
        list.addData(4);
        list.addData(5);
        list.showData(); // 1 2 3 4 5

        list.findData(3); // Data exist!
        list.findData(300); // Data not found!

        list.removeData();
        list.removeData();
        list.removeData();
        list.showData(); // 1 2

        list.removeData();
        list.removeData();
        list.removeData(); // List is empty
    }
}

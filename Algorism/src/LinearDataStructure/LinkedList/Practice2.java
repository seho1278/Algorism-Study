package LinearDataStructure.LinkedList;

/*
양방향 연결 리스트 구현
 */

class NodeBi {
    int data;
    NodeBi next;
    NodeBi prev;

    NodeBi(int data, NodeBi next, NodeBi prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

class DoublyLinkedList extends LinkedList {
    NodeBi head;
    NodeBi tail;

    DoublyLinkedList(NodeBi node) {
        this.head = node;
        this.tail = node;
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    public void addData(int data, Integer beforeData) {
        if (this.head == null) {
            this.head = new NodeBi(data, null, null);
            this.tail = this.head;
        } else if (beforeData == null) {
            this.tail.next = new NodeBi(data, null, this.tail);
            this.tail = this.tail.next;
        } else {
            NodeBi cur = this.head;
            NodeBi pre = cur;
            while (cur != null) {
                if (cur.data == beforeData) {
                    if (cur == this.head) {
                        this.head = new NodeBi(data, this.head, null);
                        this.head.next.prev = this.head;
                    } else {
                        pre.next = new NodeBi(data, cur, pre);
                        cur.prev = pre.next;
                    }
                    break;
                }
                pre = cur;
                cur = cur.next;
            }
        }
    }

    public void removeData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
        }

        NodeBi cur = this.head;
        NodeBi pre = cur;

        while (cur != null) {
            if (cur.data == data) {
                if (cur == this.head && cur == this.tail) {
                    this.head = null;
                    this.tail = null;
                } else if (cur == this.head) {
                    this.head = cur.next;
                    this.head.prev = null;
                } else if (cur == this.tail) {
                    this.tail = this.tail.prev;
                    this.tail.next = null;
                } else {
                    pre.next = cur.next;
                    cur.next.prev = pre;
                }
                break;
            }
            pre = cur;
            cur = cur.next;
        }
    }

    public void showData() {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        NodeBi cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void showDataFromTail() {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        NodeBi cur = this.tail;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.prev;
        }
        System.out.println();
    }
}

public class Practice2 {
    public static void main(String[] args) {
        // Test code
        DoublyLinkedList list = new DoublyLinkedList(new NodeBi(1, null, null));
        list.showData(); // 1

        for (int i = 2; i <= 5; i++) {
            list.addData(i, null);
        }
        list.showData(); // 1 2 3 4 5
        list.showDataFromTail(); // 5 4 3 2 1

        for (int i = 1; i < 5; i++) {
            list.addData(i * 100, i);
        }
        list.showData(); // 100 1 200 2 300 3 400 4 500 5
        list.showDataFromTail(); // 5 500 4 400 3 300 2 200 1 100

        list.removeData(300);
        list.removeData(100);
        list.removeData(500);
        list.removeData(200);
        list.removeData(400);
        list.showData(); // 1 2 3 4 5
        list.showDataFromTail(); // 5 4 3 2 1

        list.removeData(3);
        list.removeData(1);
        list.removeData(5);
        list.removeData(2);
        list.removeData(4);
        list.showData(); // List is empty
        list.showDataFromTail(); // List is empty

    }
}

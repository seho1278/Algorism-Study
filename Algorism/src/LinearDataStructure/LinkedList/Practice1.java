package LinearDataStructure.LinkedList;

// 먼저 구현한 LinkedList 상속
class LinkedList2 extends LinkedList {

    LinkedList2(Node node) {
        this.head = node;
    }
    
    // 연결 리스트에 데이터 추가
    // before_data가 null인 경우, 가장 뒤에 추가
    // before_data에 값이 있는 경우, 해당 값을 가진 노드 앞에 추가
    public void addData(int data, Integer beforeData) {
        if (this.head == null) {
            this.head = new Node(data, null);
        // 가장 뒤에 추가
        } else if (beforeData == null) {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        // 특정위치 앞에 노드 추가
        } else {
            Node cur = this.head;
            Node prev = cur;
            while (cur != null) {
                if (cur.data == beforeData) {
                    if (cur == this.head) {
                        this.head = new Node(data, this.head);
                    } else {
                        prev.next = new Node(data, cur);
                    }
                    break;
                }
                prev = cur;
                cur = cur.next;
            }
        }
    }

    public void removeData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        Node prev = cur;
        while (cur != null) {
            if (cur.data == data) {
                if (cur == this.head) {
                    this.head = cur.next;
                } else {
                    prev.next = cur.next;
                }
                break;
            }

            prev = cur;
            cur = cur.next;
        }
    }
}

public class Practice1 {
    public static void main(String[] args) {
        // Test code
        LinkedList2 list = new LinkedList2(new Node(1, null));
        list.showData(); // 1

        list.addData(2);
        list.addData(3);
        list.addData(4);
        list.addData(5);

        list.showData(); // 1 2 3 4 5

        list.addData(100, 1);
        list.addData(200, 2);
        list.addData(300, 3);
        list.addData(400, 4);
        list.addData(500, 5);

        list.showData(); // 100 1 200 2 300 3 400 4 500 5

        list.removeData(300);
        list.removeData(100);
        list.removeData(500);
        list.removeData(200);
        list.removeData(400);

        list.showData(); // 1 2 3 4 5

        list.removeData(3);
        list.removeData(1);
        list.removeData(5);
        list.removeData(2);
        list.removeData(4);

        list.showData(); // List is empty
    }
}

package LinearDataStructure.LinkedList.Problem;

/*
연결 리스트 부분 뒤집기
주어진 연결 리스트에서 시작 위치에서 끝 위치 사이의 노드들을 뒤집기

입출력 예시
입력 연결 리스트 : 1, 2, 3, 4, 5
시작 위치 : 2
끝 위치 : 4
(처음 위치는 1부터라고 가정)
결과 연결 리스트 : 1, 4, 3, 2, 5
 */

public class Practice6 {
    public static LinkedList reverseList(LinkedList list, int left, int right) {
        Node cur1 = null;
        Node pre1 = null;

        cur1 = list.head;
        for (int i = 0; i < left - 1; i++) {
            pre1 = cur1;
            cur1 = cur1.next;
        }

        Node cur2 = cur1;
        Node pre2 = pre1;
        Node after = null;
        for (int i = left; i <= right; i++) {
            after = cur2.next;
            pre2 = cur2;
            cur2 = after;
        }

        pre1.next = pre2;
        cur1.next = cur2;

        return list;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addData(1);
        list.addData(2);
        list.addData(3);
        list.addData(4);
        list.addData(5);
        list.showData();

        list = reverseList(list, 2, 4);
        list.showData();

        LinkedList list2 = new LinkedList();
        list2.addData(1);
        list2.addData(2);
        list2.addData(3);
        list2.addData(4);
        list2.addData(5);
        list2.addData(6);
        list2.addData(7);

        list2 = reverseList(list2, 3, 5);
        list2.showData();

    }
}

package LinearDataStructure.LinkedList.Problem;

/*
Palindrome 연결 리스트
추가 자료구조 없이 연결 리스트만으로 풀어보기
Palindrome: 앞으로 읽어도 뒤로 읽어도 같은 문자열

입출력 예시
입력 연결 리스트 : 1, 3, 5, 3, 1
결과 : true

입력 연결 리스트 : 3, 5, 5, 3
결과 : true

입력 연결 리스트 : 1, 3, 5, 1
결과 : false
 */

public class Practice5 {
    public static boolean checkPalindrome(LinkedList list) {
        Node cur = list.head;
        Node left = list.head;
        Node right = null;

        int cnt = 0;
        while (cur != null) {
            cnt++;
            right = cur;
            cur = cur.next;
        }

        Node prevRight = right;
        for (int i = 0; i < cnt / 2; i++) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = left;
            while (right.next != prevRight) {
                right = right.next;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addData(1);
        list.addData(3);
        list.addData(5);
        list.addData(3);
        list.addData(1);
        System.out.println(checkPalindrome(list));

        LinkedList list2 = new LinkedList();
        list2.addData(3);
        list2.addData(5);
        list2.addData(5);
        list2.addData(3);
        System.out.println(checkPalindrome(list2));

        LinkedList list3 = new LinkedList();
        list3.addData(1);
        list3.addData(3);
        list3.addData(5);
        list3.addData(1);
        System.out.println(checkPalindrome(list3));
    }
}

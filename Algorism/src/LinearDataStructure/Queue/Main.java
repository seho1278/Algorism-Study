package LinearDataStructure.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // LinkedList를 사용하는 이유
        // Queue 같은 경우 interface로 되어 있기 때문에 메소드들을 오버라이딩 하여 사용하여함
        // LinkedList에 queue에 필요한 연산들이 다 구현되어 있음 Queue에서 상속받아 만든 애기 때문에
        // 다형성을 이용해 할당해 사용
        Queue queue = new LinkedList();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue); // [1, 2, 3, 4, 5]

        System.out.println(queue.poll()); // 1
        System.out.println(queue); // [2, 3, 4, 5]

        System.out.println(queue.poll()); // 2
        System.out.println(queue); // [3, 4, 5]

        // 가장 먼저 들어온 수 출력
        System.out.println(queue.peek()); // 3
        System.out.println(queue); // [3, 4, 5]

        System.out.println(queue.contains(3)); // true
        System.out.println(queue.size()); // 3
        System.out.println(queue.isEmpty()); // false

        queue.clear();
        System.out.println(queue); // []
        // stack의 경우 비어있을 때 pop을 사용할 경우 예외 발생
        // queue의 경우 null 반환
        System.out.println(queue.poll()); // null
    }
}

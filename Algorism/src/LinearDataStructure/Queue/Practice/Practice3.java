package LinearDataStructure.Queue.Practice;

/*
카드 섞기
1부터 N 까지의 번호로 구성된 N장의 카드가 있다.
1번 카드가 가장 위에 그리고 N번 카드는 가장 아래의 상태로 카드가 순서대로 쌓여있다.
아래의 동작을 카드 한 장만 남을 때까지 반복했을 때, 가장 마지막에 남는 카드 번호를 출력
1. 가장 위의 카드는 버린다
2. 그 다음 위의 카드는 쌓여 있는 카드의 가장 아래에 다시 넣는다.

예시 입출력
N = 4
결과 : 4

N = 7
결과 : 6
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class Practice3 {
    // 내 풀이
//    public static int findLastCard(int N) {
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 1; i <= N; i++) {
//            queue.add(i);
//        }
//
//        int cnt = 0;
//
//        while (queue.size() > 1) {
//            if (cnt % 2 == 0) {
//                queue.poll();
//            } else {
//                queue.add(queue.poll());
//            }
//
//            cnt++;
//        }
//        return queue.poll();
//    }

    // 강의 풀이
    public static int findLastCard(int N) {
        Queue queue = new LinkedList();

        IntStream.range(1, N + 1).forEach(x -> queue.add(x));
        System.out.println(queue);

        while (queue.size() > 1) {
            queue.remove();
            int data = (int) queue.remove();
            queue.add(data);
            System.out.println(queue);
        }

        return (int) queue.remove();
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(findLastCard(4));
        System.out.println(findLastCard(7));
        System.out.println(findLastCard(9));
    }
}

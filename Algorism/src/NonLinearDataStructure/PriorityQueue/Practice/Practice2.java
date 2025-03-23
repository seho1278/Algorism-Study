package NonLinearDataStructure.PriorityQueue.Practice;

// 돌의 무게 데이터로 이루어진 정수형 stones 배열이 주어졌을 때, 다음의 내용에 따라 프로그램을 작성
// 해당 배열로부터 가장 무게가 많이 나가는 돌 두개를 꺼내기
// 두 개의 돌을 충돌시키는데, 무게가 같으면 둘다 소멸,
// 무게가 다르면 남은 무게만큼의 돌은 다시 추가
// 이 과정을 반복하며 가장 마지막의 돌의 무게를 출력

// 입출력 예시
// 입력 : 2, 7, 4, 1, 8, 1
// 출력 : 1

// 입력 : 5, 3, 5, 3, 4
// 출력 : 2

import java.util.Collections;
import java.util.PriorityQueue;

public class Practice2 {
    public static void solution(int[] stones) {
        // 풀이 1
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            pq.offer(stones[i]);
        }
        
        while (pq.size() != 1) {
            pq.offer(Math.abs(pq.poll() - pq.poll()));
        }

        System.out.println(pq.peek());

        // 풀이 2
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((x, y) -> y - x);

        for (int stone: stones) {
            pq2.offer(stone);
        }

        while (pq2.size() > 1) {
            int stone1 = pq2.poll();
            int stone2 = pq2.poll();
            int diff = Math.abs(stone1 - stone2);

            if (diff != 0) {
                pq2.offer(diff);
            }
        }

        System.out.println(pq2.poll());
    }

    public static void main(String[] args) {
        // Test code
        int[] stones = {2, 7, 4, 1, 8, 1};
        solution(stones);

        stones = new int[]{5, 3, 5, 3, 4};
        solution(stones);
    }
}

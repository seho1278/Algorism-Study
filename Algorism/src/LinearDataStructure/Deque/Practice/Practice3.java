package LinearDataStructure.Deque.Practice;

/*
데이터 재정렬
D_0 -> D_1 -> ... -> D_n-1 -> D_n 순으로 되어 있는 데이터를
D_0 -> D_n -> D_1 -> D_n-1 -> ... 순이 되도록 재정렬

입출력 예시
입력 데이터 : 1 -> 2 -> 3 -> 4 -> 5
출력 데이터 : 1 -> 5 -> 2 -> 4 -> 3
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.stream.IntStream;

public class Practice3 {
    // 내 풀이
    public static void reorderData(int[] arr) {
        int[] result = new int[arr.length];
        Deque deque = new ArrayDeque();
        IntStream.rangeClosed(0, arr.length - 1).forEach(i -> deque.add(arr[i]));

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = (int) deque.removeFirst();
            } else {
                result[i] = (int) deque.removeLast();
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }

    // 강의 풀이
    public static void reorderData2(int[] arr) {
        Deque deque = new ArrayDeque();
        ArrayList result = new ArrayList();

        // 배열을 intstream으로 변환
        IntStream.of(arr).forEach(i -> deque.addLast(i));
        System.out.println(deque);

        while (!deque.isEmpty()) {
            result.add(deque.removeFirst());

            if (!deque.isEmpty()) {
                result.add(deque.removeLast());
            }
        }

        System.out.println("== 정렬 전 ==");
        printData(arr);
        System.out.println("== 정렬 후 ==");
        printData(result.stream().mapToInt(i -> (int) i).toArray());
    }

    public static void printData(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " -> ");
        }
        System.out.println(arr[arr.length - 1]);
    }

    public static void main(String[] args) {
        // Test code
        int[] arr = {1, 2, 3, 4, 5};
        reorderData(arr); // 1 -> 5 -> 2 -> 4 -> 3

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        reorderData2(arr2); // 1 -> 7 -> 2 -> 6 -> 3 -> 5 -> 4
    }
}

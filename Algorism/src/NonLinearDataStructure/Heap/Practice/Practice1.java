package NonLinearDataStructure.Heap.Practice;

/*
최소 힙에서 특정 값을 변경하는 코드 작성
특정 값이 여러개라면 모두 변경
 */

import java.util.ArrayList;

public class Practice1 {
    public static void solution(MinHeap minHeap, int from, int to) {
        for (int i = 0; i < minHeap.heap.size(); i++) {
            if (minHeap.heap.get(i) == from) {
                minHeap.heap.set(i, to);

                moveUp(minHeap, i);
                moveDown(minHeap, i);
            }
        }
    }

    public static void moveUp(MinHeap minHeap, int idx) {
        int cur = idx;

        while (cur > 1 && minHeap.heap.get(cur / 2) > minHeap.heap.get(cur)) {
            int parentVal = minHeap.heap.get(cur / 2);
            minHeap.heap.set(cur / 2, minHeap.heap.get(cur));
            minHeap.heap.set(cur, parentVal);

            cur /= 2;
        }
    }

    public static void moveDown(MinHeap minHeap, int idx) {
        int cur = idx;

        while (true) {
            int leftIdx = cur * 2;
            int rightIdx = cur * 2 + 1;
            int targetIdx = -1;

            if (rightIdx < minHeap.heap.size()) {
                targetIdx = minHeap.heap.get(leftIdx) < minHeap.heap.get(rightIdx) ? leftIdx : rightIdx;
            } else if (leftIdx < minHeap.heap.size()) {
                targetIdx = leftIdx;
            } else {
                break;
            }

            if (minHeap.heap.get(cur) < minHeap.heap.get(targetIdx)) {
                break;
            } else {
                int parentVal = minHeap.heap.get(cur);
                minHeap.heap.set(cur, minHeap.heap.get(targetIdx));
                minHeap.heap.set(targetIdx, parentVal);
                cur = targetIdx;
            }
        }
    }


    public static void main(String[] args) {
        // Test code
        MinHeap minHeap = new MinHeap();
        minHeap.insert(30);
        minHeap.insert(40);
        minHeap.insert(10);
        minHeap.insert(50);
        minHeap.insert(60);
        minHeap.insert(70);
        minHeap.insert(20);
        minHeap.insert(30);
        System.out.println("데이터 변경 전");
        minHeap.printTree();

        System.out.println("데이터 변경 후");
        solution(minHeap, 30, 100);
        minHeap.printTree();

        solution(minHeap, 60, 1);
        minHeap.printTree();
    }
}

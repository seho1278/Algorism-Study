package NonLinearDataStructure.Heap;
// ArrayList로 최대 힙 구현

import java.util.ArrayList;

class MaxHeap {
    ArrayList<Integer> heap;

    public MaxHeap() {
        this.heap = new ArrayList<>();
        // 1번부터 시작하도록 더미데이터 생성
        this.heap.add(0);
    }

    // 삽입
    public void insert(int data) {
        heap.add(data);

        int cur = heap.size() - 1;
        while (cur > 1 && heap.get(cur / 2) < heap.get(cur)) {
            int parentVal = heap.get(cur / 2);
            heap.set(cur / 2, data);
            heap.set(cur, parentVal);

            cur /= 2;
        }
    }

    // 삭제
    public Integer delete() {
        if (heap.size() == 1) {
            System.out.println("Heap is empty");
            return null;
        }

        int target = heap.get(1);

        heap.set(1, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int cur = 1;
        while (true) {
            int leftIdx = cur * 2;
            int rightIdx = cur * 2 + 1;
            int targetIdx = -1;

            if (rightIdx < heap.size()) {
                targetIdx = heap.get(leftIdx) > heap.get(rightIdx) ? leftIdx : rightIdx;
            } else if (leftIdx < heap.size()) {
                targetIdx = cur * 2;
            } else {
                break;
            }

            if (heap.get(cur) > heap.get(targetIdx)) {
                break;
            } else {
                int parentVal = heap.get(cur);
                heap.set(cur, heap.get(targetIdx));
                heap.set(targetIdx, parentVal);
                cur = targetIdx;
            }
        }

        return target;
    }

    public void printTree() {
        for (int i = 1; i < this.heap.size(); i++) {
            System.out.print(this.heap.get(i) + " ");
        }
        System.out.println();
    }
}

public class Practice2 {
    public static void main(String[] args) {
        // Test code
        MaxHeap heap = new MaxHeap();
        heap.insert(30);
        heap.insert(40);
        heap.insert(10);
        heap.printTree();
        heap.insert(50);
        heap.insert(60);
        heap.insert(70);
        heap.printTree();
        heap.insert(20);
        heap.printTree();
        heap.insert(30);
        heap.printTree();

        System.out.println();
        System.out.println("삭제: " + heap.delete());
        heap.printTree();
        System.out.println("삭제: " + heap.delete());
        heap.printTree();
        System.out.println("삭제: " + heap.delete());
        heap.printTree();

    }
}

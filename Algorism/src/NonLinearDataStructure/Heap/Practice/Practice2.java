package NonLinearDataStructure.Heap.Practice;

/*
최소 힙, 최대 힙을 이용하여 데이터를 오름차순, 내림차순으로 출력
 */

public class Practice2 {
    public static void solution(MinHeap minHeap) {
        MaxHeap maxHeap = new MaxHeap();

        System.out.print("오름차순: ");
        while(minHeap.heap.size() != 1) {
            int data = minHeap.delete();
            System.out.print(data + " ");
            maxHeap.insert(data);
        }
        System.out.println();

        System.out.print("내림차순: ");
        while(maxHeap.heap.size() != 1) {
            System.out.print(maxHeap.delete() + " ");
        }
        System.out.println();
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

        solution(minHeap);
    }
    
}

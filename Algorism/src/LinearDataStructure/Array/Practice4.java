package LinearDataStructure.Array;

/*
배열 arr에서 peek 값 모두 출력
(peek 값은 좌우보다 큰 값)

입출력 예시
arr : 3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11
결과 : 3, 6, 5, 10, 11
 */

public class Practice4 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11};

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " "); // 3
            } else if (i == arr.length - 1 && arr[i] > arr[i - 1]) {
                System.out.print(arr[i] + " "); // 3, 6, 5, 10
            } else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    System.out.print(arr[i] + " "); // 3, 6, 5, 10, 11
                }
            }
        }
        System.out.println();
    }
}

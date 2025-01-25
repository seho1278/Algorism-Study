package LinearDataStructure.Array;

/*
2차원 배열 arr을 시계방향 90도 회전시킨 결과를 출력

입출력 예시
arr :
1, 2, 3, 4, 5
6, 7, 8, 9, 10
11, 12, 13, 14, 15

결과 :
11, 6, 1
12, 7, 2
13, 8, 3
14, 9, 4
15, 10, 5
 */

public class Practice7 {
    static void printArr(int[][] arr) {
        for (int[] item1D: arr) {
            for (int item: item1D) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        int[][] arr90 = new int[arr[0].length][arr.length];

        // 내 풀이
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }

        // 강의 풀이
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int r = arr.length - 1 - i;
                arr90[j][r] = arr[i][j];
            }
        }

        printArr(arr);
        printArr(arr90);
    }
}

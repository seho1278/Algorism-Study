package LinearDataStructure.Array;

/*
배열 arr에서 중복 값을 제거한 새 배열 만들기
(Set 이용x 배열만 사용)

입출력 예시
arr : 1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5
결과 : 1, 5, 3, 2, 4
 */

public class Practice6 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};
        int[] arrResult = new int[arr.length];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            // 중복 데이터 체크
            boolean dupFlag = false;
            for (int j = 0; j < cnt; j++) {
                if (arr[i] == arrResult[j]) {
                    dupFlag = true;
                }
            }

            if (dupFlag == false) {
                arrResult[cnt++] = arr[i];
            }
        }

        for (int i = 0; i < cnt; i++) {
            System.out.print(arrResult[i] + " "); // 1, 5, 3, 2, 4
        }
        System.out.println();
    }
}

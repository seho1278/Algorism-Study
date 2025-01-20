package Math.Practice;

// 파스칼의 삼각형
/*
파스칼의 삼각형(Pascal's triangle)은 수학에서 이항계수를 삼각형 모양의 기하학적 형태로 배열
1. 첫 번째 줄에는 숫자 1
2. 그 다음 줄은 바로 위의 왼쪽 숫자와 오른쪽 숫자를 더한 결과

삼각형의 행의 수가 입력으로 주어질 때,
파스칼의 삼각형을 출력
 */

import java.util.ArrayList;

public class Practice1 {
    public static ArrayList<ArrayList<Integer>> solution(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    int x = result.get(i - 1).get(j - 1);
                    int y = result.get(i - 1).get(j);
                    list.add(x + y);
                }
            }
            result.add(list);
        }

        return result;
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution(1));
        System.out.println(solution(2));
        System.out.println(solution(3));
        System.out.println(solution(4));
        System.out.println(solution(5));
    }
}

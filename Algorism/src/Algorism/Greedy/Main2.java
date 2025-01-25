package Algorism.Greedy;

import java.util.Scanner;

/**
 * 백준 실버2 16953 A -> B
 * 정수 A를 B로 바꾸려고할때 가능한 연산
 * 2를 곱한다.
 * 1을 수의 가장 오른족에 추가한다.
 * A를 B로 바꾸는데 필요한 연산의 최솟값 구하기
 */

public class Main2 {
    public static int solution(int a, int b) {
        int cnt = 1;
        while (b != a) {
            if (b < a) {
                return -1;
            }

            if (b % 2 == 0) {
                b /= 2;
            } else if (b % 10 == 1) {
                b /= 10;
            } else {
                return -1;
            }
            cnt++;
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solution(a, b));
    }
}

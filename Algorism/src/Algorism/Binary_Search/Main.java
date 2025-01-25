package Algorism.Binary_Search;

import java.util.Scanner;

/**
 * 백준 실버3 1072 게임
 * 게임 기록
 * 게임 횟수 : X
 * 이긴 게임 : Y (Z%)
 * Z는 승률, 소수점 제거 ex) X = 53, Y = 47 -> Z = 88
 * X, Y가 주어졌을 때 최소 몇 번 더 해야 Z가 변하는지 구하기
 * 절대 변하지 않을 경우 -1 출력
 */

public class Main {

    public static int binarySearch(int x, int y, int z, int left, int right) {
        int answer = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int tmp = (int) ((100L * (y + mid)) / (x + mid));

            if (tmp > z) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = (int) ((100L * y) / x);

        if (z >= 99) {
            System.out.println(-1);
        } else {
            int left = 0;
            int right = 1000000000;
            System.out.println(binarySearch(x, y, z, left, right));
        }
    }
}

package Greedy;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 백준 실버4 2217 로프
 * k개의 로프를 사용하여 중량이 w인 물체를 들어올릴 때, 각각의 로프에는 모두 고르게 w/k 만큼의
 * 중량이 걸릴때
 * 주어진 로프들을 이용하여 들어올릴 수 있는 물체의 최대 중량 구하는 프로그램 작성
 * (모든 로프를 사용할 필요 없음)
 */

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = IntStream.range(0, n).map(i -> sc.nextInt()).sorted().toArray();

        int max = IntStream.range(0, arr.length).map(i -> arr[i] * (arr.length - i)).max().orElse(0);

        System.out.println(max);
    }
}

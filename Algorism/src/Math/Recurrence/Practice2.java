package Math.Recurrence;
// 최대공약수를 재귀함수로 구현

public class Practice2 {

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(gcd(3, 5)); // 1
        System.out.println(gcd(2, 6)); // 2
        System.out.println(gcd(8, 12)); // 4
    }
}

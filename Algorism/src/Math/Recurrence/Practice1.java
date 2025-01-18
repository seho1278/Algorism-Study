package Math.Recurrence;
// 팩토리얼을 재귀함수로 구현

public class Practice1 {

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(factorial(1)); // 1
        System.out.println(factorial(2)); // 2
        System.out.println(factorial(3)); // 6
        System.out.println(factorial(4)); // 24
        System.out.println(factorial(5)); // 120
    }
}

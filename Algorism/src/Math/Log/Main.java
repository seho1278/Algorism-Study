package Math.Log;

public class Main {
    public static void main(String[] args) {
        // 1. 제곱, 제곱근, 지수
        System.out.println(Math.pow(2, 3)); // 8.0
        System.out.println(Math.pow(2, -3)); // 0.125
        System.out.println(Math.pow(-2, -3)); // -0.125

        System.out.println(Math.pow(2, 30)); // 1.073741824E9
        System.out.printf("%.0f\n", Math.pow(2, 30)); // 1073741824

        System.out.println(Math.sqrt(16)); // 4.0
        System.out.println(Math.pow(16, 1.0/2)); // 4.0
        System.out.println(Math.pow(16, 1.0/4)); // 2.0

        // 참고) 절대 값
        System.out.println(Math.abs(5)); // 5
        System.out.println(Math.abs(-5)); // 5

        // 2. 로그
        System.out.println(Math.E); // 2.718281828459045
        System.out.println(Math.log(2.718281828459045)); // 1.0
        System.out.println(Math.log10(1000)); // 3.0
        System.out.println(Math.log(4) / Math.log(2)); // 2.0

    }
}

package Math.NumberOfCases;

// 약수 구하기, 두 수의 최대공약수와 최소공배수 구하기
// 활용) 1~10의 수 중 A의 약수 또는 B의 약수인 경우의 수
// 활용) 1~10의 수 중 A의 약수이면서 B의 약수인 경우의 수

import java.util.ArrayList;

public class Study2 {

    // 약수
    // 나눠서 나머지가 발생하지 않는 수
    public ArrayList getDivisor(int num) {
        ArrayList result = new ArrayList();

        // 절반까지만 구한 후 자기자신을 추가
        for (int i = 1; i <= (int)num/2; i++) {
            if (num % i == 0) {
                result.add(i);
            }
        }
        
        result.add(num);

        return result;
    }

    // 최대 공약수
    // GCD : the Greatest Common Denominator
    public int getGCD(int numA, int numB) {
        int gcd = -1;

        ArrayList divisorA = this.getDivisor(numA);
        ArrayList divisorB = this.getDivisor(numB);

        for (int itemA: (ArrayList<Integer>)divisorA) {
            for (int itemB: (ArrayList<Integer>)divisorB) {
                if (itemA == itemB) {
                    if (itemA > gcd) {
                        gcd = itemA;
                    }
                }
            }
        }

        return gcd;
    }

    // 최소 공배수
    // LCM : the Lowest Common Multiple
    // 최대공약수를 구한 후 두 수를 곱하고 최대공약수로 나눈다
    public int getLCM(int numA, int numB) {
        int lcm = -1;

        int gcd = this.getGCD(numA, numB);

        if (gcd != -1) {
            lcm = numA * numB / gcd;
        }

        return lcm;
    }

    public static void main(String[] args) {
        // Test Code
        int number1 = 10;
        int number2 = 6;

        Study2 p = new Study2();
        ArrayList l1 = p.getDivisor(number1);
        ArrayList l2 = p.getDivisor(number2);
        System.out.println(l1);
        System.out.println(l2);

        System.out.println(p.getGCD(number1, number2));
        System.out.println(p.getLCM(number1, number2));
    }
}

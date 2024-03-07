package library.util;

import java.math.BigInteger;

public class BigNumber {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);

        BigInteger bigInteger = new BigInteger("9223372836854775801203");
        BigInteger bigInteger1 = new BigInteger("9223372836854775801203");

        // 덧셈
        BigInteger sum = bigInteger.add(bigInteger1);
        System.out.println("큰 수 합계: " + sum);

        // 뺄셈
        BigInteger sub = bigInteger.subtract(bigInteger1);
        System.out.println("큰 수 빼기: " + sub);

        // 곱셈
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println("큰 수 곱하기: " + multiply);

        // 나눗셈
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println("큰 수 나누기: " + divide);

        // 거듭제공
        BigInteger pow = BigInteger.valueOf(2).pow(128);
        System.out.println("2 ^ 128: " + pow);

        // 최대 공약수
        BigInteger gcd = bigInteger1.gcd(bigInteger);
        System.out.println(gcd);

        // 부동 소수점 정밀도 오류
        System.out.println(0.1 + 0.2);




    }
}

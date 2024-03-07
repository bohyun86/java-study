package library.util.ex;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 원금 입력 받기
        System.out.print("원금: ");
        BigDecimal principal = scanner.nextBigDecimal();

        // 연이율 입력 받기
        System.out.print("연이율: ");
        BigDecimal annualInterestRate = scanner.nextBigDecimal();

        // 기간 입력 받기
        System.out.print("기간 (년): ");
        int years = scanner.nextInt();

        // 최종 금액 계산
        BigDecimal finalAmount = calculateCompoundInterest(principal, annualInterestRate, years);

        // 결과 출력
        System.out.println("최종 금액: " + finalAmount.setScale(2, RoundingMode.HALF_EVEN));
    }

    private static BigDecimal calculateCompoundInterest(BigDecimal principal, BigDecimal annualInterestRate, int years) {
        // (1 + 연이율)
        BigDecimal onePlusRate = annualInterestRate.add(BigDecimal.ONE);

        // (1 + 연이율) ^ 기간
        BigDecimal totalMultiplier = onePlusRate.pow(years);

        // 원금 * (1 + 연이율) ^ 기간
        return principal.multiply(totalMultiplier);
    }
}

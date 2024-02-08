package condition;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        /* 주차요금 계산하는 프로그램
        응용 문제 3: 주차 요금 계산기
        주차장을 사용한 시간(시간 단위)을 사용자로부터 입력받아,
        주차 요금을 계산하는 프로그램을 작성하세요.
        기본 요금은 2시간까지 5000원이고, 이후부터는 30분마다 1000원씩
        추가 요금이 발생합니다.
        24시간을 초과하는 주차의 경우에는 일일 최대 요금인 30000원을 적용하세요.
         */

        System.out.println("주차요금을 계산합니다.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("주차시간을 입력하세요 : ");
        int parkingTime = scanner.nextInt();
        int parkingFee = 0;

        if (parkingTime <= 2) {
            parkingFee = 5000;
        } else if (parkingTime > 2 && parkingTime <= 24) {
            parkingFee += (parkingTime - 2) * 2000;
        } else {
            parkingFee = 30000;
        }

        System.out.printf("주차요금은 %d원 입니다.", parkingFee);
    }
}
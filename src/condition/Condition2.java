package condition;

import java.util.Scanner;

public class Condition2 {
    public static void main(String[] args) {
        // 만약 나이가 18살 이상이면 성인입니다.
        // 만약 나이가 18살 이하면 미성년자입니다.
        // if age >= 18 "성인입니다."
        // if age < 18 "미성년자입니다."

        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력해주세요 : ");
        int age = scanner.nextInt();

        if (age < 18) {
            // 해당 조건이 참일때 실행되는 코드
            System.out.println("미성년자입니다."); // 조건이 true인 경우 수행
        } else {
            System.out.println("성인입니다.");   // 조건이 false인 경우 수행
        }
    }
}
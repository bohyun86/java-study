package loop;

import java.util.Random;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 숫자 맞추기 게임
        // 1~ 100까지의 랜덤한 숫자가 있습니다.
        // 응답한 숫자가 낮으면 낮다. 높으면 높다고 대답하여 랜덤한 숫자를 추측합니다.
        // 정답을 맞추면 축하 메시지를 출력해주세요
        Random random = new Random();
        int answer = random.nextInt(100) + 1; // 1 ~ 100까지 랜덤한 숫자
        // System.out.println(answer);  // 답안 확인

        // 반복문과 조건문을 통해서 숫자 추측 게임을 만들어보세요!
        System.out.println("1~100 사이의 랜덤한 숫자를 선택합니다. 그 숫자를 맞춰주세요.");
        System.out.print("1~100 사이의 숫자를 입력하세요: ");
        Scanner scanner = new Scanner(System.in);
        int tryCount = 1;

        do {
            int try_ = scanner.nextInt();

            if (try_ > answer) {
                System.out.println("Try " + tryCount + ". " + try_ + " Down");
                tryCount += 1;
            } else if (try_ == answer) {
                System.out.println("Try " + tryCount + ". " + try_ + " OK");
                break;
            } else {
                System.out.println("Try " + tryCount + ". " + try_ + " Up");
                tryCount += 1;
            }
        } while (true);

        System.out.println(tryCount + "번만에 성공하셨습니다! 축하합니다");


        // 예시
        // Try 1. 7  up
        // Try 2. 20 up
        // Try 3. 60 down
        // Try 4. 40 down
        // Try 5. 30 up
        // Try 6. 37 down
        // Try 7. 35 down
        // Try 8. 33 OK!
    }
}
package loop;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        // 이름과 나이를 입력받고 출력하는 앱
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;

        Boolean isRun = true;

        while (isRun) {
            // 이름을 입력받고 (이름을 입력받을 때 "q"라고 입력을 받으면 종료된다.)
            // 나이를 입력받고
            // 입력받은 이름과 나이를 출력한다.

            System.out.print("이름을 입력하세요(q를 입력시 프로그램 종료): ");
            name = scanner.next();
            if (name.equals("q")) {
                isRun = false;
                continue;
                // break;
            }
            System.out.print("나이를 입력하세요: ");
            age = scanner.nextInt();

            System.out.printf("이름: %s\n", name);
            System.out.printf("나이: %d\n", age);
        }
    }
}

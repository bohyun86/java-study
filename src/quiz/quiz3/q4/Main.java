package quiz.quiz3.q4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이메일 주소를 입력하세요: ");
        String address = scanner.nextLine();

        try {
            check(address);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    private static void check(String address) throws InvalidEmailException {
        if (address.contains("@")) {
            System.out.println("이메일 주소가 유효합니다.");
        } else {
            throw new InvalidEmailException("예외 발생: 유효하지 않은 이메일 주소입니다.");
        }
    }
}

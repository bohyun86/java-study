package exception.ex.ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이메일 주소를 입력하세요: ");
        String emailAddress = scanner.nextLine();

        try {
            validateEmail(emailAddress);
        } catch (InvalidEmailException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }


        scanner.close();
    }

    private static void validateEmail(String email) throws InvalidEmailException {
        if(!email.contains("@")) {
            throw new InvalidEmailException("유효하지 않은 이메일 주소입니다.");
        }

        System.out.println("이메일 주소가 유효합니다.");
    }
}

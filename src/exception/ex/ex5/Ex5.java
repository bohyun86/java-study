package exception.ex.ex5;
import java.util.Objects;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();
        String mention = errors(password);


        try {
            if (Objects.equals(mention, "")) {
                System.out.println("비밀번호가 성공적으로 설정되었습니다.");
            } else {
                throw new IllegalArgumentException(mention);
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    public static String errors(String password) {
        String errorMessage = "";

        if (password.length() < 8) {
            errorMessage += "비밀번호는 최소 8자 이상이어야 합니다.\n";
        }
        if (!password.matches(".*[0-9].*")) {
            errorMessage += "비밀번호에는 최소 하나의 숫자가 포함되어야 합니다.\n";
        }
        if (!password.matches(".*[A-Z].*")) {
            errorMessage += "비밀번호에는 최소 하나의 대문자가 포함되어야 합니다.\n";
        }

        return errorMessage;

    }
}


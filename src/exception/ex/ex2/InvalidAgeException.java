package exception.ex.ex2;

public class InvalidAgeException extends Exception {
    public InvalidAgeException() {
        System.out.println("미성년자는 접근할 수 없습니다.");
    }
}

package method;

public class Method4 {
    public static void main(String[] args) {
        checkAge(19);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println("미성년자입니다. 주류 및 담배 판매가 불가합니다.");
            return;
        }
        System.out.println("성인입니다. 주류 및 담배 판매가 가능합니다.");
    }
}


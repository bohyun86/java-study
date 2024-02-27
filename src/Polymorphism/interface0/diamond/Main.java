package Polymorphism.interface0.diamond;

public class Main {
    public static void main(String[] args) {
        First first = new ImplClass();
        first.firstMethod();        // 부모 타입의 메서드 실행가능
        first.commonMethod();       // 공통 메서드 실행
        // first.secondMethod();        // 다른 타입 인터페이스 실행불가

        Second second = new ImplClass();
        second.secondMethod();
        second.commonMethod();
        // second.firstMethod();
    }
}

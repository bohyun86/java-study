package Polymorphism.interface0.diamond;

public class ImplClass implements First, Second {
    @Override
    public void firstMethod() {
        System.out.println("첫번째의 메서드");
    }

    // First, Second 양쪽 인터페이스에서 가져온 메서드 (메서드 본문은 구현 클래스에서 구현 -> 다이아몬드 문제가 발생하지 않음)
    @Override
    public void commonMethod() {
        System.out.println("첫번째와 두번째의 공통 메서드");

    }

    @Override
    public void secondMethod() {
        System.out.println("두번째의 메서드");
    }
}

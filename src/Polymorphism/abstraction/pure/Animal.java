package Polymorphism.abstraction.pure;

public abstract class Animal {
    public abstract void sound();

    public abstract void move();

    // 일반 메서드: 본문을 가지는 메서드
    // 본문을 가지는 메서드가 있으면, 순수 추상 클래스가 아니다.

    public void eat() {
        System.out.println("동물이 먹습니다.");
    }

}

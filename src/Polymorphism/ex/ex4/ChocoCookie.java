package Polymorphism.ex.ex4;

public class ChocoCookie extends Cookie {
    @Override
    public void run() {
        System.out.println("초코 쿠키가 달립니다!");
    }

    @Override
    public void jump() {
        System.out.println("초코 쿠기가 중간 높이로 점프합니다!");
    }

    public void specialSkill() {
        System.out.println("초코 쿠키가 초콜릿 폭발을 입으킵니다!");
    }
}

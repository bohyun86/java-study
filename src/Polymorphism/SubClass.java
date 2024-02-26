package Polymorphism;

public class SubClass extends SuperClass {

    @Override
    public void mehtod() {
        System.out.println("자식 클래스에서 오버라이딩 된 메서드");
    }

    public void subMethod() {
        System.out.println("서브 클래스의 메서드");

    }
}

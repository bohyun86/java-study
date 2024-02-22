package inheritance;

public class ElectricCar extends Car {

    ElectricCar() {
        // System.out.println("ElectricCar의 생성자 호출");
    }

    // 부모 요소를 덮어쓸 때 @override 라는 특별한 주석을 분인다.
    // 컴파일러가 메서드가 정확하게 오버라이딩 되었는지 확인을 한다.
    // overriding: 매소드 재정의

    @Override
    void move() {
        System.out.println("전기차가 조용히 이동합니다.");
    }

    @Override
    void charge() {
        System.out.println("전기를 충전합니다.");
    }
}


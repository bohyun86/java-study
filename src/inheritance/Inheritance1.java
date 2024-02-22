package inheritance;

public class Inheritance1 {
    public static void main(String[] args) {

        // 자식 객체를 생성하면, 상속관계 있는 부모까지 포함해서 인스턴스가 생성된다.
        // (2가지의 클래스 정보가 공존)
        // petrolCar.move()를 호출하면 먼저 참조된 주소로 접근하여
        // 자식타입(자기자신
        PetrolCar petrolCar = new PetrolCar();
        petrolCar.move();
        petrolCar.charge();
        petrolCar.pushBreak();


        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.pushBreak();

        HydroCar hydroCar = new HydroCar();
        hydroCar.move();
        hydroCar.charge();
        hydroCar.pushBreak();
    }
}

package inheritance;

public class DmbCellPhone extends CellPhone{
    // 필드 (super클래스의 필드는 모두 가지고)
    String channel;    // 새로운 필드를 추가한다.

    @Override
    void bell() {
        super.bell();   // 부모 클래스의 메서드를 그대로 실행
    }

    // 매서드 superclass의 필드를 가지고
    void turnOnDmb() {
        System.out.println(channel + "번 DMB방송을 수신합니다.");
    }
}

package static0;

public class Obj {
    // 필드
    String name;    // 객체의 이름
    // int count;   // 인스턴스 멤버변수인 경우 : 개수가 공유되지 않는다.
    static int count;      // 객체의 개수
    // 메서드 영역의 static 영역에 저장되며, 모든 객체에서 공유되게 된다.

    // 생성자
    public Obj(String name) {
        this.name = name;       // 생성하면서 이름 초기화
        count++;                // 객체 갯수 증가
    }

    public int getCount() {
        return count;
    }
}

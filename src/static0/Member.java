package static0;

public class Member {
    // 필드
    private final String ID;        // 변경되지 않는 초기값
    private String name;

    // 생성자
    public Member(String id, String name) {
        this.ID = id;
        this.name = name;
    }

    public void modifyMember(String name) {
        // this.ID = 10;   // final 키워드로 컴파일 에러 발생 -> 컴파일 오류로 더 중대한 오류들을 조기에 막을 수 있다.
        this.name = name;
    }

    public void printMember() {
        System.out.println(ID);
        System.out.println(name);
    }
}

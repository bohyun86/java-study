package lambda.mr;

public class Member {
    private String id;
    private String name;

    public Member(String id) {
        this.id = id;
    }

    // 생성자
    public Member(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Member: " + id + " " + name + " 객체 생성하였습니다.");
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

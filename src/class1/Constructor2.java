package class1;

public class Constructor2 {
    public static void main(String[] args) {
        Member member1 = new Member("홍길동", 80, 30);
        Member member2 = new Member("이순신", 100, 35);
        // Member member3 = new Member(); // 생성자가 존재할 때, 입력값이 없는 생성자를 호출하면 컴파일 오류가 발생 -> 런타임 오류를 원천 차단. 제약을 줌
        Member member3 = new Member("임꺽정");

        Member[] members = {member1, member2, member3};

        for (Member member: members) {
            System.out.println("이름: " + member.name + ", 점수 : " + member.score + ", 나이 : " + member.age);

        }
    }
}


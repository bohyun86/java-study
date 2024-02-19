package class1;

public class Student {
    String name;    // 이름
    int score;      // 성적
    int age;        // 연령


    Student() {
        System.out.println("기본 생성자 호출");
    }

    public Student(String n, int s, int a) {
        name = n; // 이름을 다르게 사용한다
        score = s;
        age = a;


    }

    void changeAttribute(String n, int s, int a) {
        this.name = n;      // this 키워드를 사용한다
        this.score = s;
        this.age = a;

        //
        // this는 객체 자신을 참조하는 참조 변수
    }
}

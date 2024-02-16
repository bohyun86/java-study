package class0;

public class Class3 {
    public static void main(String[] args) {
        Student student1;           // Student 라는 타입의 변수를 선언
        student1 = new Student();   // Student 타입의 변수를 초기화, 객체를 생성, 인스턴스화
        student1.name = "홍길동";
        student1.score = 80;
        student1.age = 30;

        Student student2 = new Student();   // 선언과 초기화 같이 new 생성자로 인스턴스화
        student2.name = "임꺽정";             // .을 붙여서 필드에 접근 가능
        student2.score = 70;
        student2.age = 40;

        Student student3 = new Student();   // 선언과 초기화 같이 new 생성자로 인스턴스화
        student3.name = "이몽룡";             // .을 붙여서 필드에 접근 가능
        student3.score = 90;
        student3.age = 20;

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        students[0].name = "임창정";

        System.out.println(students[0].name);

    }
}

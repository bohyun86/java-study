package class1;

public class Constructor1 {
    public static void main(String[] args) {

        Student student1 = new Student("홍길동",80,30);

        Student student2 = new Student("임꺽정",70,40);

        Student student3 = new Student();
        student3.name = "이순신";
        student3.score = 90;
        student3.age = 35;

        Student student4 = new Student("이몽룡",90,20);
        student4.changeAttribute("이창섭",90,24);

        Student[] students = {student1, student2, student3, student4};

        for (Student student:students) {
            System.out.println("이름: " + student.name +", 점수 : " + student.score + ", 나이 : " + student.age);
        }
    }

    static void initStudent(Student student, String name, int score, int age) {
        student.name = name;
        student.score = score;
        student.age = age;
    }
}

package class0;

public class Class5 {
    public static void main(String[] args) {
        Student student1 = creatStudent("홍길동",80,30);
        Student student2 = creatStudent("임꺽정",70,40);
        Student student3 = creatStudent("이몽룡",90,20);

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (Student student:students) {
            printInformation(student);
        }
    }

    public static Student creatStudent(String name, int score, int age) {
        Student student = new Student();    // 생성된 객체(학생 타입의 인스턴스)는 힙에 던져짐
        student.name = name;
        student.score = score;
        student.age = age;
        return student;
    }

    public static void printInformation(Student student) {
        System.out.println("이름 :" + student.name + ", 성적 :" + student.score + ", 나이 :" + student.age);
    }
}

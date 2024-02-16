package class0;

public class Class4 {
    public static void main(String[] args) {
        Student student1 = initStudent("홍길동",80,30);

        Student student2 = initStudent("임꺽정",70,40);

        Student student3 = initStudent("이몽룡",90,20);

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (Student student:students) {
            printInformation(student);
        }


    }

    public static Student initStudent(String name, int score, int age) {
        Student student = new Student();
        student.name = name;
        student.score = score;
        student.age = age;
        return student;
    }

    public static void printInformation(Student student) {
        System.out.println("이름 :" + student.name + ", 성적 :" + student.score + ", 나이 :" + student.age);
    }
}

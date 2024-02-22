package inheritance.ex;

public class Student extends Person{
    String studentID;

    public Student(String name, int age, String studentID) {
        super(name, age);
        this.studentID = studentID;
    }

    @Override
    void introduce() {
        System.out.printf("안녕하세요. 제 이름은 %s입니다. 저는 %d살이고, 제 학번은 %s입니다.\n", name, age, studentID);
    }
}

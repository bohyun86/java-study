package inheritance.ex;

public class University {
    public static void main(String[] args) {
        Professor professor = new Professor("John Doe",40,"컴퓨터 과학");
        professor.introduce();

        Student student = new Student("Jane Smith",20,"20201234");
        student.introduce();

    }
}

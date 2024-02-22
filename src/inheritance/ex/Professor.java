package inheritance.ex;

public class Professor extends Person{
    private String department;

    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    void introduce() {
        System.out.printf("안녕하세요. 제 이름은 %s입니다. 저는 %d살이고, %s 학과에서 근무합니다.\n", name, age, department);
    }
}

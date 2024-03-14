package collection.set.compare;

public class Student implements Comparable<Student> {
    private static int lastStudentNo = 20240000;
    private int studentNo;
    private String name;
    private int age;
    private double height;

    public Student(String name, int age, double height) {
        this.studentNo = ++lastStudentNo;
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.studentNo - other.studentNo;
    }


}

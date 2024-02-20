package access_modifier.ex.com.school.management;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("변진섭","20200504");
        student.setName("홍길동");
        student.setStudentID("S1234");

        System.out.println("학생 이름 : " + student.getName() + "\n학생 ID : " + student.getStudentID());

    }
}

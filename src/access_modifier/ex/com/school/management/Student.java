package access_modifier.ex.com.school.management;

public class Student {
    private String name;
    private String studentID;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }
}

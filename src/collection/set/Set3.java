package collection.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Set3 {
    static class Student {
        String name;
        int age;

        public Student(String name, int age) {

        }

        public String toString() {
            return name + " " + age;
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            Student student = (Student) object;
            return age == student.age && Objects.equals(name, student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }


    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("홍길동", 30));
        studentSet.add(new Student("임꺽정", 40));
        studentSet.add(new Student("홍길동", 30));


        System.out.println("studentSet = " + studentSet);

        // 객체의 동등성을 비교하는 비즈니스 로직을 선택하여
        // equals 메서드와 hashCode 메서드를 오버라이딩하면
        // hashSet에서 해당 기준으로 중복 요소를 판단
    }
}

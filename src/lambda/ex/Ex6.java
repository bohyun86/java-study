package lambda.ex;

import java.util.function.Function;

public class Ex6 {
    public static void main(String[] args) {
        Student[] students = {
                new Student("홍길동", 90, 96),
                new Student("이몽룡", 95, 93)
        };

        double englishAverage = avg(students, Student::getEnglishScore);
        double mathAverage = avg(students, Student::getMathScore);

        System.out.printf("영어 평균 점수: %.1f\n", englishAverage);
        System.out.printf("수학 평균 점수: %.1f\n", mathAverage);
    }

    private static double avg(Student[] students, Function<Student, Integer> scoreFunction) {
        double sum = 0;
        for (Student student : students) {
            sum += scoreFunction.apply(student);
        }
        return sum / students.length;
    }
}

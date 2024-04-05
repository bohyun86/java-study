package quiz.quiz7;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class q1 {
    public static void main(String[] args) {
        record Employee(String name, String role, int salary) {}

        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Developer", 5000),
                new Employee("Bob", "Developer", 6000),
                new Employee("Charlie", "Manager", 7000),
                new Employee("David", "Manager", 8000)
        );

        // 모든 직원의 총 급여 계산하기
        int sum = employees.stream().mapToInt(Employee::salary).sum();
        System.out.println("총 급여: " + sum);

        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(Employee::role, Collectors.averagingDouble(Employee::salary)));

        collect.forEach((s, aDouble) -> {
            System.out.printf("%s 평균 급여: %.1f\n", s, aDouble);
        });


    }
}

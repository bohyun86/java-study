package stream.ex;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex12 {
    public static void main(String[] args) {
        record Employee(String name, String role, int salary) {
        }


        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "Developer", 5000),
                new Employee("Bob", "Developer", 6000),
                new Employee("Charlie", "Manager", 7000),
                new Employee("David", "Manager", 8000)
        );

        Integer sum = employees.stream().collect(Collectors.summingInt(Employee::salary));
        System.out.println("총 급여: " + sum);

        Map<String, Double> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::role, Collectors.averagingDouble(Employee::salary)));
        Double developer = collect.get("Developer");
        Double Manager = collect.get("Manager");

        System.out.printf("Developer 평균 급여: %.1f\n", developer);
        System.out.printf("Manager 평균 급여: %.1f\n", Manager);
    }
}

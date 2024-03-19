package lambda.ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex7 {
    /*
    연습문제 : 직원 필터링

    요구사항: List<Employee>에서 연봉(salary)이 50,000 이상인 직원만 필터링하여
    그 이름을 출력하세요. Predicate와 Consumer를 사용하여 구현하세요.
     Employee 클래스는 이름(name)과 연봉(salary) 필드를 가집니다.

    입력 데이터
    List<Employee> employees = Arrays.asList(
    new Employee("둘리", 70000), new Employee("희동", 40000), new Employee("마이클", 80000));

    출력 예시
    ===
    둘리
    마이클
     */
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("둘리", 70000), new Employee("희동", 40000), new Employee("마이클", 80000));

        Predicate<Employee> check = Employee -> Employee.salary >= 50_000;
        Consumer<Employee> name = Employee -> System.out.println(Employee.name);

        for (Employee employee : employees) {
            if (check.test(employee)) {
                name.accept(employee);
            }
        }

        employees
                .stream()
                .filter(check)
                .forEach(name);
    }
}
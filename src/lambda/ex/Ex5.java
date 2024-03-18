package lambda.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex5 {
    public static void main(String[] args) {
        List<Person> attendees = Arrays.asList(
                new Person("둘리", 22),
                new Person("희동이", 3),
                new Person("마이콜", 25),
                new Person("영희", 16)
        );

        List<String> list = new ArrayList<>();

        Predicate<Person> check = Person -> Person.age >= 18;
        Function<Person, String> function = Person -> Person.name;

        Supplier<List<String>> inviteListSupplier = () -> {
            List<String> invite = new ArrayList<>();
            attendees.stream().filter(check).map(function).forEach(invite::add);
            return invite;
        };

        List<String> inviteList = inviteListSupplier.get();


        System.out.println("\n초대된 참석자 명단: ");
        System.out.println(inviteList);
    }
}



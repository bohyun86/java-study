package collection.set.compare;

import java.util.TreeSet;

public class PersonMain {
    public static void main(String[] args) {
        TreeSet<Person> personTreeSet = new TreeSet<>();

        personTreeSet.add(new Person("홍길동",50));
        personTreeSet.add(new Person("홍길동",30));
        personTreeSet.add(new Person("홍길동",40));
        personTreeSet.add(new Person("홍길동",40));
        personTreeSet.add(new Person("홍길동",20));
        personTreeSet.add(new Person("가나다",30));
        personTreeSet.add(new Person("마바사",40));

        for (Person person : personTreeSet) {
            System.out.println(person.toString());
        }
    }
}

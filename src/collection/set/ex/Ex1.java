package collection.set.ex;

import java.util.HashSet;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        Set<String> list1 = new HashSet<>();

        list1.add("김철수");
        list1.add("이영희");
        list1.add("박지영");
        list1.add("김철수");
        list1.add("박지영");
        list1.add("박민수");
        list1.add("이영희");

        System.out.println(list1);



    }
}

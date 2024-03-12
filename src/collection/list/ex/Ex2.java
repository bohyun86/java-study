package collection.list.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Programming");
        System.out.println(stringList);


        // 역순으로 for문 접근
        // 삭제시 i 값 -1 적용
        // iterater를 사용
        Iterator<String> iterator = stringList.iterator();

        while (iterator.hasNext()) {
            String i = iterator.next();
            if (i.length() <= 5) {
                iterator.remove();
            }
        }

        System.out.println(stringList);
    }
}

package collection.list;

import java.util.ArrayList;

public class Iterator {
    // 컬렉션 프레임워크의 주요 인터페이스 -> java.util.Iterator (반복자)
    // java.lang.Iterable 인터페이스를 구현한 클래스에서 사용 (반복가능한)
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        java.util.Iterator<Integer> stringIterator = numbers.iterator();


    }
}

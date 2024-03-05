package library.lang;

// 자바 Record
// 자바 14버전부터 새롭게 도입된 데이터 구조
// VO(Value Object) 객체 또는 DTO(Data transfer Object)를 작성할 때
// 불변하는 데이터 객체를 간단하게 정리해주는 자료구조
record Human(String name, int age) {}

// 컴파일러가 자동으로 기본생성자, getter, equals, hashCode, toString을 생성
public class Record {
    public static void main(String[] args) {
        Human human = new Human("홍길동",30);

        int age = human.age();
        String name = human.name();
        System.out.println(human.toString());

        Human human2 = new Human("홍길동", 30);
        Human human3 = new Human("홍길동", 40);

        System.out.println(human.equals(human2));
        System.out.println(human.equals(human3));

        System.out.println(human.hashCode());
        System.out.println(human2.hashCode());
        System.out.println(human3.hashCode());

    }
}

// 레코드는 final 키워드가 적용이 되어 더 이상 상속되지 않는다.

//class StrongHuman extends Human {
//    public StrongHuman(String name, int age) {
//        super(name, age);
//    }
//}
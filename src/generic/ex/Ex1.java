package generic.ex;

public class Ex1 {
    public static void main(String[] args) {
        // Integer와 String 타입을 가진 Pair 객체 생성
        Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
        System.out.println("Pair 1: " + pair1.getKey() + " - " + pair1.getValue());

        // String과 Boolean 타입을 가진 Pair 객체 생성
        Pair<String, Boolean> pair2 = new Pair<>("KeyExists", true);
        System.out.println("Pair 2: " + pair2.getKey() + " - " + pair2.getValue());
    }
}



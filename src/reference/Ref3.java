package reference;

public class Ref3 {
    public static void main(String[] args) {
        Data data1 = new Data();        // 데이터 생성하여 참조값을 data1에 저장
        data1.value1 = 10;
        Data data2 = data1;             // 객체의 위치를 가리키는 참조값을 복사한다.

        int a = 10, b = 20;
        int sum = a + b;            // 기본 타입은 연산이 가능하다

        // int datasum = data1 + data2; // 참조 타입은 기본적으로 연산이 불가능하다.

        System.out.println(data1.value1 + " " + data2.value1);  // 참조 타입의 기본 타입 필드에 접근하면 연산 가능
    }
}

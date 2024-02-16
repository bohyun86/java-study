package reference;

public class Ref4 {
    public static void main(String[] args) {
        // 기본타입
        int a = 10;
        int b = a;      // 값이 복사되어 대입

        System.out.println("a = " + a);     // 10
        System.out.println("b = " + b);     // 10

        a = 20;     // a 값을 변경

        System.out.println("a = " + a);     // 20
        System.out.println("b = " + b);     // 10

        b = 100;

        System.out.println("a = " + a);     // 20
        System.out.println("b = " + b);     // 100

        // 참조타입

        Data data1 = new Data();
        data1.value1 = 100;
        Data data2 = data1;     // 값(= 참조값)이 복사되어 대입: 얕은 복사 (객체가 복사된 것이 아니라, 주소가 복사됨)

        System.out.println("data1 = " + data1);      // 참조값 0x10
        System.out.println("data2 = " + data2);      // 참조값 0x10

        System.out.println("data1 = " + data1.value1);      // 100
        System.out.println("data2 = " + data2.value1);      // 100

        // A의 값이 변경
        data1.value1 = 200;

        System.out.println("data1 = " + data1.value1);      // 200
        System.out.println("data2 = " + data2.value1);      // 200

        data2.value1 = 300;

        System.out.println("data1 = " + data1.value1);      // 300
        System.out.println("data2 = " + data2.value1);      // 300

    }
}

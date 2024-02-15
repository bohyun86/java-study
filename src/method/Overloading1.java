package method;

public class Overloading1 {
    public static void main(String[] args) {

        int intAdd;
        double doubleAdd;

        intAdd = add(3, 4);
        System.out.println("intAdd = " + intAdd); // 두 수를 더하기
        intAdd = add(3,4,5);
        System.out.println("intAdd = " + intAdd); // 세 수를 더하기
        doubleAdd = add(3.0,4.0);
        System.out.println("doubleAdd = " + doubleAdd); // doulbe type 더하기

    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static double add(double x, double y) {
        return x + y;
    }
    /*
    ## 메서드 오버로딩
    - 같은 이름의 메서드를 여러개 정의하는 것
    - 메서드의 이름은 같지만, 매개변수의 개수가 다르거나, 타입이 다르면 오버로딩이 가능하다.
    - 메서드의 이름이 같아도, 타입의 순서가 다르면 오버로딩이 가능하다.
    - 리턴 타입만 다를 경우에는 오버로딩이 되지 않는다.
    - 오버로딩된 메서드는 모두 같은 클래스 내에서만 만들어져야 된다.
     */
}

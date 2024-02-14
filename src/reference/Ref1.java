package reference;

public class Ref1 {
    public static void main(String[] args) {    // 매소드 영역 -> 스택 영역

        // int는 기본타입
        int int1 = 10;  // 변수 선언, 초기화 -> 스택 영역 : 10
        int int2 = 10;

        // 문자열은 참조타입 : 힙 영역 0x100 : "홍길동"
        String str1 = "홍길동";    // 변수 선언, 초기화 -> 스택 영역
        String str2 = "홍길동";

        boolean resultInt;
        resultInt = int1 == int2;
        System.out.println(resultInt);

        boolean resultStr;
        resultStr = str1 == str2;
        System.out.println(resultStr);

        String str3 = new String("홍길동"); // 스택영역 0x200
        String str4 = new String("홍길동"); // 스택영역 0x300

        // ==, != 연산은 변수의 값이 같은지 아닌지를 비교
        // 참조타입의 경우 동일한 객체를 참조하는지 아닌지를 비교
        boolean resulteStr2 = str3 == str4; // 0x200 == 0x300
        System.out.println("resulteStr2 = " + resulteStr2);

        // 문자열을 비교할 때는 가능하면 equals 매소드를 사용할 것!
        if (str3.equals(str4)) {    // 문자열 내부값을 비교할 때는 equals 사용
            System.out.println("str3, str4는 문자열이 같음");
        }
    }
}

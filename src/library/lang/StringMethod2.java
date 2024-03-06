package library.lang;

public class StringMethod2 {
    public static void main(String[] args) {
        String str = "오늘은 3월 6일, 곧 점심시간이네요.";

        // charAt: (인덱스)번째 문자를 반환
        char c1 = str.charAt(0);
        System.out.println("c1 = " + c1);
        char c2 = str.charAt(0);
        char cLast = str.charAt(str.length() - 1);
        System.out.println("cLast = " + cLast);

        String sentence = "대한사람 대한으로 길이보전하세. 대한독립 만세!";

        // indexOf 문자열에서 index 위치를 int로 변환
        int i1 = sentence.indexOf("대한");        // 문자열의 시작위치부터 찾게 된다.
        int i2 = sentence.indexOf("대한",3);  // 2번째 인자 인덱스 위치부터 찾아서 처음 발견하는 위치 반환
        int i3 = sentence.lastIndexOf("대한");  // 끝에서부터 찾아서 발견한 인덱스 반환
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);

    }
}

package library.lang;

public class StringMethod6 {
    public static void main(String[] args) {
        // repeat: count 횟수만큼 문자열 반복
        String bell = "딸랑";

        System.out.println(bell.repeat(2));
        System.out.println(bell.repeat(4));
        System.out.println(bell.concat(" ").repeat(3).trim());

        // substring: 문자열 지정된 부분 문자열 반환
        String substring = "안녕하세요".substring(2, 5);
        String substring2 = "안녕하세요".substring(0,2);
        String substring3 = "안녕하세요".substring(2);
        System.out.println(substring);
        System.out.println("안녕");
        System.out.println(substring3);

        String sentence1 = "무궁화 꽃이 피었습니다.";
        System.out.println(sentence1.substring(2,sentence1.indexOf("꽃")));
        System.out.println(sentence1.indexOf("꽃"));

    }
}

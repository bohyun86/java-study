package array;

public class Array3 {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[] {100, 90, 50, 60, 70};   // 배열 초기화 5개 길이
        
        int[] scores2 = {100, 90, 80};    // 선언과 초기화 동시에
        
        for (int i = 0; i < scores.length; i++) {
            System.out.println("i = " + i);
        }

        System.out.println(scores2);
        // 배열에 직접 접근하게 될 경우
        // 배열의 내용에 접근하고 싶을 때는 배열[index]로 접근한다.
        // i 정수형 배열 -> 해당 메모리번지에 참조됨
        System.out.println(scores2[0]);
        /* 배열의 값을 읽는 순서
        1. 변수의 값을 읽는다 -> 참조값
        2. 변수의 참조값을 통해 실제 배열에 접근
        3. 인덱스를 통해 해당 위치 내용에 접근하고 내용을 읽어옴
         */
    }
}

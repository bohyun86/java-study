package array;

public class Array2 {
    public static void main(String[] args) {
        // 배열: 같은 타입의 변수를 반복적으로 선언할 때
        // 동일한 타입을 연속된 메모리 공간에 저장하는 자료 구조

        int[] scores;    // int 타입의 배열 변수를 선언
        scores = new int[6]; // 배열 생성

        // 배열의 값을 초기화
        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 50;
        scores[3] = 60;
        scores[4] = 70;
        scores[5] = 80;
        
        //scoress[5] = 80; // 배열을 초기화하지 않으면, 자동으로 초기값으로 초기화된다.
        // 기본타입의 초기값: 숫자는 0, 실수는 0.0, boolean은 false
        // 참조타입으 ㅣ초기값: null

        System.out.println("1번 점수 : " + scores[0]);
        System.out.println("2번 점수 : " + scores[1]);
        System.out.println("3번 점수 : " + scores[2]);
        System.out.println("4번 점수 : " + scores[3]);
        System.out.println("5번 점수 : " + scores[4]);
        System.out.println("6번 점수 : " + scores[5]);

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d번째 점수는 %d\n",(i + 1), scores[i]);
        }
    }
}

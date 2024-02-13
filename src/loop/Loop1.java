package loop;

import java.util.Arrays;

public class Loop1 {
    public static void main(String[] args) {
        /* 반복문 while
        while (조건식) {
            // 조건식이 true 일때 코드 반복
            // 조건식이 false 일때 while문 벗어남
            // 조건식이 false가 되는 경우가 없으면 무한 반복
         */
        int count1 =- 0;

        while (count1 < 100) {  // 조건식
            count1++;   // 증감식
            System.out.println("count1 = " + count1);
        }
    }
}

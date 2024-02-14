package array;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // 배열에서 최대값과 최소값을 구하기
        // 정수를 n개 입력받아 배열에 저장하고, 그 중 가장 큰 수와 가장 작은 수를 구하는 프로그램을 작성해 보세요.

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 4개를 입력하세요.");
        int[] intArray = new int[4];
        int maxValue = 0, minValue = 0;

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            if (minValue == 0) {
                minValue = intArray[i];
            }

            if (maxValue < intArray[i]) {
                maxValue = intArray[i];
            }

            if (minValue > intArray[i]) {
                minValue = intArray[i];
            }
        }
        System.out.println("최대값 :" + maxValue + ", " + "최소값 :" + minValue);

    }
}

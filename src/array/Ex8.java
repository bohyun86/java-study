package array;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        // 이진탐색 binarySearch
        // 숫자가 정렬된 배열이 있습니다. 배열을 반으로 나누고,
        // 목표값이 있는 방향으로 다시 반으로 나누는 방식으로 목표값을 찾는 알고리즘을
        // 구현해보세요.
        // 시간복잡도가 최악의 경우 O(log n) : 만큼 박복하여 값을 찾는다.
        // 배열의 크기가 커질수록 선형탐색보다 훨씬 효율적으로 탐색을 한다.
        int[] intArray = {1, 3, 4, 5, 6, 7, 8, 9, 12, 15, 16, 17, 18, 20};
        Scanner scanner = new Scanner(System.in);
        int targetValue = scanner.nextInt();
        int midValue;
        int firstValue = 0;
        int lastValue = intArray.length - 1;
        boolean check = false;


        while (firstValue <= lastValue) {
            midValue = (firstValue + lastValue) / 2;
            if (intArray[midValue] == targetValue) {
                System.out.println("타겟 숫자가 " + (midValue + 1) + "번째에 존재합니다. ");
                check = true;
                break;
            } else if (intArray[midValue] > targetValue) {
                lastValue = midValue - 1;
            } else {
                firstValue = midValue + 1;
            }
        }
        if (!check) {
            System.out.println("같은 값이 존재하지 않습니다.");
        }
    }
}

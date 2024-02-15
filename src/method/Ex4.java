package method;

public class Ex4 {
    public static void main(String[] args) {
        // 배열에서 최소값과 최대값 찾기
        // 배열 내의 최소값과 최대값을 찾아 출력하는 메소드 findMinAndMax를 작성하세요.
        int[] arrayInt = {5, 4, 15, 13, 9};
        findMinAndMax(arrayInt);

    }

    public static void findMinAndMax(int[] array) {
        int min = array[0];
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }

            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println("최소값 : " + min + ", 최대값 : " + max);
    }

}
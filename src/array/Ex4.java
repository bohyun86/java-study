package array;

public class Ex4 {
    public static void main(String[] args) {
        // 2차원 배열의 합계 구하기
        // 2차원 정수 배열을 선언하고 모든 요소의 합계를 계산하는 프로그램을 만드세요.
        
        int[][] multipleArray = new int[2][3];
        
        int i = 1;
        for (int rows = 0; rows < multipleArray.length; rows++) {
            for (int columns = 0; columns < multipleArray[rows].length; columns++) {
                multipleArray[rows][columns] = i++;
            }
        }

        int sum = 0;
        for (int[] rows:multipleArray) {
            for (int columns:rows) {
                sum += columns;
            }
        }

        System.out.println("sum = " + sum);
    }
}

package array;

public class Array5 {
    public static void main(String[] args) {
        int[][] multipleArray = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int row = 0; row < multipleArray.length; row++) {
            for (int column = 0; column < multipleArray[row].length; column++) {
                System.out.println("값 출력: " + multipleArray[row][column]);
            }
        }

    }
}

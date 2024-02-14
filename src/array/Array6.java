package array;

public class Array6 {
    public static void main(String[] args) {
        int[][] multipleArray = new int[3][2];

        int i = 1;
        for (int rows = 0; rows < multipleArray.length; rows++) {
            for (int columns = 0; columns < multipleArray[rows].length; columns++) {
                multipleArray[rows][columns] = i++;
            }
        }

        for (int[] rows : multipleArray) {
            for (int columns : rows) {
                System.out.println("값 출력: " + columns);
            }
        }
    }
}
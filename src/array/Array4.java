package array;

public class Array4 {
    public static void main(String[] args) {
        int[][] multipleArray = new int[2][3];  // 2행 3열

        // 다차원 배열 초기화
        multipleArray[0][0] = 1;    // 0행 1열
        multipleArray[0][1] = 2;    // 0행 2열
        multipleArray[0][2] = 3;    // 0행 3월
        multipleArray[1][0] = 4;    // 1행 1열
        multipleArray[1][1] = 5;    // 1행 2열
        multipleArray[1][2] = 6;    // 1행 3열

        // 1행 출력
       System.out.print(multipleArray[0][0] + " ");
        System.out.print(multipleArray[0][1] + " ");
        System.out.print(multipleArray[0][2] + " \n");

        // 2행 출력
        System.out.print(multipleArray[1][0] + " ");
        System.out.print(multipleArray[1][1] + " ");
        System.out.print(multipleArray[1][2] + " ");

        for (int row = 0; row < multipleArray.length; row++) {
            for (int coloum = 0; coloum < multipleArray[row].length; coloum++) {
                System.out.println("값 출력: " + multipleArray[row][coloum]);
            }
        }

    }
}

package static0.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int num:array) {
            sum += num;
        }
        return sum;
    }

    static double average(int[] array) {
        int sum = 0;
        for (int num:array) {
            sum += num;
        }
        return sum / (double) array.length;

    }
    static int min(int[] array) {
        int min = array[0];
        for (int num:array) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }
    static int max(int[] array) {
        int max = array[0];
        for (int num:array) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

}

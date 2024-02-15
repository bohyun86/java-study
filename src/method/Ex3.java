package method;

public class Ex3 {
    public static void main(String[] args) {
        // 정수 배열의 평균 구하기
        int[] numbers = {5, 10, 15};    // 변경해보세요.
        System.out.println(calculateAverage(numbers));
    }

    public static double calculateAverage(int[] numbers) {
        double sum = 0;
        for (int number:numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}
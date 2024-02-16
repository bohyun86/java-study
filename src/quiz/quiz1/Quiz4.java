package quiz.quiz1;

public class Quiz4 {
    public static void main(String[] args) {
        int[] numbers = {54, 32, 21, 6, 24, 3, 100, -5};

        findMinAndMax(numbers);
    }

    public static void findMinAndMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];

        for (int number: numbers) {
            if (min > number) {
                min = number;
            }

            if (max < number) {
                max = number;
            }
        }

        System.out.printf("최소값 : " + min + ", 최대값 : " + max);
    }
}

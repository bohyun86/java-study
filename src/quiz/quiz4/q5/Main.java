package quiz.quiz4.q5;

public class Main {
    public static void main(String[] args) {
        String input = "데이터 분석과 프로그래밍은 매우 재미있어요";
        String[] words = input.split(" ");
        int maxLength = 0;
        String maxLengthWord = "";
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                maxLengthWord = word;
            }
        }
        System.out.println(maxLengthWord);
    }
}

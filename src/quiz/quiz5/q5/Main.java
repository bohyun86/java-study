package quiz.quiz5.q5;

public class Main {
    public static void main(String[] args) {
        String date = "202403320";
        String years = date.substring(0,4);
        String months = date.substring(4,6);
        String days = date.substring(6,8);

        System.out.println(years + "-" + months + "-" + days);
    }
}

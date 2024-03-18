package lambda.ex;

import java.util.function.Function;

public class Ex2 {
    public static void main(String[] args) {
        Function<String, String> modifiedDate =
                date -> String.format("%s-%s-%s", date.substring(0, 4), date.substring(4, 6), date.substring(6, 8));

        System.out.println(modifiedDate.apply("20240320"));
    }
}

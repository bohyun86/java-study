package library.lang.ex8;

import java.io.PrintStream;

public class Ex8 {
    public static void main(String[] args) {

        PrintStream err = System.err;
        System.err.println("에러가 발생했습니다.");
        System.out.println(args.length);
        if (args.length > 1) {
            System.exit(1);
        } else {
            System.exit(0);
        }
    }
}

package library.lang.ex.ex6;

import java.util.Map;

public class Ex6 {
    public static void main(String[] args) {
        String env = System.getenv("HOME");
        System.out.println("사용자 홈 디렉토리: " + env);
    }
}

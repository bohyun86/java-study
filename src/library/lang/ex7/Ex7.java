package library.lang.ex7;

public class Ex7 {
    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        String name = System.getProperty("os.name");
        String dir = System.getProperty("user.dir");

        System.out.println("자바 버전: " + version);
        System.out.println("운영 체제: " + name);
        System.out.println("사용자 작업 디렉토리: " + dir);

    }
}

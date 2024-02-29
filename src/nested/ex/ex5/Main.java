package nested.ex.ex5;

public class Main {
    public static void main(String[] args) {
        Anonymous annoy = new Anonymous();
        //익명 객체 필드 사용
        annoy.field.start();
        //익명 객체 로컬변수 사용
        annoy.method1();
        //익명 객체 매개값 사용
        annoy.method2(new Worker() {
            @Override
            void start() {
                System.out.println("테스트를 합니다.");
            }
        });
    }
}

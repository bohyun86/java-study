package access_modifier.first;

public class MainInner {
    public static void main(String[] args) {
        Data data = new Data();

        // 필드 접근:
        data.publicData = 1000;
        data.defaultData = 1000;
        // data.privateData = 1000;

        // 메서드 호출 :
        data.publicMethod();
        data.defaultMethod();
        // data.privateMethod();
    }
}

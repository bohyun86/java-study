package access_modifier.first;

public class Data {
    public int publicData;
    int defaultData;
    private int privateData;

    public void publicMethod() {
        System.out.println("Data.publicMethod");
    }

    void defaultMethod() {
        System.out.println("Data.defaultMethod");
    }


    private void privateMethod() {
        System.out.println("Data.privateMethod");
    }

    void innerAccess() {
        // 필드 접근: 모두 접근 가능
        publicData = 1000;
        defaultData = 1000;
        privateData = 1000;
        // 메서드 호출 : 모두 호출 가능
        publicMethod();
        defaultMethod();
        privateMethod();
    }
}

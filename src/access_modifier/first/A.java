package access_modifier.first;

public class A {
    // 내부에서 접근
    A publicA = new A(1);   // public 내부 접근 가능
    A defaultA = new A(); // default 내부 접근 가능
    A privateA = new A(1.0); // private 내부 접근 가능



    public A(int a) {
        System.out.println("public A 생성");
    }

    private A(double a) {
        System.out.println("private A 생성");
    }

    protected A(long a) {
        System.out.println("protected A 생성");
    }

    A() {
        System.out.println("default 클래스 A 생성");
    }
}

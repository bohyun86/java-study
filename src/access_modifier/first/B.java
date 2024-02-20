package access_modifier.first;


public class B {

    // 같은 패키지에서 접근
    A publicA = new A(1);   // public  접근 가능
    A defaultA = new A(); // default  접근 가능
    // A privateA = new A(1.0) // private  접근 불가

    A a = new A(); // 같은 패키지 내부에서는 default 접근 가능
}

package static0;

public class Static2 {
    public static void main(String[] args) {
        Obj obj1 = new Obj("객체1");
        System.out.println(obj1.getCount());
        Obj obj2 = new Obj("객체2");
        System.out.println(obj2.getCount());
        Obj obj3 = new Obj("객체3");
        System.out.println(obj3.getCount());

        // static 변수(=클래스 변수)는 클래스를 통해 접근 가능하다.
        System.out.println("객체의 갯수: " + Obj.count);

    }
}

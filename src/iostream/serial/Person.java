package iostream.serial;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    // serialVersionUID : 직렬화하여 주고받을 해당 클래스의 버전
// 객체를 보낼쪽과 받을 쪽의 명시된 클래스의 내용이 다를 경우를 대비
// 직접 지정하지 않으면 자동으로 생성
    @Serial
    private static final long serialVersionUID = 1;
    private String name;
    private int age;
    private double height;
    private boolean married;

    private double weight;

    private Career career;

    public Person(String name, int age, double height, boolean married, double weight, Career career) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
        this.weight = weight;
        this.career = career;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", married=" + married +
                ", weight=" + weight +
                ", career=" + career +
                '}';
    }
}

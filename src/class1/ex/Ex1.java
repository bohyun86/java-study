package class1.ex;

public class Ex1 {
    public static void main(String[] args) {
        // Person 클래스를 설계해주세요.
        // 필드 : name, age, gender
        // 생성자: 모든 속성을 초기화하는 생성자, 이름, 성별만 초기화하는 생성자
        // 메서드 : 필드 정보를 출력하는 pringtInfo()

        // main 메서드에서 사용해보세요.
        Person person1 = new Person("이회창",60,"남");
        Person person2 = new Person("김대중","남");

        person1.printInfo();
        person2.printInfo();
    }
}

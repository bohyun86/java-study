package nested;

public class OuterClass {
    // 정적 중첩 클래스
    static class NestedStaticClass {
        // 정적 중첩 클래스 내부 메서드
        public void printMessage() {
            System.out.println("정적 중첩 클래스의 메시지입니다.");
        }
    }

    // Inner Class 외부 클래스의 인스턴스에 종속적인 클래스

    public class InstanceInnerClass {
        void printMessage() {
            System.out.println("뭐지?");
        }

        public void displayMessage() {
            // 메서드 지역 내부에서 선언되었으며, 메서드 내부에서만 사용할 수 있다.
            class localClass {
                void printMessage() {
                    System.out.println("지역 클래스의 메시지입니다.");
                }
            }
        }
    }
}

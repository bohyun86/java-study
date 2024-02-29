package nested.anonymous_interface;

public class RemoteMain {
    public static void main(String[] args) {
        RemoteControl audioRemote = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("오디오를 켭니다.");
                volumeUP();     // 익명 객체 내부에서 호출 가능
            }

            public void volumeUP() {
                System.out.println("볼륨을 올립니다.");
            }
        };

        Anonymous anonymous = new Anonymous();

        anonymous.method();
        audioRemote.turnOn();

        // 익명 객체 외부에서 내부에서 지정한 메서드 호출 불가


        // 매개변수를 통한 익명 구현 객체 생성
        anonymous.methodParam(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("마마마");
            }
        });

    }

}
